/*
 * Name: String-2.java
 * @autor: Daniela Kepper
 * Date: 13.06.2019
 * Description: this java class provides my solutions for the Java String-1 exercises of Coding Bat: http://codingbat.com/java/String-2
 */

public class String-2 {

  // doubleChar -> Given a string, return a string where for every char in the original, there are two chars.
  // eg. 1. doubleChar("The") → "TThhee" || 2. doubleChar("AAbb") → "AAAAbbbb" || 3. doubleChar("Hi-There") → "HHii--TThheerree"
  public String doubleChar(String str) {
    StringBuffer newWord = new StringBuffer();
    for(int i = 0; i<str.length(); i++){
      newWord.append(str.charAt(i));
      newWord.append(str.charAt(i));
    }
    return newWord.toString();
  }

  public String doubleChar(String str) {
    String newWord = "";
    for(int i = 0; i<str.length(); i++){
      newWord = newWord + str.charAt(i) + str.charAt(i);
    }
    return newWord;
  }

  // countHi -> Return the number of times that the string "hi" appears anywhere in the given string.
  // eg. 1. countHi("abc hi ho") → 1 || 2. countHi("ABChi hi") → 2 || 3.countHi("hihi") → 2
  public int countHi(String str) {
    int count = 0;
    for(int i = 0; i<str.length()-1; i++){
      if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){
        count++;
      }
    }
    return count;
  }

  // catDog -> Return true if the string "cat" and "dog" appear the same number of times in the given string.
  // eg. 1. catDog("catdog") → true || 2. catDog("catcat") → false || 3. catDog("1cat1cadodog") → true
  public boolean catDog(String str) {
  int countCat = 0;
  int countDog = 0;
  for(int i = 0; i<str.length()-2; i++){
    if(str.charAt(i)=='c' && str.charAt(i+1)=='a' && str.charAt(i+2)=='t'){
      countCat++;
    }
    if(str.charAt(i)=='d' && str.charAt(i+1)=='o' && str.charAt(i+2)=='g'){
      countDog++;
    }
  }
  return countCat == countDog;
}

  // countCode -> Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
  // eg. 1. countCode("aaacodebbb") → 1 || 2. countCode("codexxcode") → 2 || 3. countCode("cozexxcope") → 2
  public int countCode(String str) {
    int count = 0;
    for(int i = 0; i<str.length()-3; i++){
      if(str.charAt(i)=='c' && str.charAt(i+1)=='o' && str.charAt(i+3)=='e'){
        count ++;
      }
    }
    return count;
  }

  // endOther -> Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
  // eg. 1. endOther("Hiabc", "abc") → true || 2. endOther("AbC", "HiaBc") → true || 3. endOther("abc", "abXabc") → true
  public boolean endOther(String a, String b) {
    if(a.toLowerCase().equals((b).toLowerCase())){
      return true;
    }
    if(a.length()<b.length()){
      return a.toLowerCase().equals(b.substring(b.length()-(a.length())).toLowerCase());
    }
    else{
      return b.toLowerCase().equals(a.substring(a.length()-(b.length())).toLowerCase());
    }
  }

  // xyzThere -> Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
  // eg. 1. xyzThere("abcxyz") → true || 2. xyzThere("abc.xyz") → false || 3. xyzThere("xyz.abc") → true
  public boolean xyzThere(String str) {
    for(int i = 0; i < str.length()-2; i++){
      if(str.charAt(i) == 'x' && str.charAt(i+1) == 'y' && str.charAt(i+2) == 'z'){
        if(i == 0 || str.charAt(i-1) != '.'){
          return true;
    		}
    	}
    }
  	return false;
  }

  // bobThere ->Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
  // eg. 1. bobThere("abcbob") → true || 2. bobThere("b9b") → true || 3. bobThere("bac") → false
  public boolean bobThere(String str) {
    if(str.length()>=3){
      for(int i = 0; i<str.length()-2; i++){
        if(str.charAt(i)=='b' && str.charAt(i+2)=='b'){
          return true;
        }
      }
    }
    return false;
  }

  // xyBalance -> We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
  // eg. 1. xyBalance("aaxbby") → true || 2. xyBalance("aaxbb") → false || 3. xyBalance("yaaxbb") → false
  public boolean xyBalance(String str) {
    int x = 0;
    int y = 0;
    for(int i = 0; i<str.length(); i++){
      if(str.charAt(i)=='x'){
        x = 1;
        y = 0;
      }
      if(str.charAt(i)=='y' && str.length()>1){
        y = 1;
      }
    }
    return (x==y);
  }

  // mixString -> Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
  // eg. 1. mixString("abc", "xyz") → "axbycz" || 2. mixString("Hi", "There") → "HTihere" || 3. mixString("xxxx", "There") → "xTxhxexre"
  public String mixString(String a, String b) {
    StringBuffer newWord = new StringBuffer();
    int minLength = Math.min(a.length(), b.length());
    for(int i = 0; i <minLength; i++){
      newWord.append(a.charAt(i));
      newWord.append(b.charAt(i));
    }
    if(a.length()>b.length()){
    newWord.append(a.substring(minLength));
    }
    else{
      newWord.append(b.substring(minLength));
    }
    return newWord.toString();
  }

  // repeatEnd -> Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
  // eg. 1. repeatEnd("Hello", 3) → "llollollo" || 2. repeatEnd("Hello", 2) → "lolo" || 3. repeatEnd("Hello", 1) → "o"
  public String repeatEnd(String str, int n) {
    if(n!=0){
      String newWord = "";
      for(int i = 1; i<=n; i++){
        newWord = newWord + str.substring(str.length()-n);
      }
      return newWord;
    }
    return "";
  }

  // repeatFront -> Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
  // eg. 1. repeatFront("Chocolate", 4) → "ChocChoChC" || 2. repeatFront("Chocolate", 3) → "ChoChC" || 3. repeatFront("Ice Cream", 2) → "IcI"
  public String repeatFront(String str, int n) {
    if(n!=0){
    String newWord = "";
    for(int i = n; i>0; i--){
      newWord = newWord + str.substring(0, i);
    }
    return newWord;
    }
    return "";
  }

  // repeatSeparator -> Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
  // eg. 1. repeatSeparator("Word", "X", 3) → "WordXWordXWord" || 2. repeatSeparator("This", "And", 2) → "ThisAndThis" || 3. repeatSeparator("This", "And", 1) → "This"
  public String repeatSeparator(String word, String sep, int count) {
    if(count!=0){
    String newWord = "";
    for(int i = count-1; i>0; i--){
      newWord = newWord + word + sep;
    }
    newWord = newWord + word;
    return newWord;
    }
    return "";
  }

  // prefixAgain -> Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
  // eg. 1. prefixAgain("abXYabc", 1) → true || 2. prefixAgain("abXYabc", 2) → true || 3. prefixAgain("abXYabc", 3) → false
  public boolean prefixAgain(String str, int n) {
    String prefix = str.substring(0, n);
    for(int i = n; i <= str.length() - n; i++) {
      if(prefix.equals(str.substring(i, i+n))){
        return true;
      }
    }
    return false;
  }

  // xyzMiddle -> Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
  // eg. 1. xyzMiddle("AAxyzBB") → true || 2. xyzMiddle("AxyzBB") → true || 3. xyzMiddle("AxyzBBB") → false
  public boolean xyzMiddle(String str) {
    if(str.length()>2){
      int middle = str.length()/2;
      if(str.length()%2==0){
        if(str.charAt(middle)=='y'){
          return (str.charAt(middle-1)=='x' && str.charAt(middle+1)=='z');
        }
        if(str.charAt(middle-1)=='y'){
          return (str.charAt(middle-2)=='x' && str.charAt(middle)=='z');
        }
      }
      else if(str.charAt(middle)=='y'){
        return(str.charAt(middle-1) == 'x' && str.charAt(middle+1) == 'z');
      }
    }
   return false;
  }

  // getSandwich -> A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
  // eg. 1. getSandwich("breadjambread") → "jam" || 2. getSandwich("xxbreadjambreadyy") → "jam" || 3. getSandwich("xxbreadyy") → ""
  public String getSandwich(String str) {
    if(str.length()>10){
      int breadCount = 0;
      for(int i = 0; i<str.length(); i++){
        int firstBread = str.indexOf("bread");
        int lastBread = str.lastIndexOf("bread");
        if(firstBread!=-1 && lastBread!=-1 && firstBread!=lastBread){
          return str.substring(firstBread+5, lastBread);
        }
      }
    }
    return "";
  }

  // sameStarChar -> Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
  // eg. 1. sameStarChar("xy*yzz") → true || 2. sameStarChar("xy*zzz") → false || 3. sameStarChar("*xa*az") → true
  public boolean sameStarChar(String str) {
    boolean isThere = true;
    if(str.length()>2){
      for (int i = 0; i<str.length(); i++){
        if(str.charAt(i)=='*' && i!=0 && i!=str.length()-1){
          isThere = (str.charAt(i-1)==str.charAt(i+1));
        }
      }
    }
    return isThere;
  }

  // oneTwo -> Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
  // eg. 1. oneTwo("abc") → "bca" || 2. oneTwo("tca") → "cat" || 3. oneTwo("tcagdo") → "catdog"
  public String oneTwo(String str) {
    StringBuffer newWord = new StringBuffer();
    while(str.length()>=3){
      newWord.append(str.substring(1,3));
      newWord.append(str.charAt(0));
      str = str.substring(3);
    }
    return newWord.toString();
  }

  // zipZap -> Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
  // eg. 1. zipZap("zipXzap") → "zpXzp" || 2. zipZap("zopzop") → "zpzp" || 3. zipZap("zzzopzop") → "zzzpzp"
  public String zipZap(String str) {
    StringBuffer newWord = new StringBuffer();
    if(str.length()>=3){
      for(int i = 1; i<str.length()-1; i++){
        if(str.charAt(i-1)!='z' || str.charAt(i+1)!='p'){
          newWord.append(str.charAt(i));
        }
      }
      return str.charAt(0) + newWord.toString() + str.charAt(str.length()-1);
    }
    return str;
  }

  // starOut -> Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
  // eg. 1. starOut("ab*cd") → "ad" || 2. starOut("ab**cd") → "ad" || 3. starOut("sm*eilly") → "silly"
  public String starOut(String str) {
    String newWord = "";
    for(int i = 1; i<str.length(); i++){
      if(i==str.length()-1 && str.charAt(str.length()-2)!='*' && str.charAt(str.length()-1)!='*'){
          newWord = newWord + str.charAt(str.length()-1);
        }
      else if(str.charAt(i)!='*' && str.charAt(i-1)!='*' && str.charAt(i+1)!='*'){
        newWord = newWord + str.charAt(i);
      }
    }
    if(str.length()!=0 && str.charAt(0)!='*'){
      if(str.length()<2){
        newWord = str.charAt(0) + newWord;
      }
      else if(str.charAt(1)!='*'){
          newWord = str.charAt(0) + newWord;
        }
    }
    return newWord;
  }

  // plusOut -> Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
  // eg. 1. plusOut("12xy34", "xy") → "++xy++" || 2. plusOut("12xy34", "1") → "1+++++" || 3. plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
  public String plusOut(String str, String word){
    StringBuffer newWord = new StringBuffer();
    int index = 0;
    while(index < str.length()){
        if(index<= str.length() - word.length() && str.substring(index, index + word.length()).equals(word)) {
            newWord.append(word);
            index = index + word.length();
        } else{
            newWord.append("+");
            index++;
        }
    }
    return newWord.toString();
  }

  // wordEnds -> Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
  // eg. 1. wordEnds("abcXY123XYijk", "XY") → "c13i" || 2. wordEnds("XY123XY", "XY") → "13" || 3. wordEnds("XY1XY", "XY") → "11"
  public String wordEnds(String str, String word) {
    StringBuffer newWord = new StringBuffer();
    String checkWord = "";
    int wl = word.length();
    int sl = str.length();
    if(sl>=wl){
      for(int i = 0; i<=(sl-wl); i++){
        checkWord = str.substring(i, i+wl);
        if(checkWord.equals(word)){
          if(i!=0){
            newWord.append(str.charAt(i-1));
          }
          if(i<(sl-wl)){
          newWord.append(str.charAt(i+wl));
          }
        }
      }
      return newWord.toString();
    }
    return "";
  }

  // DNC - class closing tag
}
