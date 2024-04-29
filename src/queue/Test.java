package queue;

public class Test {
	
	public static void main(String[] args) {
	ArrayQueue queue = new ArrayQueue(22);
	ArrayQueue.queueEnqueue(7);
	ArrayQueue.queueEnqueue(1);
	ArrayQueue.queueDequeue();
	ArrayQueue.queueDisplay();
	ArrayQueue.queueFront();
	}
}
