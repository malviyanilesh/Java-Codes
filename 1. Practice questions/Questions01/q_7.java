// DECLARE cn:INTEGER
// DECLARE cd:INTEGER
// DECLARE pm:INTEGER
// DECLARE dbms:INTEGER
// DECLARE ml:INTEGER
// READ cn,cd,pm,dbms,ml
// DECLARE per:REAL
// per:=(cn+cd+pm+dbms+ml)/5
// IF per>=90 THEN
//     PRINT 'A+'
// ELSE IF per>=80 THEN
//     PRINT 'A'
// ELSE IF per>=70 THEN
//     PRINT 'B+'
// ELSE IF per>=60 THEN
//         PRINT 'B'
// ELSE IF per>=50 THEN
//     PRINT 'C'
        

import java.util.*;
public class q_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cn=sc.nextInt();
        int cd=sc.nextInt();
        int pm=sc.nextInt();
        int dbms=sc.nextInt();
        int ml=sc.nextInt();
        double per=sc.nextDouble();
        per=(cn+cd+pm+dbms+ml)/5;
        if(per>=90){
            System.out.println("A+");
        }
       else if(per>=80){
            System.out.println("A");
        }
        else if(per>=70){
            System.out.println("B+");
        }
        else if(per>=600){
            System.out.println("B");
        }
        else if(per>=50){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
    }
}
