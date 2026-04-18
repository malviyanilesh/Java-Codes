
// WAP in java to implement 1D array.
// 1.Traversal
// 2. Insertion
// 3. Deletion
// 4. Linear search
// 5. Binary search
// 6. Exit                [System.exit(0)]




import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[10];
        int n = 5;

        // initial values
        a[0]=1; a[1]=2; a[2]=3; a[3]=4; a[4]=5;

        int choice;

        do {
            System.out.println("1.Traversal");
            System.out.println("2.Insertion");
            System.out.println("3.Deletion");
            System.out.println("4.Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if(choice == 1) {
                // Traversal
                for(int i=0; i<n; i++) {
                    System.out.print(a[i] +" ");
                }
            }

            else if(choice == 2) {
                // Insertion (end me)
                System.out.print("Enter element: ");
                int x = sc.nextInt();
                a[n] = x;
                n++;
               // After insertion
               for(int ele : a) System.out.print(ele +" ");
            }

            else if(choice == 3) {
                // Deletion (last element)
                if(n > 0) {
                    n--;
                }
             // After deletion
             for(int ele : a) System.out.print(ele +" ");

            }

            else if(choice == 4) {
                // Linear search
                if(n > 0) {
                    n--;
                }
             // After Linear search
             for(int ele : a) System.out.print(ele +" ");

            }
 
            else if(choice == 5) {
                // Binary search
                if(n > 0) {
                    n--;
                }
             // After Binary search
             for(int ele : a) System.out.print(ele +" ");

            }


        } while(choice != 6);

        System.out.println("Program End");
    }
}