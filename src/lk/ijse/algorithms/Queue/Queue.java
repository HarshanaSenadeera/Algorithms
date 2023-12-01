package lk.ijse.algorithms.Queue;

public class Queue {

    int front;
    int rear;
    int index;
    int [] arr;

    public Queue(int size){
        arr=new int[size];
        front =0;
        rear =-1;
        index=0;
    }

    public void enQueue(int data){
        if (index == arr.length){
            System.out.println("Queue is full...!");
        }
        if (index == arr.length-1){
            rear = -1;
        }
        arr[++rear]=data;
        index++;
    }




}
