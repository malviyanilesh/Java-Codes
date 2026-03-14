// QUESTION 3:- Palindrome number


            // DECLARE n : INTEGER
            // DECLARE temp : INTEGER
            // DECLARE rem : INTEGER
            // DECLARE rev : INTEGER

            // SET rev := 0

            // READ n
            // SET temp := n

            // WHILE n > 0
            //     rem := n MOD 10
            //     rev := rev * 10 + rem
            //     n := n DIV 10
            // END WHILE

            // IF rev = temp
            //     PRINT "Palindrome"
            // ELSE
            //     PRINT "Not Palindrome"
            // END IF




            import java.util.Scanner;

            public class palindrome {
                public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int num=sc.nextInt();
                    int n=num;
                    int b=0;
                    int a=0;
                    while(n>0){
                        a=n%10;
                        n=n/10;
                        b=b*10+a;
                    }
                    if(b==num) System.out.println("Palindrome");
                    else System.out.println("not palindrome");
                }
            }
