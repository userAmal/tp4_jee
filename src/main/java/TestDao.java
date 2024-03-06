import java.util.List;

import dao.ReservationDaoImpl;
import metier.entities.Reservation;

public class TestDao {

	public static void main(String[] args) {
		ReservationDaoImpl pdao= new ReservationDaoImpl();
		Reservation prod= pdao.save(new Reservation("Amani bouaouina",300));
		System.out.println(prod);
		List<Reservation> res =pdao.ReservationsParMC("soumaya");
		for (Reservation r : res)
		System.out.println(r);
		}


}
