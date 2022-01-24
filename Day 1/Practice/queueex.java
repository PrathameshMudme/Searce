import java.util.*;

public class queueex {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();

        q.add("prathamesh");
        q.add("vaibhav");
        q.add("master");
        q.add("chintu");
        q.add("khardes");

        System.out.println("Elements in Queue:" + q);

        System.out.println("Removed element: " + q.remove());

        System.out.println("Head: " + q.element());

        System.out.println("poll(): " + q.poll());

        System.out.println("peek(): " + q.peek());

        System.out.println("Elements in Queue:" + q);
    }
}