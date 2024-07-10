import java.util.*;


public class practiceexercise {
   public static void main(String args[]) {
    //    int positive = 0, negative = 0, zeros = 0;
    //    System.out.println("Press 1 to continue & 0 to stop");
        Scanner sc = new Scanner(System.in);
    //    int input = sc.nextInt();


    //    while(input == 1) {
    //        System.out.println("Enter your number : ");
    //        int number = sc.nextInt();
    //        if(number > 0) {
    //            positive++;
    //        } else if(number < 0) {
    //            negative++;
    //        } else {
    //            zeros++;
    //        }


    //        System.out.println("Press 1 to continue & 0 to stop");
    //        input = sc.nextInt();
    //    }


    //    System.out.println("Positives : "+ positive);
    //    System.out.println("Negatives : "+ negative);
      // System.out.println("Zeros : "+ zeros);
//   
int row =sc.nextInt();
int column =sc.nextInt();

int arr[][]=new int[row][column];


for(int i=0;i<row;i++){


    for(int j=0;j<column;j++){

        arr[i][j]=sc.nextInt();
    }
}

int number =sc.nextInt();
for(int i=0;i<row;i++){

    for(int j=0;j<column;j++){
      
    
   if( number==arr[i][j]){

System.out.println("number is " + i  + "," +  j  );

   }


    }
}
   }   
}
