public class recursioncount {
    public static void main(String[] args) {

        int n=3;
        int m=3;
        int totatpath = countpath(0, 0, n, m) ;
        System.out.println(totatpath);
        
    }
public static int countpath(int i,int j,int n,int m){
if(i==n || j==m){

    return 0;
}



if(i == n-1 && j == n-1 ){

return 1;

}

int downpath = countpath(i, j+1, n, m);
int sidepath= countpath(i+1, j, n, m);
return downpath + sidepath;


    }
}
