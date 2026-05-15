package leetcode_problem;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class queue_customized {
   Node front = null;
   Node rear = null;
	public void push(int data) {
	    Node newnode = new Node(data);
	    if(front == null) {
	    	front = newnode;
	        rear = newnode;
	        System.out.println("Added 1");
	    	}
	    	else {
	    		rear.next = newnode;
	    		rear = newnode;
	    		System.out.println("Added 2");
	    	}
	}
	
	public void display() {
	Node temp = front;
	if(front == null) {
		System.out.println("Queue is Empty");
	}
	while(temp!=null) {
		System.out.println(temp.data);
		temp = temp.next;
	}
	}
	
	public void pop() {
		Node temp = front;
		if(front == null) {
			System.out.println("Queue is empty");
		}else if(front==rear) {
			rear =null;
			front=null;
			System.out.println("deleted");
		}else {
			front = front.next;
			System.out.println("deleted");
		}
	}
	public static void main(String[] args) {
		queue_customized queue = new queue_customized();
		queue.push(10);
		queue.push(20);
		queue.display();
		queue.pop();
		queue.display();
	}
}
