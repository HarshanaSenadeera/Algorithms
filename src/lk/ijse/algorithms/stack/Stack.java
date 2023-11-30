package lk.ijse.algorithms.stack;

public class Stack {

    //(01)Create int array and int top
    //(02)Initialize values for it
    //(03)Create push method to insert value to the stack
            /*Check top == to length of array for check array is not full.
            Then pre-increment stack using top value and assign our value for it*/

    //(04)Create pop method to delete value from the stack
            /*Check top == -1 for identify array is empty or not.
            If stack is not empty, return value using decrement operation for top vale*/

    //(05)Create peek method tho get peek value from the stack
            /*Check top == -1 for identify array is empty or not.
            * If stack is not empty, return array value */

    //(06)Create clear method to clear stack
            /*Check top == -1 for identify array is empty or not.
            If stack is not empty clear stack*/

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

    public int pop(){
        if (top == -1){
            System.out.println("Stack is Empty...!");
        }
        return arr[top--];
    }

    public int peek(){
        if (top == -1){
            System.out.println("Stack is Empty...!");
        }
        System.out.println("Peek Value is: "+arr[top]);
        return arr[top];
    }

    public void clear(){
        if (top == -1){
            System.out.println("Stack is Empty...!");
        }
        top=-1;
    }

    public void print(){

        System.out.print("[");
        for (int i = 0; i <=top; i++) {
            System.out.print(arr[i]+" ,");
        }

        System.out.println("\b]");
    }

}
