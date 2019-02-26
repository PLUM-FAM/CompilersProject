import org.antlr.v4.runtime.*;
import java.io.*;

public class CompilerDriver 
{
    public static void main(String[] args) throws Exception
    {
        String fileName = args[0];
        File file = new File(fileName);
        FileInputStream fis = null;

        try {
        
            String beforeDot = fileName.split("\\.")[0];        
            fis = new FileInputStream(file);
            ANTLRInputStream stream = new ANTLRInputStream(fis);
            Plum lexer = new Plum(stream);
            Vocabulary vocab = lexer.getVocabulary();
            while(true)
            {
                Token token = lexer.nextToken();
                if(token.getType() == Plum.EOF) 
                {
                    break;
                }

                String tokenType = vocab.getDisplayName(token.getType());
                String tokenText = token.getText();
                
                System.out.println("Token Type: " + tokenType);
                System.out.println("Value: " + tokenText);
            }
        } catch(IOException e){}
    }
}