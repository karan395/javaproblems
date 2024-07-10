import java.util.*;



public class functions {
    
// public static void giveName(String name){

// System.out.println(name);

// }

// public static int multiply(int a,int b){


//     return a*b;

// }

public static void  factor(Float a){
    if(a==0){
        System.out.println(1);
        return;
    }

    else if(a<0){

        System.out.println("negative number");
        return;
    }
    float fac=1;
for(float i=a;i>=1;i--){
 
fac= fac*i;
}
System.out.println(fac);

}




public static void main(String[] args)
{


 Scanner sc=  new Scanner(System.in);
// String name = sc.next();

//  giveName(name);
float a= sc.nextFloat();

factor(a);
// int b= sc.nextInt();

// int d =multiply(a, b);

// System.out.println(d);
// }
}
}


