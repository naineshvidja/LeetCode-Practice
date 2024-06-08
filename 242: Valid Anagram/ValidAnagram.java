import java.util.Arrays;
class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        Arrays.sort(ss);
        Arrays.sort(tt);

        return Arrays.equals(ss,tt);
    }
  public static void main(String[] args)
  {
    boolean answer;
    String s="anagram";
    String t="nagaram";
    answer=ValidAnagram.isAnagram(s,t);

    System.out.println(answer);
}
