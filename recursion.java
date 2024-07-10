public class recursion {
//     public static void main(String[] args) {
        
// int n = 0;
// printnumber(n);


//     }

//     public static void  printnumber(int n){
// if(n==0){
//     return;
// }
// System.out.println(n);
// printnumber(n-1);
   


// public static void main(String[] args) {
//     fibonaci(6, 0, 0);

// }

// public static void fibonaci(int n ,int i , int sum ){

// if(i==n){

//     sum = sum +i;
// System.out.println(sum);
// return;


// }
//     sum = sum +i;
//     fibonaci(n, i+1 , sum);

// }

public static void main(String[] args) {
    
// int n =5 ;
// int ans= factorial(n);


// System.out.println(ans);


// }



// public static int factorial(int n){
// if(n==1 || n==0){

// return 1;

// }
// int fct1= factorial(n-1);

// int fact= n * fct1;
// return fact;



///fibbonaci


// int n=7;
// int a =0;
// int b=1;
// System.out.println(a);
// System.out.println(b);
// fibonaci(a,b,n-2);
// }



// public static void fibonaci(int a,int b,int n){


// if (n==0){


//     return;
// }

// int c = a+b;
// System.out.println(c);

// fibonaci(b, c, n-1);

// }



int n =2;           ///////recursion with log n height 
int a = 4;
 int result= powerof(n, a);
  System.out.println(result);


}
public static int powerof(int x,int n){
if(n == 0){

    return 1;
}
if(x == 0){

    return 0;
}
    

if (n%2 == 0){

    return powerof(x, n/2)  * powerof(x, n/2);
    
    }
    else{
    
        return powerof(x, n/2) * powerof(x, n/2) * x ;
    }

}

}
