
public class BinaryNode {
	
	private BinaryNode leftSon, rightSon; 
	private int value; 
	
	public BinaryNode(int v) {
		value = v; 		
	}
	

	/* checks if value exists */
	  public boolean contains(int v) {
	        if (v == value) { return true; }
	        if (v < value) {
	            if (leftSon == null) {
	                return false;
	            } else {
	                return leftSon.contains(v);
	            }
	        } else {
	            if (rightSon == null) {
	                return false;
	            } else {
	                return rightSon.contains(v);
	            }
	        }
	    }		
    		
	
	
    public void insert(int v) {
    	
    			   	
    	if (v == value) {
    		
    		System.out.print("Wert schon enthalten");
    		
    	}
    	
    	
    	if (v < value) {
    		
    		if (leftSon == null) {
    			
    			leftSon = new BinaryNode(v);
    			
    		} else {
    			
    			leftSon.insert(v);
    			
    		}		
    		
    	} else {
    		
    			if (v > value) {
    		
    					
    				if (rightSon == null) {
    	    			
    	    			rightSon = new BinaryNode(v);	
    	    		
    			} else {
    				
    			
        			rightSon.insert(v);

    				
    			}
    				   		
    		}
    	
    	}
    }
    
    
    
    
    public void inorder() {
    	
    	
    	if (leftSon != null) 
    		leftSon.inorder();
    		System.out.print(value);
    	if (rightSon != null) 
       		rightSon.inorder();
    	
    	
    }

    
    
    
    
}