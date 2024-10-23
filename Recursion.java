package Dsa;

public class Recursion {
   
    public static void  fun1(int a,int b,int n){

        if(n==0){
            
            
            return;
        }
       else{
        
        int c = a+b;
        System.out.print(c);
        System.out.print(" ");
        
        
        
        fun1(b,c,n-1);}
        
        
        
        
        }
        
    
    public static void main(String[] args) {
        
        int a =0;
        int b =1;
        int n = 7;
        System.out.print(a+" "+b+" ");
        
        fun1(a,b,n-2);
        
    
    }
}
