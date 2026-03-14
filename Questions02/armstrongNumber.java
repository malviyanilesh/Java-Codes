// QUESTION 4:- Armstrong number:-        
               
               
               // DECLARE n : INTEGER
                // DECLARE temp : INTEGER
                // DECLARE rem : INTEGER
                // DECLARE sum : INTEGER

                // SET sum := 0

                // READ n
                // SET temp := n

                // WHILE n > 0
                //     rem := n MOD 10
                //     sum := sum + (rem * rem * rem)
                //     n := n DIV 10
                // END WHILE

                // IF sum = temp
                //     PRINT "Armstrong Number"
                // ELSE
                //     PRINT "Not Armstrong Number"
                // END IF
                
                


                import java.util.*;
                public class armstrongNumber {
                public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int num=sc.nextInt();
                    int n=num;
                    int b=0;
                    int a=0;
                    while(n>0){
                        a=n%10;
                        n=n/10;
                        b=b+a*a*a;
                    }
                    if(b==num){
                        System.out.println("Armstrong");
                    }
                    else{
                        System.out.println("not armstrong");
                    }
                }
                }
