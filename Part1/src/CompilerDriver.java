import org.antlr.v4.runtime.*;

public class CompilerDriver {
  public static void main(String[] args) throws Exception {
    String src = "BEGIN END 3.14159 42 FOO";
    Plum lexer = new Plum(new ANTLRInputStream(src));
    while(true) {
      Token token = lexer.nextToken();
      if(token.getType() == Plum.EOF) {
        break;
      }
      System.out.println(token.getType() + " :: " + token.getText());
    }
  }
}