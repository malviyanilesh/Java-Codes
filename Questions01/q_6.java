// DECLARE uid:String
// DECLARE pass:String
// READ uid
// READ pass
// IF uid=="admin" AND pass=="admin" THEN
//     PRINT "WELCOME"
// ELSE
//     PRINT "wrong userID/password"
// ENDIF 

import java.util.*;
public class q_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String uid=sc.next();
        String pass=sc.next();
        if(uid.equals("admin") && pass.equals("admin")){
            System.out.println("WELCOME");
        }
        else{
            System.out.println("wrong userID/password");
        }
    }
}
