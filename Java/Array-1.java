/*
 * Name: Array-1.java
 * @autor: Daniela Kepper
 * Date: 11.03.2018
 * Description: this java class provides my solutions for the Java Array-1 exercises of Coding Bat: http://codingbat.com/java/Array-1
 */

 public class Array-1 {

   // firstLast6 -> Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
   // e.g. 1. firstLast6([1, 2, 6]) → true 2. firstLast6([6, 1, 2, 3]) → true 3. firstLast6([13, 6, 1, 2, 3]) → false
   public boolean firstLast6(int[] nums) {
    if(nums[0]==6 || nums[nums.length-1]==6){
      return true;
    }
    return false;
  }

  // sameFirstLast -> Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
  // e.g. 1. sameFirstLast([1, 2, 3]) → false 2. sameFirstLast([1, 2, 3, 1]) → true 3. sameFirstLast([1, 2, 1]) → true
  public boolean sameFirstLast(int[] nums) {
    return (nums.length>=1 && nums[0]==nums[nums.length-1]);
  }

  // makePi -> Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
  // e.g. 1. makePi() → [3, 1, 4]
  public int[] makePi() {
    int[] pi = {3, 1, 4};
    return pi;
  }

  // commonEnd -> Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
  // e.g. 1. commonEnd([1, 2, 3], [7, 3]) → true 2. commonEnd([1, 2, 3], [7, 3, 2]) → false 3. commonEnd([1, 2, 3], [1, 3]) → true
  public boolean commonEnd(int[] a, int[] b) {
    return ((a[0]==b[0]) || (a[a.length-1]==b[b.length-1]));
  }

  // sum3 -> Given an array of ints length 3, return the sum of all the elements.
  // e.g. 1. sum3([1, 2, 3]) → 6 2. sum3([5, 11, 2]) → 18 3. sum3([7, 0, 0]) → 7
  public int sum3(int[] nums) {
    return nums[0] + nums[1] + nums[2];
  }


   // DNC - class closing tag
 }
