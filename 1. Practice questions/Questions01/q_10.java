// INTEGER a,b,C
// SET a=2,b=4,c=7
// b=7+a
// IF(c>b)
//     b=b+b
// END IF
//     b=6+a
// IF((a+b)<(b-a)||c<a)
//     b=(c+4)+c
// ELSE
//     a=c+b
// END IF
// c=c+9^a
// PRINT a+b+c

import java.util.*;
public class q_10 {
    public static void main(String[] args) {
        int a=2,b=4,c=7;
        b=7+a;
        if(c>b){
            b=b+b;
        }
        b=6+a;
        if((a+b)<(b-a)||c<a){
            b=(c+4)+c;
        }
        else{
            a=c+b;
        }
        c=c+9^a;
        System.out.println(a+b+c);
    }
}
