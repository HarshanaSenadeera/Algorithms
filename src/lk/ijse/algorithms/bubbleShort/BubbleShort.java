package lk.ijse.algorithms.bubbleShort;

public class BubbleShort {

    //(01)create method
    //(02)pass int array and target as parameters
    //(03)check first two elements which grater than next element
    //(04)create variable temp in int
    //(05)then swap
    public int search(int [] arr,int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j]>arr[j+1]){
                    int temp=arr[j];

                    arr[j] = arr[j+1];

                    arr[j+1]= temp;
                }
            }
        }
        return -1;
    }
}
