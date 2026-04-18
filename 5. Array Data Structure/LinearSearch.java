// 3. LinearSearch.java
public class LinearSearch {

    static void search(int a[], int value) {
        int found = 0;

        for(int i=0;i<a.length;i++) {
            if(a[i]==value) {
                found = 1;
                break;
            }
        }

        if(found==1)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }

    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        search(a,30);
    }
}