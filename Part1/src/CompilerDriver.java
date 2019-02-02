import org.antlr.v4.runtime.*;
import java.io.*;

public class CompilerDriver 
{
    public static void main(String[] args) throws Exception
    {
        String fileName = args[0];
        File file = new File(fileName);
        FileInputStream fis = null;
        try{
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
                if(tokenType != "WS")
                {
                    System.out.println("Token type: " + vocab.getDisplayName(token.getType()));
                    System.out.println("Value: " + token.getText());
                }

            }
        } catch(IOException e){}
    }
}