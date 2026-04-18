// 1. TraversalArray.java
public class TraversalArray {

    static void traversal(int a[]) {
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        traversal(a);
    }
}