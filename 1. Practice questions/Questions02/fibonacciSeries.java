// Question 7. :- Fibonacci series


            // DECLARE n : INTEGER
            // DECLARE a : INTEGER
            // DECLARE b : INTEGER
            // DECLARE c : INTEGER

            // SET a := 0
            // SET b := 1

            // READ n

            // PRINT a
            // PRINT b

            // FOR i := 3 TO n
            //     c := a + b
            //     PRINT c
            //     a := b
            //     b := c
            // END FOR



            import java.util.Scanner;

            public class fibonacciSeries {
                public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int prev=0;
                    int next=1;
                    int sum=0;
                    System.out.println(prev);
                    System.out.println(next);
                    while(sum<=n){
                        sum=prev+next;
                        System.out.println(sum);
                        prev=next;
                        next=sum;
                    }
                }
            }
