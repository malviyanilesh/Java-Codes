// question 7:- even number 


            // DECLARE n : INTEGER

            // READ n

            // IF n MOD 2 = 0
            //     PRINT "Even Number"
            // ELSE
            //     PRINT "Not Even Number"
            // END IF


            public class evenNum {
                public static void main(String[] args) {
                    for(int i=1;i<=10;i++){
                        if(i%2!=0){
                            continue;
                        }
                        System.out.println(i);
                    }
                }
            }
