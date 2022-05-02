import java.util.ArrayList;
import java.util.Arrays;

/**
 * DelimitersTester contains a main method to test a Delimiters object.
 * 
 * The tester constructs various Delimiters objects, invokes the 
 * getDelimitersList and isBalanced methods, and prints the results.
 */
public class DelimitersTester {
  public static void main(String[] args) {
    Delimiters braces = new Delimiters("{", "}");
    String[] bracesTokens = {"{", "x + y", "}", " * 5"};
    System.out.println(braces.getDelimitersList(bracesTokens));
    
    Delimiters htmlQuote = new Delimiters("<q>", "</q>");
    String[] quoteTokens = {"<q>", "yy", "</q>", "zz", "</q>"};
    System.out.println(htmlQuote.getDelimitersList(quoteTokens) + "\n");
    
    Delimiters htmlSuperscript = new Delimiters("<sup>", "</sup>");
    
    ArrayList<String> htmlSuperscriptDelimiters1 = new ArrayList<String>
      (Arrays.asList("<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"));
    System.out.println(htmlSuperscript.isBalanced(htmlSuperscriptDelimiters1));
    
    ArrayList<String> htmlSuperscriptDelimiters2 = new ArrayList<String>
      (Arrays.asList("<sup>", "</sup>", "</sup>", "<sup>"));
    System.out.println(htmlSuperscript.isBalanced(htmlSuperscriptDelimiters2));
    
    ArrayList<String> htmlSuperscriptDelimiters3 = new ArrayList<String>
      (Arrays.asList("</sup>"));
    System.out.println(htmlSuperscript.isBalanced(htmlSuperscriptDelimiters3));
    
    ArrayList<String> htmlSuperscriptDelimiters4 = new ArrayList<String>
      (Arrays.asList("<sup>", "<sup>", "</sup>"));
    System.out.println(htmlSuperscript.isBalanced(htmlSuperscriptDelimiters4));
  }
}