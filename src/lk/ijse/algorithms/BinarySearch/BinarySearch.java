package lk.ijse.algorithms.BinarySearch;

public class BinarySearch {

    //(01)create method search and give it two parameters int array and int target
    //(02)create variables like start , end and mid , assign 0 to start and assign arr.length-1 to end
    //(03)open while loop
    //(04)then check our target is similar to mid. If is it ok, return mid
    //(05)is it false, then open else if and check target is grater than mid. If is it ok assign mid+1 value to start variable
    //(06)is it false, then go to the last option. assign mid-1 value to end variable


    int start;
    int end;
    int mid;
    public int search(int [] arr,int target){
        start=0;
        end=arr.length-1;

        while (start <= end){
            mid=(start+end)/2;

            if (target == mid){
                return  mid;
            } else if (mid < target) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
}
