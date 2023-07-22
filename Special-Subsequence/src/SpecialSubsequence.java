import java.util.Scanner;

public class SpecialSubsequence {
    public static int pairs(String str, int n){
        int result=0;
        int A_count= 0;
        for(int i=0;i<n;i++){
            if(str.charAt(i) =='A'){
                A_count++;
            }
            else if(str.charAt(i)=='G'){
                result+=A_count;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int n= str.length();
        System.out.println(pairs(str, n));
    }
}
