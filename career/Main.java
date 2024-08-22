
package ex1;
import java.util.PriorityQueue;

public class Main {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1 = new Node(1	,"John",100000);
        Node node2 = new Node(2	,"Lisa",115000);
        Node node3 = new Node(3,"Chris",145000);
        Node node4 = new Node(4,"Angelina",110000);
        Node node5 = new Node(5,"Joe",100000);
    
        
        // Create priority queue
        PriorityQueue<Node> pQueue = new PriorityQueue<Node>();
        
        // Add items to queue
        pQueue.offer(node1); // same code as pQueue.add(node1)
        pQueue.offer(node2);
        pQueue.offer(node3);
        pQueue.offer(node4);
        pQueue.offer(node5);
    
        // Get items from queue
        while(!pQueue.isEmpty()) {
            Node node = pQueue.poll();
            System.out.println(node);
        }



	}

}
