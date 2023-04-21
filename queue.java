public class Main {
    // Define the Queue class as a static inner class of Main
    static class Queue {
        // Declare the array, size, and rear variables as static
        static int arr[];
        static int size;
        static int rear;

        // Constructor to initialize the array and size variables
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1; // Initialize rear to -1 to indicate an empty Queue
        }
    }

    // Method to check if the Queue is empty
    public static boolean isEmpty() {
        return Queue.rear == -1;
    }

    // Method to add an element to the Queue
    public static void add(int data) {
        // Check if the Queue is full
        if (Queue.rear == Queue.size - 1) {
            System.out.println("Queue is full");
            return; // Return without adding the element
        }
        // Increment the rear index and add the element to the Queue
        Queue.rear += 1;
        Queue.arr[Queue.rear] = data;
    }

    // Method to remove the element at the front of the Queue
    public static int remove() {
        // Check if the Queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Return -1 to indicate an error
        }
        // Save the element at the front of the Queue
        int front = Queue.arr[0];
        // Shift all the remaining elements to the left
        for (int i = 0; i < Queue.rear; i++) {
            Queue.arr[i] = Queue.arr[i + 1];
        }
        // Decrement the rear index and return the saved element
        Queue.rear -= 1;
        return front;
    }

    // Method to peek at the element at the front of the Queue
    public static int peek() {
        // Check if the Queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Return -1 to indicate an error
        }
        // Return the element at the front of the Queue
        return Queue.arr[0];
    }

    // Main method to test the Queue implementation
    public static void main(String[] args) {
        // Create a new Queue with a size of 5
        Queue queue = new Queue(5);
        // Add three elements to the Queue
        add(1);
        add(2);
        add(3);
        // Remove the element at the front of the Queue and print it
        System.out.println(remove());
        // Peek at the element at the front of the Queue and print it
        System.out.println(peek());
        // Remove two more elements from the Queue and print them
        System.out.println(remove());
        System.out.println(remove());
        // Try to remove an element from the empty Queue, which should result in an error message being printed
        System.out.println(remove());
    }
}
