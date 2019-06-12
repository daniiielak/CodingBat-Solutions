/*
 * Name: Logic-2.java
 * @autor: Daniela Kepper
 * Date: 07.06.2019
 * Description: this java class provides my solutions for the Warmup-2 exercises of Coding Bat: https://codingbat.com/java/Warmup-2
 */

 public class Logic-2 {

   // makeBricks -> We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops.
   // eg. 1. makeBricks(3, 1, 8) → true || 2. makeBricks(3, 1, 9) → false || 3. makeBricks(3, 2, 10) → true
   public boolean makeBricks(int small, int big, int goal) {
     int maxBigNeeded = goal/5;
     if(maxBigNeeded>big){
       goal = goal-(big*5);
     }
     else{
       goal = goal-(maxBigNeeded*5);
     }
     if(goal<=small){
       return true;
     }
     return false;
   }

   public boolean makeBricks(int small, int big, int goal){
     if(goal-(big*5 + small) > 0){
       return false;
     }
     if(goal%5>small){
       return false;
     }
     return true;
   }

   public boolean makeBricks(int small, int big, int goal){
     int left = goal >= (5*big) ? goal - (5*big) : goal %5;
     if(left<=small){
       return true;
     }
     return false;
   }

   // loneSum -> Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
   // eg. 1. loneSum(1, 2, 3) → 6 || 2. loneSum(3, 2, 3) → 2 || 3. loneSum(3, 3, 3) → 0
   public int loneSum(int a, int b, int c) {
    int sum = 0;
    if(a!=b && a!=c){
      sum += a;
    }
    if(b!=a && b!=c){
      sum += b;
    }
    if(c!=a && c!=b){
      sum += c;
    }
    return sum;
  }

  // luckySum -> Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
  // eg. 1. luckySum(1, 2, 3) → 6 || 2. luckySum(1, 2, 13) → 3 || 3. luckySum(1, 13, 3) → 1
  public int luckySum(int a, int b, int c) {
    int sum = 0;
    if(a!=13){
      sum += a;
      if(b!=13){
        sum += b;
        if(c!=13){
          sum += c;
        }
      }
    }
    return sum;
  }

  // noTeenSum -> Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().
  // eg. 1. noTeenSum(1, 2, 3) → 6 || 2. noTeenSum(2, 13, 1) → 3 || 3. noTeenSum(2, 1, 14) → 3
  public int noTeenSum(int a, int b, int c) {
    return fixTeen(a) + fixTeen(b) + fixTeen(c);
  }

  public int fixTeen(int n){
    if((n>12 && n<15) || (n>16 && n<20)){
    return 0;
  }
    return n;
  }

  // roundSum -> For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
  // eg. 1. roundSum(16, 17, 18) → 60 || 2. roundSum(12, 13, 14) → 30 || 3. roundSum(6, 4, 4) → 10
  public int roundSum(int a, int b, int c) {
    return round10(a) + round10(b) + round10(c);
  }

  public int round10(int num){
    int i = num%10;
    if(i>=5){
      return num+(10-i);
    }
    return num-i;
  }

  // closeFar -> Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.
  // eg. 1. closeFar(1, 2, 10) → true || 2. closeFar(1, 2, 3) → false || 3. closeFar(4, 1, 3) → true
  public boolean closeFar(int a, int b, int c) {
    return (Math.abs(b-a) <= 1 && Math.abs(c-b) >= 2 && Math.abs(c-a) >= 2  || Math.abs(c-a) <= 1 && Math.abs(b-c) >= 2 && Math.abs(b-a) >= 2);
  }



   // DNC - class closing
 }
