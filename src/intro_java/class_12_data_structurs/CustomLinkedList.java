package intro_java.class_12_data_structurs;

public class CustomLinkedList {
    private Node head;

    public CustomLinkedList(Node node) {
        this.head = node;
    }

    public void add(int value) {
        add(head, value);
    }

    public void add(Node node, int value) {
        Node toBeAdded = new Node(value);
        Node current = node;
        while (current.next != null) {
            current = current.next;
        }
        current.next = toBeAdded;
    }

    public void traverse() {
        traverse(head);
    }

    private void traverse(Node node) {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
}