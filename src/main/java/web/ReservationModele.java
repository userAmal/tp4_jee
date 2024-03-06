package web;

import java.util.ArrayList;
import java.util.List;

import metier.entities.Reservation;

public class ReservationModele {
	private String motCle;
	List<Reservation> reservations = new ArrayList<>();
	public String getMotCle() {
	return motCle;
	}
	public void setMotCle(String motCle) {
	this.motCle = motCle;
	}
	public List<Reservation> getReservations() {
	return reservations;
	}
	public void setReservations(List<Reservation> reservations) {
	this.reservations =reservations;
	}

}
