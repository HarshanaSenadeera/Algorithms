package lk.ijse.algorithms.Queue;

public class Queue {

    //(01) Create Variable front = assign 0 | rear = -1 | index = 0 and array name like arr

    //(02) Create enQueue method for insert values to the queue
            /*first check index == arr.length, So is it true throw exception or put S-out
            * Then check is rear == arr.length-1, Is it true assign -1 value to rear
            * finally pre-Increment rear and De-Increment index*/

    //(03) Create deQueue method for remove values to the queue
                 /*first check index == 0, So is it true throw exception or put S-out
                 create temp value and assign arr[front++] finally return temp
                 Then check is front == arr.length , Is it true assign 0 value to rear
                 finally post-Decrement front and post-Increment index*/

    //(04) peek value is top value , So find like peek method and create print method and display queue


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
