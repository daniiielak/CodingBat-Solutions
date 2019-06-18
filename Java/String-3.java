/*
 * Name: String-3.java
 * @autor: Daniela Kepper
 * Date: 17.06.2019
 * Description: this java class provides my solutions for the Java String-1 exercises of Coding Bat: http://codingbat.com/java/String-2
 */

public class String-3 {

  // countYZ -> Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
  // eg. 1. countYZ("fez day") → 2 || 2. countYZ("day fez") → 2 || 3. countYZ("day fyyyz") → 2
  public int countYZ(String str) {
    int count = 0;
    int blankCount = 0;
    String checkWords = " ";
    for(int i = 0; i<str.length(); i++){
      boolean isLetter = Character.isLetter(str.charAt(i));
      if(str.charAt(i)!=' ' && isLetter){
        checkWords+= str.charAt(i);
      }
      else{
        if(i!=0 && Character.toLowerCase(checkWords.charAt(checkWords.length()-1))=='y' || Character.toLowerCase(checkWords.charAt(checkWords.length()-1))=='z'){
          count++;
          blankCount++;
          checkWords = " ";
        }
      }
    }
    if(Character.toLowerCase(str.charAt(str.length()-1))=='y' || Character.toLowerCase(str.charAt(str.length()-1))=='z'){
        count++;
      }
    return count;
  }

  // withoutString -> Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
  // eg. 1. withoutString("Hello there", "llo") → "He there" || 2. withoutString("Hello there", "e") → "Hllo thr" || 3. withoutString("Hello there", "x") → "Hello there"
  public String withoutString(String base, String remove) {
    if(remove.length()<=base.length()){
      StringBuffer newWord = new StringBuffer();
      int rl = remove.length();
      for(int i = 0; i<base.length(); i++){
        if(i<(base.length()-rl) && remove.equalsIgnoreCase(base.substring(i, i+rl))){
          i = i + rl-1;
        }
        else{
          if(base.charAt(i)!=remove.charAt(remove.length()-1)){
            newWord.append(base.charAt(i));
          }
        }
      }
      return newWord.toString();
    }
    return base;
  }

  // equallsNot -> Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
  // eg. 1. equalIsNot("This is not") → false || 2. equalIsNot("This is notnot") → true || 3. equalIsNot("noisxxnotyynotxisi") → true
  public boolean equalIsNot(String str) {
    if(str.length()>1){
      int countIs = 0;
      int countNot = 0;
      for(int i = 0; i<str.length()-2; i++){
        if(str.substring(i, i+2).equals("is")){
          countIs++;
        }
        if(str.substring(i, i+3).equals("not")){
          countNot++;
        }
      }
      if(str.substring(str.length()-2, str.length()).equals("is")){
        countIs++;
      }
      return (countIs == countNot);
    }
    return true;
  }

  // gHappy -> We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.
  // eg. 1. gHappy("xxggxx") → true || 2. gHappy("xxgxx") → false || 3. gHappy("xxggyygxx") → false
  public boolean gHappy(String str) {
    if(str.length() == 1 && str.charAt(0) == 'g'){
      return false;
    }
    if(str.length() >= 2 && (str.charAt(0)=='g' && str.charAt(1)!='g' || str.charAt(str.length()-1)=='g' &&  str.charAt(str.length()-2)!='g')){
      return false;
    }
    for(int i=1; i<=str.length()-2; i++){
      if(str.charAt(i)=='g' && str.charAt(i-1)!='g' && str.charAt(i+1)!='g'){
        return false;
      }
    }
    return true;
  }

  // countTriple -> We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.
  // eg. 1. countTriple("abcXXXabc") → 1 || 2. countTriple("xxxabyyyycd") → 3 || 3. countTriple("a") → 0
  public int countTriple(String str) {
    int count = 0;
    if(str.length()>=3){
      for(int i = 0; i<str.length()-2; i++){
        if(str.charAt(i)==str.charAt(i+1) && str.charAt(i+1)==str.charAt(i+2)){
          count++;
        }
      }
    }
    return count;
  }

  // sumDigits -> Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
  // eg. 1. sumDigits("aa1bc2d3") → 6 || 2. sumDigits("aa11b33") → 8 || 3. sumDigits("Chocolate") → 0
  public int sumDigits(String str) {
    int sum = 0;
    String c = "";
    for(int i = 0; i<str.length(); i++){
      if(Character.isDigit(str.charAt(i))){
        sum = sum + Integer.parseInt(Character.toString(str.charAt(i)));
      }
    }
    return sum;
  }

  // sameEnds -> Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
  // eg. 1. sameEnds("abXYab") → "ab" || 2. sameEnds("xx") → "x" || 3. sameEnds("xxx") → "x"
  public String sameEnds(String string) {
    if(string.length()>1){
      int front = string.length()/2;
      int back;
      if(string.length()%2==0){
        back=front;
      }
      else{
        back=front+1;
      }
      for(int i = front; i>=1; i--){
        if(string.substring(0, i).equals(string.substring(back))){
          return string.substring(back);
        }
        else{
          back++;
        }
      }
    }
    return "";
  }

  // mirrorEnds -> Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
  // eg. 1. mirrorEnds("abXYZba") → "ab" || 2. mirrorEnds("abca") → "a" || 3. mirrorEnds("aba") → "aba"
  public String mirrorEnds(String string) {
    String newWord = "";
    String comparison = "";
    int end = string.length()-1;
    for(int i = 0; i<string.length(); i++){
     comparison = comparison + string.charAt(end);
     if(string.substring(0, i+1).equals(comparison)){
       newWord = comparison;
       end--;
     }
     else{
       return newWord;
     }
   }
   return newWord;
  }

  // maxBlock -> Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
  // eg. 1. maxBlock("hoopla") → 2 || 2. maxBlock("abbCCCddBBBxx") → 3 || 3. maxBlock("") → 0
  public int maxBlock(String str) {
    if(str.length()>0){
      int count = 1;
      int max = 1;
      for(int i = 1; i<str.length(); i++){
        if(str.charAt(i)==str.charAt(i-1)){
          count++;
        }
        else{
          if(count>max){
            max = count;
          }
          count = 1;
        }
      }
      if(count>max){
        max=count;
      }
      return max;
    }
    return 0;
  }

  // sumNumbers -> Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
  // eg. 1. sumNumbers("abc123xyz") → 123 || 2. sumNumbers("aa11b33") → 44 || 3. sumNumbers("7 11") → 18
  public int sumNumbers(String str) {
    int sum = 0;
    String storeDigits = "";
    if(str.length()>0){
      for(int i = 0; i<str.length(); i++){
        if(Character.isDigit(str.charAt(i))){
          storeDigits = storeDigits + str.charAt(i);
        }
        else{
          if(storeDigits.length()>0){
            sum = sum + Integer.parseInt(storeDigits);
          }
          storeDigits = "";
        }
      }
    }
    if(storeDigits.length()>0){
      sum = sum + Integer.parseInt(storeDigits);
    }
    return sum;
  }

  // notReplace -> Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
  // eg. 1. notReplace("is test") → "is not test" || 2. notReplace("is-is") → "is not-is not" || 3. notReplace("This is right") → "This is not right"
  

  // DNC - class closing
}
