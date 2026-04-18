 // 1. Sum of elements in Array :-  

        // DECLARE sum : INTEGER
        // SET sum := 0
        // DECLARE a : ARRAY[0:4] OF INTEGER
        // FOR i := 0 TO 4
        //     READ a[i]
        // END FOR
        // FOR i := 0 TO 4
        //     sum := sum + a[i]
        // END FOR
        // PRINT sum
  


import java.util.Scanner;
public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :- ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        System.out.println("Enter the elements :- ");
        for(int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < 5; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum = " + sum);


    }
}








