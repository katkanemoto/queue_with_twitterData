/* 
 * Name: Lukas Hammett
 * Date: 12/01/2022
 * Class Name: Queue.java
 * Description: Creates a LinkedList that functions
 * 				similarly to a Queue with a few methods.
 */

import java.util.LinkedList;

public class Queue {
	
	LinkedList<TwitterLocationData> queue = new LinkedList<TwitterLocationData>();
	
	public void enqueue(TwitterLocationData record) {
		queue.add(record);
	}
	
	public TwitterLocationData dequeue() {
		return queue.removeFirst();
	}
	
	public TwitterLocationData peek() {
		return queue.getFirst();
	}
	
	
	
}