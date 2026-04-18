// QUESTION 1. :- Factorial
                

                // DECLARE n : INTEGER
                // DECLARE fact : INTEGER
                // SET fact := 1

                // READ n

                // FOR i := 1 TO n
                //     fact := fact * i
                // END FOR

                // PRINT fact



                import java.util.*;
                public class factorial {
                    public static void main(String[] args) {
                        Scanner sc=new Scanner(System.in);
                        int fac=1;
                        int n=sc.nextInt();
                        for(int i=n;i>=1;i--){
                            fac=fac*i;
                        }
                        System.out.println(fac);
                    }
                }
