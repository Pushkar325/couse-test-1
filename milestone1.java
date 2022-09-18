// 1Q)  rectungular number

import java.util.*;
public class Solution {
    public static void main(String[] args) {
		// Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i< arr.length;i++) arr[i]=scanner.nextInt();
        int sum=0,max=Integer.MIN_VALUE;
        
        for(int i = 0; i<k && i<n ; i++){
            sum+=arr[i];
            
        }
        max = sum;
        int j = 0;
        for (int i=k;i<n;i++) {
           sum-= arr[j];
           j++;
           sum+=arr[i];
           max = max<sum ?sum:max;
        }

        System.out.println(max);
    }
}




// 2Q)   find the maximum sum


import java.util.*;
public class Solution {
    public static void main(String[] args) {
		// Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i< arr.length;i++) arr[i]=scanner.nextInt();
        int sum=0,max=Integer.MIN_VALUE;
        
        for(int i = 0; i<k && i<n ; i++){
            sum+=arr[i];
            
        }
        max = sum;
        int j = 0;
        for (int i=k;i<n;i++) {
           sum-= arr[j];
           j++;
           sum+=arr[i];
           max = max<sum ?sum:max;
        }

        System.out.println(max);
    }
}







// Q3    faulty keyboard




import java.util.Scanner;
public class Solution {
    public static boolean isPossible(String name, String typed) {
        // Write your code here
        if(name.length() > typed.length()) return false;
        
        int i = 0;
        int j = 0;
        
        while(i != name.length() && j != typed.length()) {
            if(name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if(i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
                j++;
            } else {
                return false;
            }
        }
        
        while(j < typed.length()) {
            if(typed.charAt(j) != name.charAt(i - 1)) return false; 
            j++;
        }
        
        return i < name.length() ? false : true;
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            String name = scn.next();
        String typed = scn.next();

        boolean res = isPossible(name, typed);

        System.out.println(res);
        }
            }
}

