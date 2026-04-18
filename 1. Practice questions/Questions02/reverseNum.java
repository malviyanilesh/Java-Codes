// QUESTION 2. Reverse Number :-      
           
           // DECLARE n : INTEGER
            // DECLARE rem : INTEGER
            // DECLARE rev : INTEGER

            // SET rev := 0

            // READ n

            // WHILE n > 0
            //     rem := n MOD 10
            //     rev := rev * 10 + rem
            //     n := n DIV 10
            // END WHILE

            // PRINT rev
 
 
 
 
 
        import java.util.Scanner;

        public class reverseNum {
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int b=0;
                int a;
                while(n>0){
                    a=n%10;
                    n=n/10;
                    b=b*10+a;
                }
                System.out.println(b);
            }
        }
