package metier.entities;

import java.util.Date;

public class Reservation {
	private Long idReservation;
	private String nomClient;
	private double prix;
	private Date datedebut  ;
	private Date datefin;
	public Reservation() {
		super();
	}
	public Reservation(String nomClient, double prix) {
		super();
		this.nomClient = nomClient;
		this.prix = prix;
	}
	public Reservation(String nomClient, double prix, Date datedebut, Date datefin) {
		super();
		this.nomClient = nomClient;
		this.prix = prix;
		this.datedebut = datedebut;
		this.datefin = datefin;
	}
	public Long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Date getDatedebut() {
		return datedebut;
	}
	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}
	public Date getDatefin() {
		return datefin;
	}
	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}
	
	
}