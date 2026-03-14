import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b;
        int a;
        int d=sc.nextInt();
        boolean found=false;
        while(n>0){
            a=n%10;
            n=n/10;
            if(a==d){
                found=true;
                break;
            }
        }
        if(found==true){
            System.out.println("search successful");
        }
        else{
            System.out.println("search unsuccessful");
        }
    }
}
