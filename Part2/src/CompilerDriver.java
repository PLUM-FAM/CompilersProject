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
        
            //String beforeDot = fileName.split("\\.")[0];        

            fis = new FileInputStream(file);
            CharStream stream = new ANTLRInputStream(fis);
            Plum lexer = new Plum(stream);
            Vocabulary vocab = lexer.getVocabulary();

            CommonTokenStream tokens = new CommonTokenStream(lexer); //initialize a common token stream from the lexer
            PlumParser parser = new PlumParser(tokens);

            //?
            // for(int i=0; i<parser.getErrorListeners().size(); i++){
	        // 	parser.removeErrorListener(parser.getErrorListeners().get(i));
            // }
            

            parser.r();   //function with the same name as your top-level construct (probably program) on that parser to parse your input.
            
            //print accepted/non-accepted
            if(parser.getNumberOfSyntaxErrors()>0){
                System.out.println("Not accepted");
                System.out.println(parser.getNumberOfSyntaxErrors());
	        }
	        else{
	        	System.out.println("Accepted");
            }
            

           
            fis.close();
        } catch(IOException e){}
    }
}