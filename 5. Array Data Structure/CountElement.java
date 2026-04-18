// 6. CountElement.java
public class CountElement {

    static void count(int a[], int value) {
        int c=0;

        for(int i=0;i<a.length;i++) {
            if(a[i]==value)
                c++;
        }

        System.out.println(c);
    }

    public static void main(String[] args) {
        int a[] = {10,20,10,30,10};
        count(a,10);
    }
}