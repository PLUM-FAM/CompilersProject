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
            while(true) 
            {
                Token token = lexer.nextToken();
                if(token.getType() == Plum.EOF) 
                {
                    break;
                }
                System.out.println(token.getType() + " :: " + token.getText());

            }
        } catch(IOException e){}
    }
}