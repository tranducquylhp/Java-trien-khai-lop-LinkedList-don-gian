public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data){
    }

    public void add(int index, Object data){
        Node temp = head;
        Node holder;
        for (int i=0; i<index-1 && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next= temp;
        numNodes++;
    }

    public Node get(int index){
        Node temp = head;
        for (int i=0; i<index-1 && temp.next!=null; i++){
            temp = temp.next;
        }
        return temp.next;
    }

    public void printList(){
        Node temp = head;
        for (int i=0; i<numNodes; i++){
            System.out.println(temp.getData());
            temp = temp.next;
            if (temp==null) break;
        }
    }
}
