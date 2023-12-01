package lk.ijse.algorithms.Queue;

public class Queue {

    int start;
    int rear;
    int index;
    int [] arr;

    public Queue(int size){
        arr=new int[size];
        start =0;
        rear =-1;
        index=0;
    }


}
