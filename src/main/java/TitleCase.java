import java.util.*;

public class TitleCase {
  public static void main( String[] args ) {
  }
  public String toTitleCase( String yourPhrase ) {
    ArrayList<String> capWords = new ArrayList<String>();
    String capString = " ";
    String[] words = yourPhrase.split( " " );
    for ( Integer i = 0; i < words.length; i++ ) {
      Character ch = Character.toUpperCase( words[i].charAt(0) );
      capWords.add( ch + words[i].substring(1) );
      capString = String.join(" ", capWords);
    }
    return capString;
 }
}
