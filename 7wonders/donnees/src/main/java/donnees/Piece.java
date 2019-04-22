
package donnees;

public class Piece {


    private int val;

	
    public Piece(int val) {
    	this.setVal(val);
    	
	}


	public int getVal() {
		return val;
	}


	public void setVal(int val) {

		this.val = val;

	}


	@Override 
	public String toString() {
		return "Piece [Val=" + val + "]";
	}
 
}