public class Queues <E>{
    Node head, tail;

    /* UC3 --  create a queue using linked list */
    public void enqueueData(E data){
        appendData(data);
    }

    private void appendData(E data) {
        Node new_node = new Node(data);
        if(this.head == null && this.tail == null)
            this.head = new_node;
        else
            this.tail.next = new_node;
        this.tail = new_node;
    }
}
