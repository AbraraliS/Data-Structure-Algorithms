package LinkedList;

// import org.junit.platform.engine.support.hierarchical.Node;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
};
public class DLL {
    private static Node convert2All(int[] arr){
        if (arr == null || arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static Node printNode(Node head) {
        if (head == null) {
            return null;
        }
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
        return head;
    }
    public static void main(String[] args) {

        int[] arr = { 4, 5, 6, 7, 8 };
        // Node head = new Node(arr[0]);
        // System.out.println(head.data);
        Node head = convert2All(arr);
        printNode(head);

    }
}
