public class StacksQueues <E>{
    Node head;

    /* UC1 -- pushing data onto the stack */
    public void pushData(E data){
        addData(data);
    }

    private void addData(E data) {
        Node new_node = new Node(data);
        if(new_node == null){
            System.out.println("Stack Overflow");
            return;
        }else{
            new_node.next = head;
            head = new_node;
        }
        return;
    }
}
