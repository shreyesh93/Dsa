package Dsa;

public class Recursion {

   //1. Fibo using recursion 

    // public static void  fun1(int a,int b,int n){

    //     if(n==0){
            
    //         return;
    //     }
    //    else{
        
    //     int c = a+b;
    //     System.out.print(c);
    //     System.out.print(" ");

    //     fun1(b,c,n-1);}  // will work as a=b, b = c also as we are getting 3,4,5... and so on terms we are doing n-1
    //     }
        
    
    // public static void main(String[] args) {
        
    //     int a =0;
    //     int b =1;
    //     int n = 7;
    //     System.out.println("Fibonacci series till"+" "+n+" "+"is:");
    //     System.out.print(a+" "+b+" ");
        
    //     fun1(a,b,n-2);  // n =5 and we are already printting 2 terms(0 and 1) , therefore n - 2
  
    // }

    //2 . Power using Recursion (stack height = logn)

        // public static int pof(int x, int n){
        //     if(n==0){
        //         return 1;
        //     }
        //     if(x ==0){
        //         return 0;
        //     }
        //     if(n%2==0){
        //         return pof(x, n/2)*pof(x, n/2);
        //     }
        //     else{
        //         return pof(x, n/2)*pof(x, n/2)*x;
        //     }
        // }
        // public static void main(String[] args) {
        //     int x = 2, n = 5;
        //     int powa = pof(x, n);
        //     System.out.println(powa);
        // }

    //3. Tower of Hanoi using Recursion (Time complexity = 2^n)
    
    // public static void toh(int n,String src, String helper, String dest){
    //     if(n==1){
    //         System.out.println("Transfer disk "+ n + " from "+src+" to "+dest);
    //         return;
    //     }
    //     toh(n-1, src, dest, helper);
    //     System.out.println("Transfer disk "+ n + " from "+src+" to "+dest);
    //     toh(n-1, helper, src, dest);
    // }


    // public static void main(String[] args) {    
    //     int n = 4; 
    //     toh(n, "S", "H", "D");
        
    // }


    //4. Reverse a string using recursion (time complexity = O(n), where n =  length of string)

    // public static void func(String s,int ind){
    //     if(ind==0){
    //         System.out.print(s.charAt(ind));
    //         return;}
    //     System.out.print(s.charAt(ind));
    //     func(s, ind-1);
    // }

    // public static void main(String[] args) {
    //     String s = "shrey";
    //     func(s,4);
    // }


    //5. Find first and last occurance of a character using Recurison (Time comp = O(n), where n = length of string)

    // public static int f = -1; // f and l are -1 such that it wont confuse if its a value of a var or of array
    // public static int l = -1;

    // public static void FandL(String s, int idx, char ele){
        
    //     if(idx==s.length()){
    //         if(f==-1 && l==-1){                                            // Base condition
    //             System.out.println("char dosent exist in given string");
    //         }
    //         else{
    //         System.out.println(f);
    //         System.out.println(l);}
    //         return;
    //     }
    //     char cond = s.charAt(idx);
    //     if(cond==ele){
    //         if(f==-1){
    //             f = idx;
    //         }
    //         l = idx;
    //     }
        
    //     FandL(s, idx+1, ele);
    // }
    // public static void main(String[] args) {
    //     String s = "ababacbabac";
    //     FandL(s, 0, 'b');
        
    // }
}
