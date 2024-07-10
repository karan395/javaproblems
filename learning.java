import java.util.*;

public class learning {


//     public static void main(String[] args){
//    // System.out.println("my nam is karan");

//     StringBuilder s = new StringBuilder("hello");
//     StringBuilder news = new StringBuilder();

//   //  System.out.println(s);

// //     s.append('b');
// //     s.insert(2, 'd');
// // s.delete(2, 4);
// //     System.out.println(s);
// // int tb =s.length();


// // for(int i =tb-1;i>=0;i--){

// // news.append(s.charAt(i));


    
// //     }
// //     System.out.println(news);
// // int a= 10;
// // int b = 0;
// // //  b = ~a;
// // //  System.out.println(a);

// // // System.out.println(b);
// // System.err.println(a);

// // int c= a<<1;
// // System.err.println(c);
// int n=5;
// int op=3;
// int bitmask = 1<<op;

// if((bitmask & n) == 0 ){
//     System.out.println("zero bit");
// }
//     else{

//         System.out.println("1 bit");
//     }

public static void main(String[] args) {
//     int number = 20; // You can change this to test other numbers

//     if (isPowerOfTwo(number)) {
//         System.out.println(number + " is a power of two.");
//     } else {
//         System.out.println(number + " is not a power of two.");
//     }
// }

// public static boolean isPowerOfTwo(int n) {
//     if (n <= 0) {
//         return false;
//     }
//     return (n & (n - 1)) == 0;
// }


// int n= 5; /// 0101
// int pos =2;          
// int bit = 1<<pos;   // 0001     0100

// //  int newbit = bit | n ;

// //  System.out.println(newbit);

// int newb = ~(bit);  //  1011

// int result = newb & n;    // 1011 & 0101
// System.err.println(result);


// Scanner sc  = new Scanner(System.in);
// int number  = sc.nextInt();
// int pos =1;
// int bit  = 1<<pos;
// if ((bit & number)==0){

//     System.out.println("number is power of 2");
// }

// else{
//     System.out.println("numbe ris not power of two");
// }

    // int decimalNumber = 29;
    // String binaryString = decimalToBinary(decimalNumber);
    // System.out.println("Decimal: " + decimalNumber + " -> Binary: " + binaryString);

//     String binaryNumber = "11101";
//     int decimalValue = binaryToDecimal(binaryNumber);
//     System.out.println("Binary: " + binaryNumber + " -> Decimal: " + decimalValue);


// // Function to convert decimal to binary
// public static String decimalToBinary(int n) {
//     return Integer.toBinaryString(n);
// }

// // Function to convert binary to decimal
// public static int binaryToDecimal(String binary) {
//     return Integer.parseInt(binary, 2);
// }
int arr[]= {3,30,34,5,9};

StringBuilder sb = new StringBuilder();

for(int i=0 ;i<arr.length;i++){


    sb.append(arr[i]);
}
sb.reverse();
return sb.toString();

}


}


