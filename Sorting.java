package Dsa;

import java.util.Scanner;

public class Sorting {

    //1 . BUBBLE SORT

//     public static void func(int arr[]){
//         System.out.println("Sorted array is:");
//         for(int j=0;j<arr.length;j++){
//             System.out.print(arr[j]);
//             System.out.print(" ");
//     }}
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int [] arr = new int[n];

//     System.out.println("Enter elements of array:");
//     for(int p=0;p<=n-1;p++){
//         int ae = sc.nextInt();
//         arr[p] = ae;
//     }
//     System.out.println();
//     System.out.println("Elements in array are");
//     for(int a:arr){
//         System.out.print(a);
//         System.out.print(" ");
//     }
//    System.out.println();
//     for(int i = 0;i<arr.length-1;i++){
//         for(int j =0;j<arr.length-i-1;j++){
//         if(arr[j]>arr[j+1]){
            
//             int temp = arr[j];
//             arr[j]=arr[j+1];
//             arr[j+1]=temp;   
//         }} }
//     System.out.println();
//     func(arr);
    

//  }

//2. SELECTION SORT
// public static void func(int arr[]){
//             System.out.println("Sorted array is:");
//             for(int j=0;j<arr.length;j++){
//                 System.out.print(arr[j]);
//                 System.out.print(" ");
//         }}
// public static void main(String[] args) {
//  int [] arr = {7,8,3,1,2};

// for(int i=0;i<arr.length-1;i++){
//     int smal = i;
//     for (int j = i + 1; j < arr.length; j++) {
//         if (arr[j] < arr[smal]) {
//             smal = j; // Update the smallest index
//         }}
//    int temp = arr[smal];
//    arr[smal] = arr[i];
//    arr[i] = temp;

   
// }
// func(arr);


//3. INSSERTION SORT

// public static void fun(int[] s) {
//     for (int i = 0; i < s.length; i++) {
//         System.out.print(s[i] + " ");
//     }
//     System.out.println();
// }

// public static void main(String[] args) {
//     int[] arr = {5, 2, 9, 1, 5, 6 };  // Original array
//     int[] s = new int[6];         // Array for sorting
    
//     // Copy the first element of arr to s
//     s[0] = arr[0];
    
//     // Perform insertion sort
//     for (int i = 1; i < arr.length; i++) {
//         int key = arr[i];  // The element to be inserted
//         int j = i - 1;

//         // Shift elements of s[0..i-1] that are greater than key
//         while (j >= 0 && s[j] > key) {
//             s[j + 1] = s[j];
//             j--;
//         }
//         // Insert the key element at the correct position
//         s[j + 1] = key;
//     }

//     // Print the sorted array
//     fun(s);
// }
}