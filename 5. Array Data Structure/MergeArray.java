// 5. MergeArray.java
public class MergeArray {

    static void merge(int a[], int b[]) {
        int c[] = new int[a.length+b.length];
        int k=0;

        for(int i=0;i<a.length;i++)
            c[k++]=a[i];

        for(int i=0;i<b.length;i++)
            c[k++]=b[i];

        for(int i=0;i<c.length;i++)
            System.out.println(c[i]);
    }

    public static void main(String[] args) {
        int a[] = {10,20,30};
        int b[] = {40,50,60};

        merge(a,b);
    }
}