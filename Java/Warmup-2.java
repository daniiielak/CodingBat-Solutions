/*
 * Name: Array-1.java
 * @autor: Daniela Kepper
 * Date: 07.06.2019
 * Description: this java class provides my solutions for the Warmup-2 exercises of Coding Bat: https://codingbat.com/java/Warmup-2
 */

 public class Warmup-2 {

   // stringTimes -> Given a string and a non-negative int n, return a larger string that is n copies of the original string.
   // eg. 1. stringTimes("Hi", 2) → "HiHi" || 2. stringTimes("Hi", 3) → "HiHiHi" || 3. stringTimes("Hi", 1) → "Hi"
  public String stringTimes(String str, int n) {
    if(n>=1){
      StringBuffer sb = new StringBuffer(str);
      for(int i = 2; i<=n; i++){
        sb.append(str);
      }
      return sb.toString();
    }
    return "";
  }

  // frontTimes -> Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
  // eg. 1. frontTimes("Chocolate", 2) → "ChoCho" || 2. frontTimes("Chocolate", 3) → "ChoChoCho" || 3. frontTimes("Abc", 3) → "AbcAbcAbc"
  public String frontTimes(String str, int n) {
    StringBuffer sb = new StringBuffer();
    String start;
    if(str.length()>3){
      start = str.substring(0, 3);
    }
    else{
      start = str;
    }
    for(int i = 1; i<=n; i++){
      sb.append(start);
    }
    return sb.toString();
  }

  // countXX -> Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
  // eg. 1. countXX("abcxx") → 1 || 2. countXX("xxx") → 2 || 3. countXX("xxxx") → 3
  int countXX(String str) {
    int count = 0;
    for(int i = 0; i<str.length(); i++){
      if(i!=str.length()-1 && str.charAt(i)=='x' && str.charAt(i+1)=='x'){
        count++;
      }
    }
    return count;
  }

  // doubleX -> Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
  // eg. 1. doubleX("axxbb") → true || 2. doubleX("axaxax") → false || 3. doubleX("xxxxx") → true
  boolean doubleX(String str) {
    int count = 0;
    for(int i = 0; i<str.length(); i++){
      if(i!=str.length()-1 && str.charAt(i)=='x'){
        count++;
        if (count==1 && str.charAt(i+1)=='x'){
          return true;
        }
      }
    }
    return false;
  }

  // stringBits -> Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
  // eg. 1. stringBits("Hello") → "Hlo" || 2. stringBits("Hi") → "H" || 3. stringBits("Heeololeo") → "Hello"
  public String stringBits(String str) {
    StringBuffer sb = new StringBuffer();
    for(int i = 1; i<=str.length(); i++){
      if(i%2!=0){
        sb.append(str.charAt(i-1));
      }
    }
    return sb.toString();
  }

  // stringSplosion -> Given a non-empty string like "Code" return a string like "CCoCodCode".
  // eg. 1. stringSplosion("Code") → "CCoCodCode" | 2. stringSplosion("abc") → "aababc" || 3. stringSplosion("ab") → "aab"
  public String stringSplosion(String str) {
    StringBuffer s1 = new StringBuffer();
    StringBuffer s2 = new StringBuffer();
    for(int i = 0; i<str.length(); i++){
      s1.append(str.charAt(i));
      s2.append(s1);
    }
    return s2.toString();
  }

  // last2 -> Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
  // eg. 1. last2("hixxhi") → 1 || 2. last2("xaxxaxaxx") → 1 || 3. last2("axxxaaxx") → 2
  public int last2(String str) {
    int count = 0;
    if(str.length()>2){
      String ending = str.substring(str.length()-2);
      for(int i = 0; i<str.length()-2; i++){
        if(str.substring(i, i+2).equals(ending)){
          count++;
        }
      }
    }
    return count;
  }

  // arrayCount9 -> Given an array of ints, return the number of 9's in the array.
  // eg. 1. arrayCount9([1, 2, 9]) → 1 || 2. arrayCount9([1, 9, 9]) → 2 || 3. arrayCount9([1, 9, 9, 3, 9]) → 3
  public int arrayCount9(int[] nums) {
    int count = 0;
    for(int i = 0; i<nums.length; i++){
      if(nums[i]==9){
        count++;
      }
    }
    return count;
  }

  // arrayFront9 -> Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
  // eg. 1. arrayFront9([1, 2, 9, 3, 4]) → true || 2. arrayFront9([1, 2, 3, 4, 9]) → false || 3. arrayFront9([1, 2, 3, 4, 5]) → false
  public boolean arrayFront9(int[] nums) {
   int size;
   if(nums.length>=4){
     size = 4;
   }
   else{
     size = nums.length;
   }
   for(int i = 0; i<size; i++){
     if(nums[i]==9){
       return true;
     }
   }
   return false;
  }

  // array123 -> Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
  // eg. 1. array123([1, 1, 2, 3, 1]) → true || 2. array123([1, 1, 2, 4, 1]) → false || 3. array123([1, 1, 2, 1, 2, 3]) → true
  public boolean array123(int[] nums) {
    if(nums.length>=3){
      for(int i = 0; i<nums.length-2; i++){
        if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2]==3){
          return true;
        }
      }
    }
    return false;
  }

  // stringMatch -> Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
  // eg. 1. stringMatch("xxcaazz", "xxbaaz") → 3 || 2. stringMatch("abc", "abc") → 2 || 3.stringMatch("abc", "axc") → 0
  public int stringMatch(String a, String b) {
    int count = 0;
    if(a.length()>=2 && b.length()>=2){
      int minLength = Math.min(a.length(), b.length());
      for(int i = 0; i<minLength-1; i++){
        if(a.charAt(i) == b.charAt(i) && a.charAt(i+1) == b.charAt(i+1)){
          count++;
        }
      }
    }
    return count;
  }

  // stringX  -> Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
  // eg. 1. stringX("xxHxix") → "xHix" || 2. stringX("abxxxcd") → "abcd" || 3. stringX("xabxxxcdx") → "xabcdx"
  public String stringX(String str) {
    if(str.length()>2){
      StringBuffer sb = new StringBuffer();
      for(int i = 0; i<str.length(); i++){
        if(i==0 || i==str.length()-1 || str.charAt(i)!='x'){
          sb.append(str.charAt(i));
        }
      }
      return sb.toString();
    }
    return str;
  }

  // altPairs -> Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
  // eg. 1. altPairs("kitten") → "kien" || 2. altPairs("Chocolate") → "Chole" || 3. altPairs("CodingHorror") → "Congrr"
  public String altPairs(String str) {
    if(str.length()!=0){
      int add = 1;
      int countdown = 1;
      StringBuffer sb = new StringBuffer();
      sb.append(str.charAt(0));
      for(int i = 0; i<str.length(); i++){
        if(countdown == 0){
          sb.append(str.charAt(i));
          add = (add==1) ? (add=3) : (add=1);
          countdown = add;
        }
        countdown--;
      }
      return sb.toString();
    }
    return str;
  }

  // stringYak -> Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
  // eg. 1. stringYak("yakpak") → "pak" || 2. stringYak("pakyak") → "pak" || 3. stringYak("yak123ya") → "123ya"
  public String stringYak(String str) {
    StringBuffer sb = new StringBuffer();
    for (int i=0; i<str.length(); i++) {
      if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
        i =  i + 2;
      } else {
        sb.append(str.charAt(i));
      }
    }
    return sb.toString();
  }

  // array667 -> Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.
  // eg. 1. array667([6, 6, 2]) → 1 || 2. array667([6, 6, 2, 6]) → 1 || 3. array667([6, 7, 2, 6]) → 1
  public int array667(int[] nums) {
    int count = 0;
    for(int i = 0; i<nums.length; i++){
      if(i<nums.length-1 && nums[i]==6 && (nums[i+1]==6 || nums[i+1]==7)){
        count++;
      }
    }
    return count;
  }

  // noTriples -> Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
  // eg. 1. noTriples([1, 1, 2, 2, 1]) → true || 2. noTriples([1, 1, 2, 2, 2, 1]) → false || 3. noTriples([1, 1, 1, 2, 2, 2, 1]) → false
  public boolean noTriples(int[] nums) {
  for(int i = 0; i<nums.length-2; i++){
    if(nums[i]==nums[i+1] && nums[i]==nums[i+2]){
      return false;
    }
  }
  return true;
}

// has271 -> Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
// eg. 1. has271([1, 2, 7, 1]) → true || 2. has271([1, 2, 8, 1]) → false || 3. has271([2, 7, 1]) → true
public boolean has271(int[] nums) {
  boolean theTruth = false;
  if(nums.length>2){
    for(int i = 0; i<nums.length-1; i++){
      if(nums[i+1]==(nums[i]+5) && (Math.abs(nums[i+2] - (nums[i] - 1)) <= 2)){
        theTruth = true;
      }
    }
  }
  return theTruth;
}
   // DNC - end of class
 }
