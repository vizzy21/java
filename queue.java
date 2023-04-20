public class Main {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }
    }

    public static boolean isEmpty() {
        return Queue.rear == -1;
    }

    public static void add(int data) {
        if (Queue.rear == Queue.size - 1) {
            System.out.println("Queue is full");
            return;
        }
        Queue.rear += 1;
        Queue.arr[Queue.rear] = data;
    }

    public static int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int front = Queue.arr[0];
        for (int i = 0; i < Queue.rear; i++) {
            Queue.arr[i] = Queue.arr[i + 1];
        }
        Queue.rear -= 1;
        return front;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return Queue.arr[0];
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
