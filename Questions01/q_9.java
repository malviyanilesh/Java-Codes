// INTEGER p,q,r
// SET p=8,q=4,r=5
// IF((r+q)<(q-r)|| p>q)
//     q=(q&8)&r
// END IF
// PRINT p+q+r

import java.util.*;
public class q_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=8,q=4,r=5;
        if((r+q)<(q-r)||p>r){
            q=(q&8)&r;
        }
        System.out.println(p+q+r);
    }
}
