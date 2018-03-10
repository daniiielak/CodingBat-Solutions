/*
 * Name: String-1.java
 * @autor: Daniela Kepper
 * Date: 10.03.2018
 * Description: this java class provides my solutions for the Java String-1 exercises of Coding Bat: http://codingbat.com/java/String-1
 */

public class String-1 {
  // helloName -> Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
  // e.g. 1. helloName("Bob") → "Hello Bob!" 2. helloName("Alice") → "Hello Alice!" 3. helloName("X") → "Hello X!"
  public String helloName(String name) {
    return "Hello " + name + "!";
  }

  // makeAbba -> Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
  // e.g. 1. makeAbba("Hi", "Bye") → "HiByeByeHi" 2. makeAbba("Yo", "Alice") → "YoAliceAliceYo" 3. makeAbba("What", "Up") → "WhatUpUpWhat"
  public String makeAbba(String a, String b) {
    return a+b+b+a;
  }

  // makeTags -> The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
  // e.g. 1. makeTags("i", "Yay") → "<i>Yay</i>" 2. makeTags("i", "Hello") → "<i>Hello</i>" 3. makeTags("cite", "Yay") → "<cite>Yay</cite>"
  public String makeTags(String tag, String word) {
    return "<"+tag+">"+word+"</"+tag+">";
  }

  //makeOutWord -> Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
  // e.g. 1. makeOutWord("<<>>", "Yay") → "<<Yay>>" 2. makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>" 3. makeOutWord("[[]]", "word") → "[[word]]"
  public String makeOutWord(String out, String word) {
    return out.substring(0, 2) + word + out.substring(out.length()-2, out.length());
  }

  // extraEnd -> Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
  // e.g. 1. extraEnd("Hello") → "lololo" 2. extraEnd("ab") → "ababab" 3. extraEnd("Hi") → "HiHiHi"
  public String extraEnd(String str) {
    StringBuffer sb = new StringBuffer();
    for (int i = 1; i <= 3; i++) {
      sb.append(str.substring(str.length()-2, str.length()));
    }
    return sb.toString();
  }

  public String extraEndOption2(String str) {
    return str.substring(str.length()-2, str.length()) + str.substring(str.length()-2, str.length()) + str.substring(str.length()-2, str.length());
  }

  // firstTwo -> Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
  // e.g. 1. firstTwo("Hello") → "He" 2. firstTwo("abcdefg") → "ab" 3. firstTwo("ab") → "ab"
  public String firstTwo(String str) {
    if (str.length()>2) {
      return str.substring(0,2);
    }
      return str;
  }

  // firstHalf -> Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
  // e.g. 1. firstHalf("WooHoo") → "Woo" 2. firstHalf("HelloThere") → "Hello" 3. firstHalf("abcdef") → "abc"
  public String firstHalf(String str) {
    int halfLength = (str.length()/2);
    return str.substring(0, halfLength);
  }

  // withoutEnd -> Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
  // e.g. 1. withoutEnd("Hello") → "ell" 2. withoutEnd("java") → "av" 3. withoutEnd("coding") → "odin"
  public String withoutEnd(String str) {
    return str.substring(1, str.length()-1);
  }

  // comboString -> Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
  // e.g. 1. comboString("Hello", "hi") → "hiHellohi" 2. comboString("hi", "Hello") → "hiHellohi" 3. comboString("aaa", "b") → "baaab"
  public String comboString(String a, String b) {
    if (a.length()>b.length()) {
      return b+a+b;
    }
    else {
      return a+b+a;
    }
  }

  // nonStart -> Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1
  // e.g. 1. nonStart("Hello", "There") → "ellohere" 2. nonStart("java", "code") → "avaode" 3. nonStart("shotl", "java") → "hotlava"
  public String nonStart(String a, String b) {
    return a.substring(1) + b.substring(1);
  }

  // left2 -> Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
  // e.g. 1. 2. 3.
  public String left2(String str) {
    if(str.length()>2) {
      return str.substring(2) + str.substring(0,2);
    }
      return str;
  }

  // right2 -> Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
  // e.g. 1. right2("Hello") → "loHel" 2. right2("java") → "vaja" 3. right2("Hi") → "Hi"
  public String right2(String str) {
    if (str.length()>2) {
      return (str.substring(str.length()-2, str.length()) + str.substring(0, str.length()-2));
    }
    else {
      return str;
    }
  }

  // theEnd -> Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
  // e.g. 1. theEnd("Hello", true) → "H" 2. theEnd("Hello", false) → "o" 3.theEnd("oh", true) → "o"
  public String theEnd(String str, boolean front) {
    if(front) {
      return str.substring(0,1);
    }
    else {
      return str.substring(str.length()-1, str.length());
    }
  }

  // withoutEnd2 -> Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
  // e.g. 1. withouEnd2("Hello") → "ell" 2. withouEnd2("abc") → "b" 3. withouEnd2("ab") → ""
  public String withouEnd2(String str) {
    if (str.length()>2) {
      return str.substring(1, str.length()-1);
    }
    else {
      return "";
    }
  }

  // middleTwo -> Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
  // e.g. 1. middleTwo("string") → "ri" 2. middleTwo("code") → "od" 3. middleTwo("Practice") → "ct"
  public String middleTwo(String str) {
    if (str.length()>2) {
    int stringHalf = (str.length()/2);
    return str.substring(stringHalf-1, stringHalf+1);
    }
    else {
      return str;
    }
  }

  // endsLy -> Given a string, return true if it ends in "ly".
  // e.g. 1. endsLy("oddly") → true 2. endsLy("y") → false 3. endsLy("oddy") → false
  public boolean endsLy(String str) {
    if(str.length()>2) {
      if (str.substring(str.length()-2, str.length()).equalsIgnoreCase("ly")) {
        return true;
      }
      else {
       return false;
      }
    }
    else {
      if (str.equalsIgnoreCase("ly")) {
        return true;
      }
      else {
        return false;
      }
    }
  }

  // nTwice -> Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
  // e.g. 1. nTwice("Hello", 2) → "Helo" 2. nTwice("Chocolate", 3) → "Choate" 3.nTwice("Chocolate", 1) → "Ce"
  public String nTwice(String str, int n) {
    return str.substring(0,n) + str.substring(str.length()-n, str.length());
  }

  // twoChar -> Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
  // e.g. 1. twoChar("java", 0) → "ja" 2.twoChar("java", 2) → "va" 3. twoChar("java", 3) → "ja"
  public String twoChar(String str, int index) {
  	if(index <= str.length()-2 && index >= 0) {
  		return str.substring(index, index+2);
  	}
  	return str.substring(0, 2);
  }

  // middleThree -> Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
  // e.g. 1. middleThree("Candy") → "and" 2. middleThree("and") → "and" 3. middleThree("solving") → "lvi"
  public String middleThree(String str) {
    int middle = str.length()/2;
    return str.substring(middle-1, middle+2);
  }

  // hasBad -> Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
  // e.g. 1. hasBad("badxx") → true 2. hasBad("xbadxx") → true 3. hasBad("xxbadxx") → false
  public boolean hasBad(String str) {
    if (str.length()>=4) {
      if ((str.substring(0,3).equalsIgnoreCase("bad")) ||(str.substring(1,4).equalsIgnoreCase("bad"))) {
        return true;
      }
    else if {
      if (str.equalsIgnoreCase("bad")) {
        return true;
      }
      return false;
      }
    }
    else {
      if (str.equalsIgnoreCase("bad")) {
        return true;
      }
      return false;
    }
  }

  // atFirst -> Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
  // e.g. 1. atFirst("hello") → "he" 2. atFirst("hi") → "hi" 3. atFirst("h") → "h@"
  public String atFirst(String str) {
    if (str.length()>=2) {
      return str.substring(0,2);
    }
    else if (str.length()==1) {
      return str.substring(0,1) + "@";
    }
    else {
      return "@@";
    }
  }

  // lastChars -> Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
  // e.g. 1. lastChars("last", "chars") → "ls" 2.lastChars("yo", "java") → "ya" 3. lastChars("hi", "") → "h@"
  public String lastChars(String a, String b) {
    StringBuffer sb = new StringBuffer();
    //check a
    if (a.length()>0) {
      sb.append(a.charAt(0));
    }
    else {
      sb.append("@");
    }

    //check b
    if (b.length()>0) {
      sb.append(b.charAt(b.length()-1));
    }
    else {
      sb.append("@");
    }
    return sb.toString();
  }

  // conCat -> Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
  // e.g. 1. conCat("abc", "cat") → "abcat" 2. conCat("dog", "cat") → "dogcat" 3. conCat("abc", "") → "abc"
  public String conCat(String a, String b) {
    if (!a.isEmpty() && !b.isEmpty()) {
      if (a.charAt(a.length()-1)==b.charAt(0)) {
        return a.substring(0, a.length()-1) + b;
      }
    }
    return a+b;
  }

  // lastTwo -> Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
  // e.g. 1. lastTwo("coding") → "codign" 2. lastTwo("cat") → "cta" 3. lastTwo("ab") → "ba"
  public String lastTwo(String str) {
    if(str.length()>=2) {
     if (str.length()==2){
       return str.substring(str.length()-1, str.length()) + str.substring(str.length()-2, str.length()-1);
     }
     return str.substring(0,str.length()-2) + str.substring(str.length()-1, str.length()) + str.substring(str.length()-2, str.length()-1);
    }
    return str;
  }

  // seeColor -> Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
  // e.g. 1. seeColor("redxx") → "red" 2. seeColor("xxred") → "" 3. seeColor("blueTimes") → "blue"
  public String seeColor(String str) {
    if (str.length()>=4 && str.substring(0,4).equalsIgnoreCase("blue")){
      return "blue";
    }
    else if (str.length()>=3 && str.substring(0,3).equalsIgnoreCase("red")) {
      return "red";
    }
    return "";
  }

  // frontAgain -> Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
  // e.g. 1. frontAgain("edited") → true 2. frontAgain("edit") → false 3. frontAgain("ed") → true
  public boolean frontAgain(String str) {
    if (str.length()>=2) {
      if (str.substring(0,2).equalsIgnoreCase(str.substring(str.length()-2, str.length()))){
       return true;
      }
      return false;
    }
    return false;
  }

  // minCat -> Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
  // e.g. 1. minCat("Hello", "Hi") → "loHi" 2. minCat("Hello", "java") → "ellojava" 3. minCat("java", "Hello") → "javaello"
  public String minCat(String a, String b) {
    int aLength = a.length();
    int bLength= b.length();
    // if both are the same, concatenate regularly
    if (aLength==bLength) {
      return a+b;
    }
    // if a is bigger then b, then shorten the a string to b length and concatenate
    else if (aLength>bLength){
      return a.substring(aLength-bLength,aLength) + b;
    }
    // if b is bigger than a, then shorten the b string to the a length and concatenate
    else {
      return a + b.substring(bLength-aLength,bLength);
    }
  }

  // extraFront -> Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
  // e.g. 1. extraFront("Hello") → "HeHeHe" 2. extraFront("ab") → "ababab" 3. extraFront("H") → "HHH"
  public String extraFront(String str) {
    if (str.length()>=2) {
      return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
    }
    else if (str.length()==1) {
      return str.substring(0,1) + str.substring(0,1) + str.substring(0,1);
    }
    return "";
  }

  // without2 -> Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
  // e.g. 1. without2("HelloHe") → "lloHe" 2. without2("HelloHi") → "HelloHi" 3.without2("Hi") → ""
  public String without2(String str) {
    if (str.length()>=2 && str.substring(str.length()-2,str.length()).equals(str.substring(0,2))) {
      return str.substring(2);
    }
    return str;
  }

  // deFront -> Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
  // e.g. 1. deFront("Hello") → "llo" 2. deFront("java") → "va" 3. deFront("away") → "aay"
  public String deFront(String str) {
    // return empty string if string length is smaller or equal to 1
    if(str.length()<=1){
      return "";
    }
    // return full string, if a is in the 1st position and b is in the 2nd position
    else if(str.charAt(0)=='a' && str.charAt(1)=='b'){
      return str;
    }
    //return string with first position, remove second and print the rest, if first character in string starts with a
    else if(str.charAt(0)=='a'){
      return str.substring(0,1) + str.substring(2);
    }
    // return string without first character, if second character is b
    else if(str.charAt(1)=='b'){
      return str.substring(1);
    }
    return str.substring(2);
  }

  // startWord -> Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
  // e.g. 1. startWord("hippo", "hi") → "hi" 2. startWord("hippo", "xip") → "hip" 3. startWord("hippo", "i") → "h"
  public String startWord(String str, String word) {
  	int strLength = str.length();
  	int wordLength = word.length();
  	// check if the first string is greater or equal to second string
  	if(strLength >= wordLength) {
  	  //check if the first string without first character and until length of second string matches second string without first string
  		if(str.substring(1, wordLength).equals(word.substring(1))){
  			return (str.charAt(0)+str.substring(1, wordLength));
  		}
  		else {
  			return "";
  	  }
  	}
  	else {
  		return "";
    }
  }

  // withoutX -> Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
  // e.g. 1. withoutX("xHix") → "Hi" 2. withoutX("xHi") → "Hi" 3. withoutX("Hxix") → "Hxi"
  public String withoutX(String str) {
    if (str.length()<=1) {
      return "";
    }
    else if(str.charAt(0)=='x' && str.charAt(str.length()-1)=='x') {
      return str.substring(1,str.length()-1);
    }
    else if(str.charAt(0)=='x') {
      return str.substring(1,str.length());
    }
    else if(str.charAt(str.length()-1)=='x'){
      return str.substring(0,str.length()-1);
    }
    return str;
  }

  // withoutX2 -> Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
  // e.g. 1. withoutX2("xHi") → "Hi" 2. withoutX2("Hxi") → "Hi" 3. withoutX2("Hi") → "Hi"
  public String withoutX2(String str) {
    // safety net for empty strings
    if (str.isEmpty()) {
      return "";
    }
    // if string is smaller or equal than 2 characters
    if(str.length()<=2) {
      if (str.charAt(0)!='x' && str.charAt(1)!='x') {
      return str;
      }
      else {
        return "";
      }
    }
    // if string has 3 or more characters
    else if (str.charAt(0)=='x' && str.charAt(1)=='x') {
      return str.substring(2);
    }
    else if (str.charAt(0)=='x'){
      return str.substring(1);
    }
    else if (str.charAt(1)=='x') {
      return str.substring(0,1) + str.substring(2);
    }
    return str;
  }

  // DNC - class closing tag
}
