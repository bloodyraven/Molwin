package bean;


public class Personnage {

	private String nom;
	private Statut statut;
	private Stuff stuff;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Statut getStatut() {
		return statut;
	}
	public void setStatut(Statut statut) {
		this.statut = statut;
	}
	public Stuff getStuff() {
		return stuff;
	}
	public void setStuff(Stuff stuff) {
		this.stuff = stuff;
	}
	
}
