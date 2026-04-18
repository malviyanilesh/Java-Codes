// 4. BinarySearch.java
public class BinarySearch {

    static void search(int a[], int value) {
        int low=0, high=a.length-1, mid;
        int found=0;

        while(low<=high) {
            mid=(low+high)/2;

            if(a[mid]==value) {
                found=1;
                break;
            }
            else if(a[mid]>value)
                high=mid-1;
            else
                low=mid+1;
        }

        if(found==1)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }

    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        search(a,40);
    }
}