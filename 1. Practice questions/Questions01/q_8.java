// INTEGER p,q,READ
// SET p=9,q=6,r=10
// IF((q^p^r)>(r^q))
//     r=(11&12)+q
// END IF
// IF((q^6^8)>(p^4))
//     p=(r+3)&r
// END IF
// PRINT p+q+r    

import java.util.*;
public class q_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=9;
        int q=6;
        int r=10;
        if((q^p^r)>(r^q)){
            r=(11&12)+q;
        }
        if((q^6^8)>(p^4)){
            p=(r+3)&r;
        }
        System.out.println(p+q+r);
    }
}
