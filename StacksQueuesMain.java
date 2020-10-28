public class StacksQueuesMain {
    Stacks stack;
    Queues queue;

    public StacksQueuesMain(){
        stack = new Stacks();
        queue = new Queues();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Stacks and Queues Program");

        StacksQueuesMain sqm = new StacksQueuesMain();
        sqm.stack.pushData(70);
        sqm.stack.pushData(30);
        sqm.stack.pushData(56);

        sqm.stack.peekData();
        sqm.stack.popData();
        sqm.stack.peekData();
        sqm.stack.popData();
        sqm.stack.peekData();
        sqm.stack.popData();
        sqm.stack.peekData();
        sqm.stack.popData();

        sqm.queue.enqueueData(56);
        sqm.queue.enqueueData(30);
        sqm.queue.enqueueData(70);

        sqm.queue.dequeue();
        sqm.queue.dequeue();
        sqm.queue.dequeue();
        sqm.queue.dequeue();
    }
}
