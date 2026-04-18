 
// DECLARE a:INTEGER
// DECLARE b:INTEGER
// SET a:=1,b:=1
// a:=(a^1)&(1)+(b^1)&1

import java.util.*;
public class q_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=1,b=1;
        a=(a^1)&(1)+(b^1)&1;
        System.out.println(a);
    }
}
