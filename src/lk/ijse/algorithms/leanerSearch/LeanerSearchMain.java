package lk.ijse.algorithms.leanerSearch;

public class LeanerSearchMain {

    public static void main(String[] args) {

        int [] arr={23,4,23,4,67,89,90,54,32,38,65,34,56,77,6};
        int target=90;
        LeanerSearch leanerSearch = new LeanerSearch();

        leanerSearch.search(arr,target);

    }
}
