package queue;

public class ArrayQueue {
	
	private static int front;
	private static int rear;
	private static int capacity;
	private static int[] queue;
	
	public ArrayQueue(int size) {
		front = 0;
		rear = 0;
		capacity = size;
		queue = new int[size];
	}
	/**
	 * �berpr�ft ob der Speicher voll ist, wenn nicht wird ein neues element hinten eingef�gt
	 * @param item
	 */
	public static void queueEnqueue(int item) {
		if (rear == capacity) {
			System.out.println("Queue ist voll");
		} else {
			queue[rear] = item;
			rear++;
		}
	}
	
	/**
	 * �berpr�ft ob der Speicher leer ist, wenn nicht wird das erste element ausgegeben und die elemente werden um eins weiter ger�ckt
	 * @return
	 */
	public static int queueDequeue() {
		int firstElement = 0;
		if(rear == front) {
			System.out.println("Queue ist leer");
		} else {
			firstElement = queue[front];
			for(int i = 0; i < (rear-1); i++) {
				queue[i] = queue[i+1];
			}
			if(rear < capacity) {
				queue[rear] = 0;
			}
			rear--;
		}
		return firstElement;
	}
	
	/**
	 * �berpr�ft ob der Speicher leer ist, zeigt alle Elemente die im Speicher enthalten sind an
	 */
	public static void queueDisplay() {
		if(front == rear) {
			System.out.println("Queue is empty!");
		} else {
			for(int i = front; i < rear; i++) {
				System.out.println(i);
			}
		}
	}
	/**
	 * �berpr�ft ob Speicher leer ist, gibt erstes Element aus
	 * @return
	 */
	public static int queueFront() {
		int firstElement = 0;
		if (front == rear) {
			System.out.println("Queue is empty!");
		}else {
			firstElement = queue[front];
		}
		 return firstElement;

	}
}

//H�: ArrayQueueTest -> alle Methoden von ArrayQueue testen
//		JavaDoc-Kommentare
//		Kapitel 5 nochmals durcharbeiten 
