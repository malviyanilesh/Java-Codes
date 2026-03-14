// DECLARE a:INTEGER
// DECLARE b:INTEGER
// SET a:=15,b:=7
// a=a MOD (a-3)
// b=b MOD(b-3)
// a=a MOD 1
// b=b MOD 1
// PRINT a+b

import java.util.*;
public class q_3 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=15,b=7;
    a=a%(a-3);
    b=b%(b-3);
    a=a%1;
    b=b%1;
    System.out.println(a+b);
   } 
}
