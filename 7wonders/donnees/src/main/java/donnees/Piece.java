package donnees;

public class Piece {


    private int val;

	
    public Piece(int VAL) {
    	this.setVal(VAL);
    	
	}


	public int getVal() {
		return val;
	}


	public void setVal(int VAL) {
		val = VAL;
	}


	@Override
	public String toString() {
		return "Piece [Val=" + val + "]";
	}
 
}
