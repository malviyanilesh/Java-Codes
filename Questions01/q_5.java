// DECLARE a:INTEGER
// DECLARE b:INTEGER
// DECLARE c:INTEGER
// SET b:=40,a:=20,c:=20
// a:=a+c
// c:=c+a
// a:=a+c
// c:=c+a
// PRINT a+b+c

import java.util.*;
public class q_5 {
    public static void main(String[] args) {
       int a=20,b=40,c=20;
       a=a+c;
       c=c+a;
       a=a+c;
       c=c+a;
        System.out.println(a+b+c);
    }
}
