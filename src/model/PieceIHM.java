package model;


public class PieceIHM {
	private Pieces piece;
	
	
	
	public PieceIHM(Pieces piece) {
		super();
		this.piece = piece;
	}
	
	public Couleur getCouleur() {
		return piece.getCouleur();
	}



	public int getX() {
		return piece.getX();
	}



	public int getY() {
		return piece.getY();
	}



	public String getName() {
		return piece.getName();
	}



	@Override
	public String toString() {
		return "PieceIHM [piece=" + piece + "]";
	}

}
