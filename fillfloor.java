public class fillfloor {
    
public static void main(String[] args) {
int m=2;
int n=4;
  System.out.println(florrtile(n,m));
}
public static int florrtile(int n ,int m){

   if(n==m){

    return 2;
   }
   if(n<m){


    return 1;
   }
int side = florrtile( n-m, m);

int down = florrtile( n-1, m);

return side + down;


}

}
