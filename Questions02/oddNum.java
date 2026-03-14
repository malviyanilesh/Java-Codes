// Question 6 :- Odd number


        // DECLARE n : INTEGER

        // READ n

        // IF n MOD 2 = 0
        //     PRINT "Not Odd Number"
        // ELSE
        //     PRINT "Odd Number"
        // END IF




        public class oddNum {
            public static void main(String[] args) {
                for(int i=1;i<=10;i++){
                    if(i%2==0){
                        continue;
                    }
                    System.out.println(i);
                }
            }
        }
