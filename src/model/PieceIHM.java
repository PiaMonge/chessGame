package model;

import java.util.List;

public class PieceIHM {
	List<Coord> listCoord;
	Couleur couleur;
	String Name;
	
	
	public PieceIHM(List<Coord> listCoord, Couleur couleur, String name) {
		super();
		this.listCoord = listCoord;
		this.couleur = couleur;
		this.Name = name;
	}
	public List<Coord> getListCoord() {
		return listCoord;
	}
	public Couleur getCouleur() {
		return couleur;
	}
	public String getName() {
		return Name;
	}
	
	@Override
	public String toString() {
		return "PieceIHM [listCoord=" + listCoord + ", couleur=" + couleur
				+ ", Name=" + Name + "]";
	}
		
	
	

}
