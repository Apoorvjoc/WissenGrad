package objectOrienrtedProg;

interface IStack{
	
	void push(int data);
	int pop();
	boolean isStackEmpty();
	boolean isStackFull();
	void displayStack();
}

class StackImp implements IStack {
	
	int capacity = 10;
	int stackArr[] = new int[capacity];
	int size = -1;
	
	
	@Override
	public void push(int data) {
		// TODO Auto-generated method stub
		if(isStackFull() == false) {
			size++;
			stackArr[size] = data;
		}else {
			System.out.println("Stack is FUll");
		}
		return;
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(isStackEmpty() == false) {
			return stackArr[size--];
		}else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	@Override
	public boolean isStackEmpty() {
		// TODO Auto-generated method stub
		if(size == -1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isStackFull() {
		// TODO Auto-generated method stub
		if(size == capacity-1) {
			return true;
		}
		return false;
	}

	@Override
	public void displayStack() {
		// TODO Auto-generated method stub
		if(isStackEmpty() == false) {
			int i = size;
			while(i>=0) {
				System.out.println(stackArr[i]+" ");
				i--;
			}
		}else {
			System.out.println("Stack is Empty.");
		}
		return;
	}
	
}

public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImp st = new StackImp();
		st.displayStack();
		st.push(10);
		st.push(20);
		st.push(30);
		
		st.displayStack();
		System.out.println("Element deleted is : "+st.pop());
		System.out.println("Element deleted is : "+st.pop());
		System.out.println("Element deleted is : "+st.pop());
		System.out.println("Element deleted is : "+st.pop());
	}

}
