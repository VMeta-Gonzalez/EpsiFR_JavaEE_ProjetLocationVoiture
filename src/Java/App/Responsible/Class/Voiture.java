package Java.App.Responsible.Class;
import java.sql.Date;
import java.util.ArrayList;

import Java.App.Mechanician.Class.Reparation;

public class Voiture {
	
	private Integer id;
	private String nom;
	private String marque;
	private Integer kilometrage;
	private Boolean aReparer;
	private Boolean louer;
	private Date dateLocation;
	private ArrayList<Reparation> historiqueReparations;
	
	public Voiture(Integer id, String nom, String marque, Integer kilometrage, Boolean aReparer, Boolean louer) {
		this.id = id;
		this.nom = nom;
		this.marque = marque;
		this.kilometrage = kilometrage;
		this.aReparer = aReparer;
		this.louer = louer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Integer getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(Integer kilometrage) {
		this.kilometrage = kilometrage;
	}

	public Boolean getaReparer() {
		return aReparer;
	}

	public void setaReparer(Boolean aReparer) {
		this.aReparer = aReparer;
	}

	public Boolean getLouer() {
		return louer;
	}

	public void setLouer(Boolean louer) {
		this.louer = louer;
	}

	public Date getDateLocation() {
		return dateLocation;
	}

	public void setDateLocation(Date dateLocation) {
		this.dateLocation = dateLocation;
	}

	public ArrayList<Reparation> getHistoriqueReparations() {
		return historiqueReparations;
	}

	public void setHistoriqueReparations(Reparation historiqueReparations) {
		this.historiqueReparations.add(historiqueReparations);
	}

	
}
