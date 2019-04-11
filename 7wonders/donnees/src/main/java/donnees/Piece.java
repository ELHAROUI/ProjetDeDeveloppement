package donnees;

public class Piece {


    private int val;

	
    public Piece(int val) {
    	this.setVal(val);
    	
	}


	public int getVal() {
		return val;
	}


<<<<<<< HEAD
	public void setVal(int VAL) {
		val = VAL;
=======
	public void setVal(int val) {

		this.val = val;
>>>>>>> branch 'master' of https://github.com/ELHAROUI/ProjetDeDeveloppement.git
	}


	@Override 
	public String toString() {
		return "Piece [Val=" + val + "]";
	}
 
}
