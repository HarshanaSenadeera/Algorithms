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
        if (rear == arr.length-1){
            rear = -1;
        }
        arr[++rear]=data;
        index++;
    }

    public int deQueue(){
        if (index == 0){
            System.out.println("Stack is empty...!");
        }
        int temp=arr[front++];
        if (front == arr.length){
            front=0;
        }
        index--;
        return temp;
    }

    public int peek(){
        if (index == 0){
            System.out.println("Stack is empty...!");
        }
        return arr[front];
    }
    public void print(){

        System.out.print("[");
        for (int i = front; i <=rear ; i++) {

            System.out.print(arr[i]+" ,");
        }
        System.out.println("\b]");
    }




}
