package QUEUES;

public class circulerqueue {

    private int[] data;
    private int size;
    private int front = 0;
    private int end = 0;
    private int count = 0;

    public circulerqueue(int size) {
        this.size = size;
        this.data = new int[size];
    }

    // check full
    public boolean isfull() {
        return count == size;
    }

    // check empty
    public boolean isempty() {
        return count == 0;
    }

    // insert
    public boolean push(int item) {
        if (isfull()) {
            System.out.println("queue is full");
            return false;
        }

        data[end] = item;
        end = (end + 1) % size;
        count++;

        System.out.println("end = " + end);
        return true;
    }

    // remove
    public int pop() {
        if (isempty()) {
            System.out.println("queue is empty");
            return -1;
        }

        int removed = data[front];
        front = (front + 1) % size;
        count--;

        return removed;
    }

    // display
    void display() {
        if (isempty()) {
            System.out.println("queue is empty");
            return;
        }

        int i = front;
        for (int c = 0; c < count; c++) {
            System.out.print(data[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println();

        System.out.println("front = " + front);
        System.out.println("end = " + end);
    }

    public static void main(String[] args) {
        circulerqueue queue = new circulerqueue(5);

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);
        queue.push(60);   // will show "queue is full"

        queue.display();
    }
}
