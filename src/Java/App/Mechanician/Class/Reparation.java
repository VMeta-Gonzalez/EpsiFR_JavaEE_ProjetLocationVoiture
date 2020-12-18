package Java.App.Mechanician.Class;
import java.util.Date;
import Java.App.Manager.Class.*;
import Java.App.Responsible.Class.Voiture;

public class Reparation {
	Voiture voitureReparer;
	Date dateReparation;
	String tachesEffectuer;
	Integer montantReparation;
	
	public Reparation(Voiture voitureReparer, Date dateReparation, String tachesEffectuer, Integer montantReparation) {
		super();
		this.voitureReparer = voitureReparer;
		this.dateReparation = dateReparation;
		this.tachesEffectuer = tachesEffectuer;
		this.montantReparation = montantReparation;
	}

	public Voiture getVoitureReparer() {
		return voitureReparer;
	}

	public void setVoitureReparer(Voiture voitureReparer) {
		this.voitureReparer = voitureReparer;
	}

	public Date getDateReparation() {
		return dateReparation;
	}

	public void setDateReparation(Date dateReparation) {
		this.dateReparation = dateReparation;
	}

	public String getTachesEffectuer() {
		return tachesEffectuer;
	}

	public void setTachesEffectuer(String tacheEffectuer) {
		this.tachesEffectuer = tacheEffectuer;
	}

	public Integer getMontantReparation() {
		return montantReparation;
	}

	public void setMontantReparation(Integer montantReparation) {
		this.montantReparation = montantReparation;
	}
	
	
	
}
