/*
 * Name: Warmup-1.java
 * @autor: Daniela Kepper
 * Date: 09.03.2018
 * Description: this java class provides my solutions for the Java Warmup-1 exercises of Coding Bat: http://codingbat.com/java/Warmup-1
 */
 
public Warmup-1 {

// sleepIn -> The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
// e.g. 1. sleepIn(false, false) → true 2. sleepIn(true, false) → false 3. sleepIn(false, true) → true
public boolean sleepIn(boolean weekday, boolean vacation) {
  if (!weekday || vacation) {
    return true;
  }
    return false;
}

//monkeyTrouble -> We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
// e.g. 1. monkeyTrouble(true, true) → true 2. monkeyTrouble(false, false) → true 3. monkeyTrouble(true, false) → false
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if((!aSmile && !bSmile) || (aSmile && bSmile)) {
    return true;
  }
    return false;
}

// sumDouble -> Given two int values, return their sum. Unless the two values are the same, then return double their sum.
// e.g. 1. sumDouble(1, 2) → 3 2. sumDouble(3, 2) → 5 3. sumDouble(2, 2) → 8
public int sumDouble(int a, int b) {
  if (a!=b){
    return a+b;
  }
    return (a+b)*2;
}

// diff21 -> Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
// e.g. 1. diff21(19) → 2 2. diff21(10) → 11 3. diff21(21) → 0
public int diff21(int n) {
  if (n<21){
    int diff = 21-n;
    return diff;
  }
  else {
    int diff = (n-21)*2;
    return diff;
  }
}

// parrotTrouble -> We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
// e.g. 1. parrotTrouble(true, 6) → true 2. parrotTrouble(true, 7) → false 3. parrotTrouble(false, 6) → false
public boolean parrotTrouble(boolean talking, int hour) {
  if(talking && ((hour<7) || (hour>20))){
    return true;
  }
    return false;
}

// makes10 -> Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
// e.g. 1. makes10(9, 10) → true 2. makes10(9, 9) → false 3. makes10(1, 9) → true
public boolean makes10(int a, int b) {
  if((a==10) || (b==10) || (a+b==10)){
    return true;
  }
    return false;
}

// nearHundred -> Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
// e.g. 1. nearHundred(93) → true 2. nearHundred(90) → true 3. nearHundred(89) → false
public boolean nearHundred(int n) {
  if((n>=90) && (n<=110)) { //within 100 range
    return true;
  }
  if((n>=190) && (n<=210)){ // within 200 range
    return true;
  }
    return false;
}

// posNeg -> Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
// e.g. 1. posNeg(1, -1, false) → true 2. posNeg(-1, 1, false) → true 3. posNeg(-4, -5, true) → true
public boolean posNeg(int a, int b, boolean negative) {
  if(!negative && ((a<0) || (b<0)) && ((a>0) || (b>0))){ // parameter false
    return true;
  }
  if(negative && (a<0) && (b<0)){ // parameter true
    return true;
  }
  else {
    return false;
  }
}

// notString -> Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
// e.g. 1. notString("candy") → "not candy" 2.notString("x") → "not x" 3. notString("not bad") → "not bad"
public String notString(String str) {
  if (str.length()>=3) {
    if((str.substring(0,3).equals("not"))) {
      return str;
  }
  return str = "not "+str;
  }
  else {
    return str = "not "+str;
  }
}

// missingChar -> Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
// e.g. 1. missingChar("kitten", 1) → "ktten" 2. missingChar("kitten", 0) → "itten" 3. missingChar("kitten", 4) → "kittn"
public String missingChar(String str, int n) {
  int max = str.length();
  return (str.substring(0, n) + str.substring(n+1));
}

//frontBack -> Given a string, return a new string where the first and last chars have been exchanged.
// e.g. 1. frontBack("code") → "eodc" 2. frontBack("a") → "a" 3. frontBack("ab") → "ba"
public String frontBack(String str) {
  if(str.length()>=2) {
    return ((str.substring(str.length()-1)) + (str.substring(1, str.length()-1)) + (str.substring(0, 1)));
  }
     return str;
  }

// front3 -> Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
// e.g. 1. front3("Java") → "JavJavJav" 2. front3("Chocolate") → "ChoChoCho" 3. front3("abc") → "abcabcabc"
public String front3(String str) {
  if (str.length()>=3) {
    return ((str.substring(0, 3))+(str.substring(0, 3))+(str.substring(0, 3)));
  }
  else if (str.length()==2){
    return ((str.substring(0, 2)) + (str.substring(0, 2)) + (str.substring(0, 2)));
  }
    return str + str+ str;
}

// backAround -> Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
// e.g. 1. backAround("cat") → "tcatt" 2. backAround("Hello") → "oHelloo" 3. backAround("a") → "aaa"
public String backAround(String str) {
  return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
}

// or35 -> Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
// e.g. 1. or35(3) → true 2. or35(10) → true 3. or35(8) → false
public boolean or35(int n) {
  if ((n%3==0) || (n%5==0)){
    return true;
  }
    return false;
}

// front22 -> Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
// e.g. 1. front22("kitten") → "kikittenki" 2. front22("Ha") → "HaHaHa" 3. front22("abc") → "ababcab"
public String front22(String str) {
  if(str.length()>=2) {
    return str.substring(0, 2) + str + str.substring(0, 2);
  }
    return str + str + str;
}

// startHi -> Given a string, return true if the string starts with "hi" and false otherwise.
// e.g. 1. startHi("hi there") → true 2. startHi("hi") → true 3. tartHi("hello hi") → false
public boolean startHi(String str) {
  if (str.length()>=2) {
    if ((str.substring(0,2)).equals("hi")){
      return true;
    }
    return false;
  }
    return false;
}

// icyHot -> Given two temperatures, return true if one is less than 0 and the other is greater than 100.
// e.g. 1. icyHot(120, -1) → true 2. icyHot(-1, 120) → true 3. icyHot(2, 120) → false
public boolean icyHot(int temp1, int temp2) {
  if((temp1<0 || temp2<0) && (temp1>100 || temp2>100)) {
    return true;
  }
    return false;
}

// in1020 -> Given 2 int values, return true if either of them is in the range 10..20 inclusive.
// e.g. 1. in1020(12, 99) → true 2. in1020(21, 12) → true 3. in1020(8, 99) → false
public boolean in1020(int a, int b) {
    if ((a>=10 && a<=20) || ((b>=10) && (b<=20))) {
    return true;
  }
    return false;
}

// hasTeen -> We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
// e.g. 1. hasTeen(13, 20, 10) → true 2. hasTeen(20, 19, 10) → true 3. hasTeen(20, 10, 13) → true
public boolean hasTeen(int a, int b, int c) {
  return ((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19));
}

// loneTeen -> We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
// e.g. 1. loneTeen(13, 99) → true 2. loneTeen(21, 19) → true 3. loneTeen(13, 13) → false
public boolean loneTeen(int a, int b) {
  boolean aTeen = ((a>=13) && (a<=19));
  boolean bTeen = ((b>=13) && (b<=19));
  if ((!aTeen && bTeen) || (aTeen && !bTeen)) {
    return true;
  }
   return false;
}

// delDel -> Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
// e.g. 1. delDel("adelbc") → "abc" 2. delDel("adelHello") → "aHello" 3. delDel("adedbc") → "adedbc"
public String delDel(String str) {
  if (((str.length()>=4)) && (str.substring(1, 4).equals("del"))){
    return str.charAt(0) + str.substring(4);
  }
    return str;
}

// mixStart -> Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
// e.g. 1. mixStart("mix snacks") → true 2. mixStart("pix snacks") → true 3. mixStart("piz snacks") → false
public boolean mixStart(String str) {
  if((str.length()>=3) && (str.substring(1, 3).equals("ix"))) {
    return true;
  }
  else {
    return false;
  }
}

// startOz -> Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
// e.g. 1. startOz("ozymandias") → "oz" 2. startOz("bzoo") → "z" 3. startOz("oxx") → "o"
public String startOz(String str) {
  String result = "";

  if (str.length() >= 1 && str.charAt(0)=='o') {
    result = result + str.charAt(0);
  }

  if (str.length() >= 2 && str.charAt(1)=='z') {
    result = result + str.charAt(1);
  }
  return result;
}

// intMax -> Given three int values, a b c, return the largest.
// e.g. 1. intMax(1, 2, 3) → 3 2. intMax(1, 3, 2) → 3 3. intMax(3, 2, 1) → 3
public int intMax(int a, int b, int c) {
  int highest = a;
  if (b > highest) {
    highest = b;
  }
  if (c > highest) {
    highest = c;
  }
  return highest;
}

// close10 -> Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
// e.g. 1. close10(8, 13) → 8 2. close10(13, 8) → 8 3. close10(13, 7) → 0
public int close10(int a, int b) {
  int aRest = Math.abs(a-10);
  int bRest = Math.abs(b-10);

  if (aRest == bRest) {
    return 0;
  }

  if (aRest < bRest) {
    return a;
  }

  else {
    return b;
  }
}

// in3050 -> Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
// e.g. 1. in3050(30, 31) → true 2. in3050(30, 41) → false 3. in3050(40, 50) → true
public boolean in3050(int a, int b) {
  return ((a>=30 && a<=40) && (b>=30 && b<=40)) ||
          ((a>=40 && a<=50) && ((b>=40 && b<=50)));
}

// max1020 -> Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
// e.g. 1. max1020(11, 19) → 19 2. max1020(19, 11) → 19 3.max1020(11, 9) → 11
public int max1020(int a, int b) {
  boolean aValue = (a>=10 && a<=20);
  boolean bValue = (b>=10 && b<=20);

  if (aValue && bValue) {
    int highest = a;
    if (b > a) {
      highest = b;
    }
    return highest;
  }

  else if (!aValue && bValue) {
    return b;
  }

  else if (aValue && !bValue) {
    return a;
  }

  else {
    return 0;
  }
}

// stringE -> Return true if the given string contains between 1 and 3 'e' chars.
// e.g. 1. stringE("Hello") → true 2. stringE("Heelle") → true 3. stringE("Heelele") → false
public boolean stringE(String str) {
  int len = str.length();
  int count = 0;
  for (int i = 0; i<len; i++){
    if ((str.charAt(i) == 'e')) {
      count++;
    }
    }
      if (count>=1 && count <=3) {
        return true;
  }
  return false;
}

// lastDigit -> Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
// e.g. 1. lastDigit(7, 17) → true 2. lastDigit(6, 17) → false 3. lastDigit(3, 113) → true
public boolean lastDigit(int a, int b) {
  // True if the last digits are the same
  return(a % 10 == b % 10);
}

// endUp -> Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
// e.g. 1. endUp("Hello") → "HeLLO" 2. endUp("hi there") → "hi thERE" 3. endUp("hi") → "HI"
public String endUp(String str) {
  if(str.length()>=4) {
    String strEnd = str.substring((str.length()-3),(str.length())).toUpperCase();
    return ((str.substring(0,str.length()-3)) + strEnd);
  }
  else {
    return str.toUpperCase();
  }
}

// everyNth -> Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
// e.g. 1. everyNth("Miracle", 2) → "Mrce" 2. everyNth("abcdefg", 2) → "aceg" 3. everyNth("abcdefg", 3) → "adg"
public String everyNth(String str, int n) {
  if (n<str.length()-1) {
  StringBuffer sb = new StringBuffer();
  sb.append(str.charAt(0));
  int count = 1;
  for (int i = 1; i < str.length(); i++) {
    if(count%n==0) {
      sb.append(str.charAt(i));
    }
    count ++;
  }
  return sb.toString();
  }
  else {
    return str.substring(0,1);
  }
}

// DNC - class closing tag
}
