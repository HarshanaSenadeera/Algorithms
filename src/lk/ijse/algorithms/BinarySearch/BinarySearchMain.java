package lk.ijse.algorithms.BinarySearch;

public class BinarySearchMain {

    public static void main(String[] args) {

        int [] arr = new int[1000];
        int target= 500;

        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }

        BinarySearch binarySearch = new BinarySearch();

        int search = binarySearch.search(arr, target);

        System.out.println("Your target "+target+" is in "+search);
    }
}
