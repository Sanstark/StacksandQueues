public class StacksQueues <E>{
    Node head;

    /* UC1 -- pushing data onto the stack */
    public void pushData(E data){
        addData(data);
    }
    public void addData(E data) {
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

    /* UC2 -- peek and pop data from the stack till it is empty */
    public E popData(){
        if(this.head == null){
            System.out.println("Stack Underflow.");
            return null;
        }
        E data = (E) this.head.data;
        this.head = this.head.next;
        return data;
    }

    public E peekData(){
        if(this.head == null){
            System.out.println("Stack Underflow");
            return null;
        }
        E data =  (E) this.head.data;
        return data;
    }
}
