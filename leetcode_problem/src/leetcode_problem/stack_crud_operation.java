package leetcode_problem;

public class stack_crud_operation {
        int[] stack = new int[5];
        int top = -1;
        
    public void push(int num) {
    	if(top == stack.length-1) {
    		System.out.print("stack is full");
    	}else {
    		top++;
    		stack[top] = num;
    		System.out.println("Added the value");
    	}
    }
    
    public void pop(int num) {
    	if(top == -1) {
    		System.out.println("stack is null");
    	}else {
    		System.out.println(stack[top]);
    		top--;
    	}
    }
    
    public void display() {
    	if(top == -1) {
    		System.out.println("stack is empty");
    	}else {
    	for(int i=top;i>=0;i--) {
    		System.out.println(stack[i]);
    	}
    }}
	public static void main(String[] args) {
		stack_crud_operation st = new stack_crud_operation();
		st.push(10);
		st.push(20);
		st.push(30);
		st.pop(0);
		st.display();
	}
}
