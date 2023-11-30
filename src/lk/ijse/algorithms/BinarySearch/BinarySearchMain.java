package lk.ijse.algorithms.BinarySearch;

public class BinarySearchMain {

    public static void main(String[] args) {

        int [] arr = new int[100];
        int target= 500;

        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }

        BinarySearch binarySearch = new BinarySearch();

        binarySearch.search();
    }
}
