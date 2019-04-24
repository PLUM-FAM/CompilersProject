import org.antlr.v4.runtime.*;
import java.io.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class CompilerDriver 
{
    public static void main(String[] args) throws Exception
    {
        File file = new File(args[0]);
        FileInputStream fis = null;

        String outputText = "";

        try {
            
            fis = new FileInputStream(file);
            CharStream stream = new ANTLRInputStream(fis);
            PlumLexer lexer = new PlumLexer(stream);
            Vocabulary vocab = lexer.getVocabulary();

            CommonTokenStream tokens = new CommonTokenStream(lexer); //initialize a common token stream from the lexer
            PlumParser parser = new PlumParser(tokens);
            // Listener for step 3.
            //OurPlumListener listener = new OurPlumListener();

            // Listener for step 4.
            OurPlumListenerIR listener = new OurPlumListenerIR();


            //loop to remove any printing of errors (we only want accepted/not accepted to output for grading)
            for(int i=0; i<parser.getErrorListeners().size(); i++)
            {
	            parser.removeErrorListener(parser.getErrorListeners().get(i));
            }

            //Part 4 code for grading format. (Using OurPlumListenerIR class)
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, parser.r());
            OurSymbolTable sTable = listener.getSymbolTable();

            listener.printIR();
            TinyGenerator tinyGenerator = new TinyGenerator(listener.getIRList(), sTable);
            
            
	        tinyGenerator.printTiny();

            
            // //Walker and Symbol table for part 3.
            // ParseTreeWalker walker = new ParseTreeWalker();
            // walker.walk(listener, parser.r());
            // OurSymbolTable sTable = listener.getSymbolTable();
            // sTable.printSymbolTable();
            // //extra print line for pretty formatting.
            // System.out.println(); 

            
            
            //Part 2 code for grading.
            //parser.r();   //function with the same name as your top-level construct (probably program) on that parser to parse your input.

            //print accepted/non-accepted
            // if(parser.getNumberOfSyntaxErrors()>0)
            // {
            //     System.out.println("Not accepted");
	        // }
            // else
            // {
	        // 	System.out.println("Accepted");
            // }
            
            

            //close file input stream
            fis.close();
        } catch(IOException e){}
    }
}