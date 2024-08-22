package ex2;
public class node implements Comparable<node>{
	private String name;
    private String sweet;

    
    public node( String name, String sweet) {
 
        this.name = name;
     this.sweet=sweet;
    }
     
    public String getG() { return sweet; }
  
    public String getNode() { return name; }
    public void setH(String v) { sweet= v; }
    public void setParentNode(String v) {name = v; }
    
    public int compareTo(node target) {
    	if(this.sweet=="low"){
    		return 1;
    	}if(this.sweet=="high"){
    		return -1;
    	}else if(this.sweet=="medium"||target.sweet=="low"){
    		return -1;
    	}else if(this.sweet=="medium"||target.sweet=="high"){
    		return 1;
    	}
      
        return 0;
    }
    public String toString() {
        return name+"("+sweet+")";
    }

   

}
