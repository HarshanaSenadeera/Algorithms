package lk.ijse.algorithms.leanerSearch.LeanerSe;

public class LeanerSearch {

    //(01)create search method
    //(02)create loop for array
    //(03)return value
    public int search(int [] arr, int target){

        for (int i = 0; i < arr.length - 1; i++) {
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }

}
