package leetcode_problem;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class stack_customize {

    Node top;
    public void push(int data) {

        Node newnode = new Node(data);

        newnode.next = top;
        top = newnode;

        System.out.println(data + " Added");
    }
    
    public void pop() {
    	if(top == null) {
    		System.out.println("stack is empy");
    	}else {
    		System.out.println("deleted");
    		top = top.next;
    	}	
    }

    // DISPLAY
    public void display() {

        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            Node temp = top;

            while (temp != null) {

                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        stack_customize st = new stack_customize();

        st.push(10);
        st.push(20);
        st.push(30);

        st.display();
    }
}