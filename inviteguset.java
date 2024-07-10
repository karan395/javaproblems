public class inviteguset {
public static int countguset(int n){

if(n<=1){

return 1;
}

int single= countguset(n-1);
int pair = (n-1)*countguset(n-2);

return  single + pair;



}

    public static void main(String[] args) {
        int n =4;
      int result =   countguset(n);
System.out.println(result);

    }
}
