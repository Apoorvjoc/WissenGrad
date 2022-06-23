package objectOrienrtedProg;

interface IQueue{

    void insert(int data);
    int delete();
    boolean isQueueEmpty();
    boolean isQueueFull();
    void displayQueue();
}

class QueueImp implements IQueue{
	
	int capacity = 10;
	int queueArray[] = new int[capacity];
	int front = 0 , rear = -1;

	@Override
	public void insert(int data) {
		// TODO Auto-generated method stub
		if(isQueueFull() == false) {
			rear++;
			queueArray[rear] = data;
		}else {
			System.out.println("Queue is full");
		}
		return;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		if(isQueueEmpty() == false) {
			return queueArray[front++];
		}else
			return 0;
	}

	@Override
	public boolean isQueueEmpty() {
		// TODO Auto-generated method stub
		if(rear == -1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isQueueFull() {
		// TODO Auto-generated method stub
		if(rear == capacity-1) {
			return true;
		}
		return false;
	}

	@Override
	public void displayQueue() {
		// TODO Auto-generated method stub
		if(isQueueEmpty() == false) {
			for(int i = front ; i<=rear ; i++) {
				System.out.print(queueArray[i]+" ");
			}
			System.out.println();
		}else {
			System.out.println("Queue is Empty");
		}
		return;
	}
	
}

public class MyQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IQueue q = new QueueImp();
		q.displayQueue();
		int res = q.delete();
		if(res == 0)System.out.println("Queue is empty");
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(0);
		q.displayQueue();
		System.out.println("Deleted element is: "+q.delete());
		q.insert(40);
		q.insert(50);
		q.insert(60);
		q.insert(70);
		q.insert(80);
		q.insert(90);
		q.displayQueue();
		q.insert(100);
	}

}
