// 2. InsertionArray.java
public class InsertionArray {

    static void insert(int a[], int n, int pos, int value) {
        for(int i=n; i>pos; i--) {
            a[i] = a[i-1];
        }

        a[pos] = value;
        n++;

        for(int i=0;i<n;i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int a[] = new int[10];
        a[0]=10; a[1]=20; a[2]=30; a[3]=40;

        insert(a,4,2,25);
    }
}