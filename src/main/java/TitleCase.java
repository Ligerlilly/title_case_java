public class TitleCase {
  public static void main(String[] args) {
  }
  public String toTitleCase(String yourPhrase) {
    String word = "";
    String[] words = yourPhrase.split(" ");
    for (Integer i = 0; i < words.length; i++) {
      Character ch = Character.toUpperCase(words[0].charAt(0));
      word = ch + words[i].substring(1);
      return word;
    }
    return word;
 }
}
