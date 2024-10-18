package Dsa;

import java.util.Scanner;

public class Sorting {
    public static void func(int arr[]){
        System.out.println("Sorted array is:");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]);
            System.out.print(" ");
    }}
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];

    System.out.println("Enter elements of array:");
    for(int p=0;p<=n-1;p++){
        int ae = sc.nextInt();
        arr[p] = ae;
    }
    System.out.println();
    System.out.println("Elements in array are");
    for(int a:arr){
        System.out.print(a);
        System.out.print(" ");
    }
   System.out.println();
    for(int i = 0;i<arr.length-1;i++){
        for(int j =0;j<arr.length-i-1;j++){
        if(arr[j]>arr[j+1]){
            
            int temp = arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;   
        }} }
    System.out.println();
    func(arr);
    

 }
    
}