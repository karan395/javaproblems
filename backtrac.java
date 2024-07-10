
///////////////print permutation backtarking in java




public class backtrac {

    public static void printper(String str,String per,int idx){
if(str.length()==0){

    System.out.println(per);
    return;
}

for(int i = 0;i<str.length();i++){


    char curr=str.charAt(i);
    String newst = str.substring(0, i) + str.substring(i+1);
    printper(newst, per + curr, idx + 1);
}




    }
    public static void main(String[] args) {
        String str = "ABC";
        printper(str,"" , 0);
    }

}
