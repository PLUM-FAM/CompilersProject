import org.antlr.v4.runtime.*;
import java.io.*;

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

            //loop to remove any printing of errors (we only want accepted/not accepted to output for grading)
            for(int i=0; i<parser.getErrorListeners().size(); i++)
            {
	            parser.removeErrorListener(parser.getErrorListeners().get(i));
            }
            

            parser.r();   //function with the same name as your top-level construct (probably program) on that parser to parse your input.

            //print accepted/non-accepted
            if(parser.getNumberOfSyntaxErrors()>0)
            {
                System.out.println("Not accepted");
	        }
            else
            {
	        	System.out.println("Accepted");
            }
            

            //close file input stream
            fis.close();
        } catch(IOException e){}
    }
}