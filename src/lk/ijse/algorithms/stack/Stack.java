package lk.ijse.algorithms.stack;

public class Stack {

    int [] arr;
    int top;

    public Stack(int size){
        arr=new int[size];
        top=-1;
    }
    public void push(int num){
        if (top == arr.length-1){
            System.out.println("Stack is full...!");
        }
        arr[++top]=num;
    }

    public void print(){

        System.out.print("[");
        for (int i = 0; i <=top; i++) {
            System.out.println(arr[i]+" ,");
        }

        System.out.println("\b]");
    }

}
