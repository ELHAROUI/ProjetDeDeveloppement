package donnees;

public class Piece {


    private int VAL;

	
    public Piece(int VAL) {
    	this.setVal(VAL);
    	
	}


	public int getVal() {
		return VAL;
	}


	public void setVal(int VAL) {
		Val = VAL;
	}


	@Override
	public String toString() {
		return "Piece [Val=" + VAL + "]";
	}
 
}
