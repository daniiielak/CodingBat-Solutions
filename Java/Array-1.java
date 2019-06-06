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

  // rotateLeft3 -> Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
  // eg. 1. rotateLeft3([1, 2, 3]) → [2, 3, 1] || 2. rotateLeft3([5, 11, 9]) → [11, 9, 5] || 3. rotateLeft3([7, 0, 0]) → [0, 0, 7]
  public int[] rotateLeft3(int[] nums) { // solution for an array with potential larger size
    int[] newArray = new int[nums.length];
    for (int i = 1; i<nums.length; i++){
      newArray[i-1] = nums[i];
    }
    newArray[(nums.length)-1] = nums[0];
    return newArray;
  }

  public int[] rotateLeft3(int[] nums) { // solution for 3 nums in array only
    return new int[] {nums[1], nums[2], nums[0]};
  }

  //  reverse3 -> Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
  // eg. 1. reverse3([1, 2, 3]) → [3, 2, 1] || 2. reverse3([5, 11, 9]) → [9, 11, 5] || reverse3([7, 0, 0]) → [0, 0, 7]
  public int[] reverse3(int[] nums) { // solution for an array with potential larger size
    int[] newArray = new int[nums.length];
    int base = 0;
    for (int i = nums.length-1; i >= 0; i--){
      newArray[base] = nums[i];
      base++;
    }
    return newArray;
  }

  public int[] reverse3(int[] nums) {
    return new int[] {nums[2], nums[1], nums[0]};
  }

  // maxEnd3 -> Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
  // eg. 1. maxEnd3([1, 2, 3]) → [3, 3, 3] || 2. maxEnd3([11, 5, 9]) → [11, 11, 11] || 3. maxEnd3([2, 11, 3]) → [3, 3, 3]
  public int[] maxEnd3(int[] nums) {
    if(nums[0]>nums[nums.length-1]){
      return new int[]{nums[0], nums[0], nums[0]};
    }
    return new int[]{nums[nums.length-1], nums[nums.length-1], nums[nums.length-1]};
  }

  // sum2 -> Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
  // eg. 1. sum2([1, 2, 3]) → 3 || 2. sum2([1, 1]) → 2 || 3. sum2([1, 1, 1, 1]) → 2
  public int sum2(int[] nums) {
    if (nums.length>=2){
      return nums[0] + nums[1];
    }
    else if (nums.length==1){
      return nums[0];
    }
    return 0;
  }

  // middleWay -> Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
  // eg. 1. middleWay([1, 2, 3], [4, 5, 6]) → [2, 5] || 2. middleWay([7, 7, 7], [3, 8, 0]) → [7, 8] || 3. middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
  public int[] middleWay(int[] a, int[] b) {
    return new int[]{a[1], b[1]};
  }

  // makeEnds -> Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
  // eg. 1. makeEnds([1, 2, 3]) → [1, 3] || 2. makeEnds([1, 2, 3, 4]) → [1, 4] || 3. makeEnds([7, 4, 6, 2]) → [7, 2]
  public int[] makeEnds(int[] nums) {
    return new int[]{nums[0], nums[nums.length-1]};
  }

  // has23 -> Given an int array length 2, return true if it contains a 2 or a 3.
  // eg. 1. has23([2, 5]) → true || 2. has23([4, 3]) → true || 3. has23([4, 5]) → false
  public boolean has23(int[] nums) {
    return (nums[0]==2 || nums[0]==3 || nums[1]==2 || nums[1]==3);
  }

  public boolean has23(int[] nums) {
    for (int i = 0; i < nums.length; i++){
      if (nums[i]==2 || nums[i]==3){
        return true;
      }
    }
    return false;
  }

  // no23 -> Given an int array length 2, return true if it does not contain a 2 or 3.
  // eg. 1. no23([4, 5]) → true || 2. no23([4, 2]) → false || 3.- no23([3, 5]) → false
  public boolean no23(int[] nums) {
    return (nums[0]!=2 && nums[0]!= 3 && nums[1]!=2 && nums[1]!= 3);
  }

  public boolean no23(int[] nums) {
    for(int i=0; i<nums.length; i++){
      if(nums[i]==2 || nums[i]==3){
        return false;
      }
    }
    return true;
  }

  // makeLast -> Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
  // eg. 1. makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6] || 2. makeLast([1, 2]) → [0, 0, 0, 2] || 3. makeLast([3]) → [0, 3]
  public int[] makeLast(int[] nums) {
    int[] newArray = new int[nums.length * 2];
    newArray[newArray.length-1] = nums[nums.length-1];
    return newArray;
  }

  // double23 -> Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
  // eg. 1. double23([2, 2]) → true || 2. double23([3, 3]) → true || 3. double23([2, 3]) → false
  public boolean double23(int[] nums) {
    int count2 = 0;
    int count3 = 0;
    for (int i = 0; i<nums.length; i++){
      if(nums[i]==2){
        count2++;
        }
      else if(nums[i]==3){
        count3++;
      }
    }
    return (count2>=2 || count3>=2);
  }

  // fix23 -> Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array
  // eg. 1. 23([1, 2, 3]) → [1, 2, 0] || 2. fix23([2, 3, 5]) → [2, 0, 5] || 3. fix23([1, 2, 1]) → [1, 2, 1]
  public int[] fix23(int[] nums) {
    for (int i=0; i<nums.length-1; i++){
      if(nums[i]==2 && i!=2){
        if(nums[i+1]==3){
          nums[i+1]=0;
        }
      }
    }
    return nums;
  }

  // start1 -> Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
  // eg. 1. start1([1, 2, 3], [1, 3]) → 2 || 2. start1([7, 2, 3], [1]) → 1 || 3. start1([1, 2], []) → 1
  public int start1(int[] a, int[] b) {
    int sum = 0;
    if(a.length!=0 && a[0]==1){
      sum++;
    }
    if(b.length!=0 && b[0]==1){
      sum++;
    }
    return sum;
  }

  // biggerTwo -> Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
  // eg. 1. biggerTwo([1, 2], [3, 4]) → [3, 4] || 2. biggerTwo([3, 4], [1, 2]) → [3, 4] || 3. biggerTwo([1, 1], [1, 2]) → [1, 2]
  public int[] biggerTwo(int[] a, int[] b) {
    int sumA = a[0] + a[1];
    int sumB = b[0] + b[1];
    if(sumA>sumB || sumA==sumB){
      return a;
    }
    return b;
  }

  public int[] biggerTwo(int[] a, int[] b){
    if((a[0]+a[1]) < (b[0]+b[1])){
      return b;
    }
    return a;
  }

  // makeMiddle -> Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.
  // eg. 1. makeMiddle([1, 2, 3, 4]) → [2, 3] || 2. makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3] || 3. makeMiddle([1, 2]) → [1, 2]
  public int[] makeMiddle(int[] nums) {
    int half = (nums.length-1)/2;
      return new int[] {nums[half], nums[half+1]};
  }

} // class closing
