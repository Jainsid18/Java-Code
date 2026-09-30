//Problem statement: remove adjacently duplicate elements 
 
//List<Integer> removeAdjacentDuplicates(int[] input){
//Sample Input: [1,1,2,3,4,4,5,4,6,7,7,8,9,8]
//Sample Output: [1,2,3,4,5,4,6,7,8,9,8]

import java.util.*;

public class AdjacentDuplicate {

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,4,4,5,4,6,7,7,8,9,8};

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        System.out.println(stack);
    }
}
		
		
	