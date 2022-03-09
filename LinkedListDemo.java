class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void insertAtFirst(int data) {

        LinkedList.Node node = new LinkedList.Node(data);

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void insertAtLast(int data) {
        LinkedList.Node node = new LinkedList.Node(data);

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void insertAtIndex(int index, int data) {
        LinkedList.Node node = new LinkedList.Node(data);

        if (head == null && index == 0) {
            head = node;
        } else if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node temp = head;
            while (temp != null) {
                index--;
                if (index == 0)
                    break;

                temp = temp.next;
            }
            if (index <= 0) {
                node.next = temp.next;
                temp.next = node;
            } else {
                System.out.println("Index out of bounds");
            }
        }
    }
    public void deleteAtBegin(){
        
    }

    @Override
    public String toString() {
        Node temp = head;
        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.data + ", ");
            temp = temp.next;
        }
        return "LinkedList->  " + sb.toString() ;

    }

}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList.Node obj1 = new LinkedList.Node(10);
        LinkedList list = new LinkedList();
        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtLast(30);
        list.insertAtIndex(4, 40);
        System.out.print(list);
    }
}