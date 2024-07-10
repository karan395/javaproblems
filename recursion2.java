// public class recursion2 {
    

//     public static void main(String[] args) {

//         // int n=3;               /////tower of hanaoi 

//     //     // hanaoi(n,"s","h","d");
//     //     int a = 153;
//     //     int c = a;

//     //     int sum =0;
//     //     while(a>0){
       
//     //  int    b = a%10;
//     //     sum = sum + b*b*b;
 
//     //     a=a/10;

//     //     }

//     // if(sum == c){


//     //     System.out.println("armstron number"   +  sum );
//     // }

//     // else

//     // System.out.println("not a armstron number"  + "  "  + sum   + "original number" + a );

//     // }


// //     public static void   hanaoi(int n,String src,String helper,String destination){

// // if(n==1){

// //     System.out.println("n   "+  n+ "   Src   " +src + "  dest  " + destination);
// //     return;
// // }

// // hanaoi(n-1,src,destination,helper);

// // System.out.println("n1   "+  n+ "   Src1   " +src + "  dest1  " + destination);

// // hanaoi(n-1,helper,src,destination);


// String a = "abcd";
// revstring(a, a.length()-1);
//     }                                      /////////////////////////////////  reverse a string 

// ////reverse a string
// public static void revstring(String a,int idx){


// if (idx==0){

// System.out.println(a.charAt(idx));
// return;

// }
// System.out.print(a.charAt(idx));
// revstring(a, idx-1);

// }



// }

import java.util.HashSet;

public class recursion2 {
// public static int first =-1;    ///////////find first and last occurance in string
// public static int  last = -1;



//     public static void occurance(String a,char eleme,int idx){
// if(idx == a.length()){

// System.out.println(first);
// System.out.println(last);
// return;
  
// }

//         char curr = a.charAt(idx);

//         if(curr ==eleme){
//             if(first ==-1){


// first = idx;


//             }
// else{

//     last =idx;
// }


//         }


// occurance(a, eleme, idx+1);



//     }


//     public static void main(String[] args) {

//         String a = "abcaaaduwvvbac";
//     occurance(a,'d',0);
        
//     }

// public static boolean increasing(int arr[],int ind){                     ///////////////check if array is sorted 


// if(ind == arr.length-1){

// return true;
// }


// if(arr[ind]>=arr[ind+1]){
//  return  false ;

// }
// return increasing(arr, ind+1);



// }

// public static void main(String[] args) {
    

//     int arr[]= {1,2,3,4,5};

// boolean result = increasing(arr, 0);
// System.out.println(result);

// if(result=true){
//     System.out.println("sorted arrya");

// }
// else{
//     System.out.println("npot a sorted arrya");
// }



// public static void main(String[] args) {               //////////// move x to the end of the array 
    
// String str= "axbxcxdx";

// String empty= "";
// movealx(str, 0, empty, 0);

// }

// public static void movealx(String str,int ind,String empty,int count){

// if(ind==str.length()){

// for(int i=0;i<count;i++){
// empty=empty+'x';


// }
// System.out.println(empty);
//     return;
// }


// char current = str.charAt(ind);
// if(current=='x'){

// count++;
// movealx(str, ind+1, empty, count);
// }
// else{

// empty= empty+ current;
// movealx(str, ind+1, empty, count);

// }

// }





// public static boolean[] map = new boolean[26];      ///////////////////remove duplicates from string 
// public static void main(String[] args) {
    

// String str="abcabbsess";
// String emp = "";

// removeduplicate(str, 0,emp);
// }

// public static void  removeduplicate(String str,int ind,String emp){

//     if(ind == str.length()){

//         System.out.println(emp);
//         return;
        
//         }

// char current = str.charAt(ind);




// if(map[current-'a'] == true){


//     removeduplicate(str, ind+1, emp);
// }

// else{
// emp= emp + current;
// map[current-'a']=true;
// removeduplicate(str, ind+1, emp);

// }


// }
public static void main(String[] args) {
    
    String str= "aaa";
    String emp="";
    HashSet<String> set = new HashSet<>();
    substrings(str, 0, emp,set);

}


public static void substrings(String str,int ind,String emp,HashSet<String> set){



    if(ind ==str.length()){

if (set.contains(emp)){


    return;
}

else

System.out.println(emp);    
set.add(emp);
return;
}




char current = str.charAt(ind);


substrings(str, ind+1, emp+current,set);

substrings(str, ind+1, emp,set);
}



}











