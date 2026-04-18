// DECLARE a:INTEGER
// DECLARE b:INTEGER
// DECLARE c:INTEGER
// SET c=8,b=2
// a:=c/b
// c:=b>>a

import java.util.*;
public class q_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=8,b=2;
        int a=c/b;
        c=b>>a;
        System.out.println(c);
    }
}

