package DSA.Queue;

public class QueueArray {
    private int cap;
    private int rear;
    private int front;
    private int[] ptr;
    private int size; // Optional if you want to track queue size

    // Constructor
    public QueueArray(int cap) {
        this.cap = cap;
        this.rear = -1;
        this.front = -1;
        this.size = 0; // Optional
        this.ptr = new int[cap];
    }

    // Check if the queue is full
    public boolean isFull() {
        return rear == cap - 1;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return (front == -1 || front > rear);
    }

    // Enqueue: Add an element to the rear of the queue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + data);
            return;
        }
        rear++;
        ptr[rear] = data;
        if (front == -1) {
            front = 0; // Initialize front when first element is added
        }
        size++; // Optional: Increment size
        System.out.println(data + " enqueued successfully!");
    }

    // Dequeue: Remove an element from the front of the queue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return;
        }
        int item = ptr[front];
        front++;
        size--; // Optional: Decrement size
        System.out.println("Item dequeued: " + item);

        // Reset front and rear if queue becomes empty
        if (front > rear) {
            front = -1;
            rear = -1;
        }
    }

    // Display all elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(ptr[i] + " ");
        }
        System.out.println();
    }

    // Get the rear element's index
    public int getRear() {
        return rear;
    }

    // Get the front element's index
    public int getFront() {
        return front;
    }

    // Peek: View the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element.");
            return -1;
        }
        return ptr[front];
    }}


