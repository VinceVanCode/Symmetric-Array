package com.company;

import java.util.Arrays;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
//

        //}int[] array = new int[] {1,2,3,4,5,6};
//        int length = array.length;
//        System.out.println(length);
//        int[] reversed = new int[array.length];
//        for (int index = 0; index < array.length; index++) {
//            reversed[length - index - 1] = array[index];
//        }
//        System.out.println(Arrays.toString(reversed));
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i]= scan.nextInt();
            }
            boolean symmetric = true;
            for (int i = 0; i <(array.length + 1) / 2 ; i++) {
                if (array[i] != array[n - i - 1]){
                    symmetric = false;
                }
            }
            System.out.printf("Symmetric? %b%n",symmetric);
    }
}
