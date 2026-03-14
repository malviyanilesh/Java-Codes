// Question 5 : Prime number


                // DECLARE n : INTEGER
                // DECLARE count : INTEGER
                // SET count := 0

                // READ n

                // FOR i := 1 TO n
                //     IF n MOD i = 0
                //         count := count + 1
                //     END IF
                // END FOR

                // IF count = 2
                //     PRINT "Prime Number"
                // ELSE
                //     PRINT "Not Prime Number"
                // END IF



                import java.util.Scanner;

                public class primeNum {
                    public static void main(String[] args) {
                        Scanner sc=new Scanner(System.in);
                        int n=sc.nextInt();
                        int i;
                        for(i=2;i<n;i++){
                            if(n%i==0){
                                System.out.println("not prime");
                                break;
                            }
                        }
                        if(n==i){
                            System.out.println("prime");
                        }
                    }
                }
