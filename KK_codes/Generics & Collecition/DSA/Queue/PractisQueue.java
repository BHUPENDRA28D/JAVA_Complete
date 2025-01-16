import java.net.Socket;


class PractisQueue{

    public static void main(String[] args) {

        PqueueArray queueaArray = new PqueueArray(5);
        queueaArray.enqueue(23);
        queueaArray.enqueue(25);
        queueaArray.enqueue(94);
        queueaArray.enqueue(36);
        queueaArray.display();
        queueaArray.deqeueue();
        queueaArray.deqeueue();
        queueaArray.display();
    }


}

class PqueueArray{

    private int cap;
    private int rear;
    private int front;
    private int[] arr;
    private int size; // Optional if you want to track queue size

    public PQueueArray(int cap) {
        this.cap = cap;
        this.rear = -1;
        this.front = -1;
        this.arr = int [cap];
        this.size = 0;
    }

    public boolean isFull(){
        return rear == cap-1;
    }

    public boolean isEmpty(){
        return (rear ==-1 || front <rear);

    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("The queue is full ");
        }
        rear++;
        arr[rear] =data;

        if(front==-1){
            front =0;
        }
        size++;

    }

    public void deqeueue(){
        if(isFull()){
            System.out.println("The queue is empty ");
        }

        int val = arr[front];
        front++;
        System.out.println("Successfull deleted : "+val);

        if(front>rear){
            front=-1;
            rear=-1;
        }

        size--;
    }

    public void display(){
        if(isFull()){
            System.out.println("The queue is empty ");
        }

        for(int i =front;i<=rear;i++){
            System.out.print("  "+arr[i]);
        }
        System.out.println();

    }
}
