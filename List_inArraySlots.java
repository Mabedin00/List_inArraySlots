/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
    private int length;
    private int filledElements;
    private int[] list;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
    	int length = 1;
    	int filledElements = 0;
    	list = new int[1];
    	
    }


    /** 
      @return the number of elements in this list
     */
    public int size() {
    	return filledElements;
    }


     /** 
       @return a string representation of this list,
       in [a,b,c,] format
      */ 
    public String toString() {
    	String output = "[";
    	for (int n; n < filledElements; n++){
    		output+= n + "," ;
    	}
    	output += "]";
    	return output;
    }

    
    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     // public boolean add( int value) {
     // }


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
     // private void expand() {
        // System.out.println( "expand... (for debugging)");
           // /* S.O.P. rules for debugging:
              // Working methods should be silent. But during 
              // development, the programmer must verify that 
              // this method is called when that is appropriate.
              // So test using the println(), then comment it out.
              // */
     // }
}
