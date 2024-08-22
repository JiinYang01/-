package ex1;
public class Node implements Comparable<Node>{
	private int Id;
    private String name;
    private int salary;

    
    public Node( int Id, String name, int salary) {
        this.Id = Id;
        this.name = name;
     this.salary=salary;
    }
    
    
	public int getG() { return salary; }
    public int getH() { return Id; }
    public String getNode() { return name; }
    
  
    
    public void setG(int v) { salary = v; }
    public void setH(int v) { Id = v; }
    public void setParentNode(String v) {name = v; }
    
    @Override
    public int compareTo(Node target) {
    
        if (this.getG() < target.getG()) {
            return 1;
        } else if (this.getG() > target.getG()) {
            return -1;
        }
        return this.getNode().compareTo(target.getNode());
    }
    
    public String toString() {
        return "["+Id+"]"+name+","+salary;
    }

}
