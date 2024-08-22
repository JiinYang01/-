package ex2;
import java.util.HashMap;
import java.util.PriorityQueue;

import ex1.Node;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap <String,PriorityQueue> fruit=new HashMap<>();
	 PriorityQueue<node> bucket1 = new PriorityQueue<node>();	
	 PriorityQueue<node> bucket2 = new PriorityQueue<node>();	
	 PriorityQueue<node> bucket3 = new PriorityQueue<node>();	
		node node1 = new node("banana","medium");
        node node2 = new node("pineapple","low");
        node node3 = new node("apple","medium");
        node node4 = new node("cherries","high");
        node node5 = new node("grape","high");
        node node6 = new node("blueberry","low");
        bucket1.offer(node1);
        bucket1.offer(node2);
        bucket2.offer(node3);
        bucket2.offer(node4);
        bucket3.offer(node5);
        bucket3.offer(node6);
                
    	fruit.put("yellow",bucket1);
        	fruit.put("red",bucket2);
        	fruit.put("blue",bucket3);
        	 
       
        	
        	
        System.out.println("1.yellow fruit:"+fruit.get("yellow"));
        System.out.println("2.blue fruit:"+fruit.get("red"));
        System.out.println("3.red fruit:"+fruit.get("blue"));
        
     
      
	
	}

}
