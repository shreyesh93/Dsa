package Dsa;

public class Recursion {

   //1. Fibo using recursion 

    public static void  fun1(int a,int b,int n){

        if(n==0){
            
            return;
        }
       else{
        
        int c = a+b;
        System.out.print(c);
        System.out.print(" ");

        fun1(b,c,n-1);}  // will work as a=b, b = c also as we are getting 3,4,5... and so on terms we are doing n-1
        }
        
    
    public static void main(String[] args) {
        
        int a =0;
        int b =1;
        int n = 7;
        System.out.println("Fibonacci series till"+" "+n+" "+"is:");
        System.out.print(a+" "+b+" ");
        
        fun1(a,b,n-2);  // n =5 and we are already printting 2 terms(0 and 1) , therefore n - 2
  
    }
}
