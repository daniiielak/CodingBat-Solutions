/*
 * Name: Array-2.java
 * @autor: Daniela Kepper
 * Date: 19.06.2019
 * Description: this java class provides my solutions for the Java Array-2 exercises of Coding Bat: http://codingbat.com/java/Array-2
 */

 public class Array-1 {

   // countEvens -> return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
   // eg. 1. countEvens([2, 1, 2, 3, 4]) → 3 || 2. countEvens([2, 2, 0]) → 3 || 3. countEvens([1, 3, 5]) → 0
  public int countEvens(int[] nums) {
    int count = 0;
    if(nums.length>0){
    	for(int i = 0; i<nums.length; i++){
    		if(nums[i]%2==0){
    			count++;
        }
      }
    }
    return count;
  }

  // bigDiff -> Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
  // eg. 1. bigDiff([10, 3, 5, 6]) → 7 || 2. bigDiff([7, 2, 10, 9]) → 8 || 3. bigDiff([2, 10, 7, 2]) → 8
  public int bigDiff(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    for(int i = 1; i<nums.length; i++){
    	max = Math.max(max, nums[i]);
    	min = Math.min(min, nums[i]);
    }
    return max - min;
  }

  // centeredAverage -> Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.
  // eg. 1. centeredAverage([1, 2, 3, 4, 100]) → 3 || 2. centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5 || 3. centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
  public int centeredAverage(int[] nums){
    int min = nums[0];
    int max = nums[0];
    int sum = nums[0];
    for(int i = 1; i<nums.length; i++){
    	sum+=nums[i];
    		min = Math.min(min, nums[i]);
    		max = Math.max(max, nums[i]);
    }
    sum = sum - max - min;
    return sum / (nums.length-2);
  }

  // sum13 -> Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
  // eg. 1. sum13([1, 2, 2, 1]) → 6 || 2. sum13([1, 1]) → 2 || 3. sum13([1, 2, 2, 1, 13]) → 6
  public int sum13(int[] nums) {
  	int sum = 0;
  	if(nums.length>0){
  		for(int i = 0; i<nums.length; i++){
    		if(nums[i]==13){
    			if(i!=nums.length-1){
    			i++;
          }
        }
        else{
          sum = sum + nums[i];
        }
      }
    }
    return sum;
  }

  // sum67 -> Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
  // eg. 1. sum67([1, 2, 2]) → 5 || 2. sum67([1, 2, 2, 6, 99, 99, 7]) → 5 || 3. sum67([1, 1, 6, 7, 2]) → 4
  public int sum67(int[] nums) {
    boolean skip = false;
    int sum = 0;
    if(nums.length>0){
    	for(int i = 0; i<nums.length; i++){
    		if(nums[i]==6 && skip==false){
    			skip = true;
        }
        if(nums[i]!=6 && skip==false){
    	    sum = sum + nums[i];
        }
        if(nums[i]==7 && skip==true){
    	    skip=false;
        }
      }
    }
    return sum;
  }

  // has22 -> Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
  // eg. 1. has22([1, 2, 2]) → true || 2. has22([1, 2, 1, 2]) → false || 3. has22([2, 1, 2]) → false
  public boolean has22(int[] nums) {
    if(nums.length>1){
    	for(int i = 0; i<nums.length-1; i++){
    		if(nums[i]==2 && nums[i+1]==2){
    			return true;
        }
      }
    }
    return false;
  }

  // lucky13 -> Given an array of ints, return true if the array contains no 1's and no 3's.
  // eg. 1. lucky13([0, 2, 4]) → true || 2. lucky13([1, 2, 3]) → false || 3. lucky13([1, 2, 4]) → false
  public boolean lucky13(int[] nums) {
  	if(nums.length>0){
  		for(int i = 0; i<nums.length; i++){
  			if(nums[i]==1 || nums[i]==3){
  				return false;
        }
      }
    }
    return true;
  }

  // sum28 -> Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
  // eg. 1. sum28([2, 3, 2, 2, 4, 2]) → true || 2. sum28([2, 3, 2, 2, 4, 2, 2]) → false || 3. sum28([1, 2, 3, 4]) → false
  public boolean sum28(int[] nums) {
  	if(nums.length>3){
  		int countTwos = 0;
  		for(int i = 0; i<nums.length; i++){
  			if(nums[i]==2){
  				countTwos++;
        }
      }
      return (countTwos == 4);
    }
    return false;
  }

  // more14 -> Given an array of ints, return true if the number of 1's is greater than the number of 4's
  // eg. 1. more14([1, 4, 1]) → true || 2. more14([1, 4, 1, 4]) → false || 3. more14([1, 1]) → true
  public boolean more14(int[] nums){
  	int count1 = 0;
  	int count4 = 0;
  	if(nums.length>0){
  		for(int i = 0; i<nums.length; i++){
    		if(nums[i]==1){
    			count1++;
        }
        if(nums[i]==4){
  	      count4++;
        }
      }
    }
    return count1>count4;
  }

  // fizzArray -> Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. The syntax to make a new int array is: new int[desired_length]
  // eg. 1. fizzArray(4) → [0, 1, 2, 3] || 2. fizzArray(1) → [0] || 3. fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
  public int[] fizzArray(int n) {
  	int[] arrayCreation = new int[n];
  	for(int i = 0; i<n; i++){
  		arrayCreation[i] = i;
    }
    return  arrayCreation;
  }

  // only14 -> Given an array of ints, return true if every element is a 1 or a 4.
  // eg. 1. only14([1, 4, 1, 4]) → true || 2. only14([1, 4, 2, 4]) → false || 3. only14([1, 1]) → true
  public boolean only14(int[] nums) {
    if(nums.length>0){
      for(int i = 0; i<nums.length; i++){
        if(nums[i]!=1 && nums[i]!=4){
          return false;
        }
      }
    }
    return true;
  }

  // fizzArray2 -> Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types. The syntax to make a new string array is: new String[desired_length]
  // eg. 1. fizzArray2(4) → ["0", "1", "2", "3"] || 2. fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"] || 3. fizzArray2(2) → ["0", "1"]
  public String[] fizzArray2(int n) {
    String[] newArray = new String[n];
    for(int i = 0; i<n; i++){
      newArray[i] = String.valueOf(i);
    }
    return newArray;
  }

  // no14 -> Given an array of ints, return true if it contains no 1's or it contains no 4's.
  // eg. 1. no14([1, 2, 3]) → true || 2. no14([1, 2, 3, 4]) → false || 3. no14([2, 3, 4]) → true
  public boolean no14(int[] nums) {
    int firstOne = 0;
    for(int i = 0; i<nums.length; i++){
      if(firstOne==0 && (nums[i]==1 || nums[i]==4)){
        firstOne = nums[i];
      }
      else if(firstOne!=0 && (nums[i]==1 || nums[i]==4)){
        if(firstOne!=nums[i]){
          return false;
        }
      }
    }
    return true;
  }

  // isEverywhere -> We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.
  // eg. 1. isEverywhere([1, 2, 1, 3], 1) → true || isEverywhere([1, 2, 1, 3], 2) → false || 3. isEverywhere([1, 2, 1, 3, 4], 1) → false
  public boolean isEverywhere(int[] nums, int val) {
    for(int i = 0; i<nums.length-1; i++){
      if(nums[i]!=val && nums[i+1]!=val){
        return false;
      }
    }
    return true;
  }

  // either24 -> Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
  // eg. either24([1, 2, 2]) → true || 2. either24([4, 4, 1]) → true || 3. either24([4, 4, 1, 2, 2]) → false
  public boolean either24(int[] nums) {
    int winner = 0;
    for(int i = 0; i<nums.length-1; i++){
      if(winner==0 && ((nums[i]==2 && nums[i+1]==2)|| (nums[i]==4 && nums[i+1]==4))){
        winner = nums[i];
      }
      else if(winner!=0 && ((nums[i]==2 && nums[i+1]==2)|| (nums[i]==4 && nums[i+1]==4))){
        if(winner!=nums[i]){
          return false;
        }
      }
    }
    if(winner==0){
      return false;
    }
    return true;
  }

  // matchUp -> Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
  // eg. 1. matchUp([1, 2, 3], [2, 3, 10]) → 2 || 2. matchUp([1, 2, 3], [2, 3, 5]) → 3 || 3. matchUp([1, 2, 3], [2, 3, 3]) → 2
  public int matchUp(int[] nums1, int[] nums2) {
    int sum = 0;
    int currentMatch = 0;
    for(int i = 0; i<Math.min(nums1.length, nums2.length); i++){
      currentMatch = Math.abs(nums1[i]-nums2[i]);
      if(currentMatch>0 && currentMatch<=2){
        sum++;
      }
    }
    return sum;
  }

  // has77 -> Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.
  // eg. 1. has77([1, 7, 7]) → true || 2. has77([1, 7, 1, 7]) → true || 3. has77([1, 7, 1, 1, 7]) → false
  public boolean has77(int[] nums) {
    if(nums.length>1){
      for(int i = 0; i<nums.length-2; i++){
        if(nums[i]==7 && (nums[i+1]==7 || nums[i+2]==7)){
          return true;
        }
      }
      if(nums[nums.length-1]==7 && nums[nums.length-2]==7){
        return true;
      }
    }
    return false;
  }

  // has12 -> Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
  // eg. 1. has12([1, 3, 2]) → true || 2. has12([3, 1, 2]) → true || 3. has12([3, 1, 4, 5, 2]) → true
  public boolean has12(int[] nums) {
    if(nums.length>1){
      boolean found1 = false;
      for(int i = 0; i<nums.length; i++){
        if(nums[i]==1 && !found1){
          found1=true;
        }
        if(found1 && nums[i]==2){
          return true;
        }
      }
    }
    return false;
  }

  // modThree -> Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
  // eg. 1. modThree([2, 1, 3, 5]) → true || 2. modThree([2, 1, 2, 5]) → false || 3. modThree([2, 4, 2, 5]) → true
  public boolean modThree(int[] nums) {
    if(nums.length>=3){
      for(int i = 0; i<nums.length-2; i++){
        if(nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0){
          return true;
        }
        else if(nums[i]%2!=0 && nums[i+1]%2!=0 && nums[i+2]%2!=0){
          return true;
        }
      }
    }
    return false;
  }

  // haveThree -> Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
  // eg. 1. haveThree([3, 1, 3, 1, 3]) → true || 2. haveThree([3, 1, 3, 3]) → false || 3. haveThree([3, 4, 3, 3, 4]) → false
  public boolean haveThree(int[] nums) {
    if(nums.length>=5){
      int count3 = 0;
      for(int i = 0; i<nums.length-1; i++){
        if(nums[i]==3 && nums[i+1]!=3){
          count3++;
        }
      }
      if(nums[nums.length-1]==3 && nums[nums.length-2]!=3){
        count3++;
      }
      return count3==3;
    }
    return false;
  }

} // DNC - class closing
