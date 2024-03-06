package dao;

import java.util.List;

import metier.entities.Reservation;

public interface IReservationDAO {
	public Reservation save(Reservation r);
	public List<Reservation> ReservationsParMC(String mc);
	public Reservation getReservation(Long id);
	public Reservation updateReservation(Reservation r);
	public void deleteReservation(Long id);
}
