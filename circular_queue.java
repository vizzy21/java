public class Main {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
    }

    public static boolean isEmpty() {
        return Queue.rear == -1 && Queue.front == -1;
    }

    public static boolean isFull() {
        return (Queue.rear + 1) % Queue.size == Queue.front;
    }

    public static void add(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (Queue.front == -1) {
            Queue.front = 0;
        }

        Queue.rear = (Queue.rear + 1) % Queue.size;
        Queue.arr[Queue.rear] = data;
    }

    public static int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int result = Queue.arr[Queue.front];

        if (Queue.rear == Queue.front) {
            Queue.rear = -1;
            Queue.front = -1;
        } else {
            Queue.front = (Queue.front + 1) % Queue.size;
        }

        return result;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return Queue.arr[Queue.front];
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        add(1);
        add(2);
        add(3);
        System.out.println(remove());
        System.out.println(peek());
        System.out.println(remove());
        System.out.println(remove());
        System.out.println(remove()); // this should give an error message because the queue is already empty
    }
}
