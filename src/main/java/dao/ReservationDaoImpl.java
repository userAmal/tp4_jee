package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.SingletonConnection;
import metier.entities.Reservation;

public class ReservationDaoImpl implements IReservationDAO {

	@Override
	public Reservation save(Reservation r) {
		Connection conn = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("INSERT INTO resrvation(NOM_CLIENT,RIX_SEJOUR) VALUES(?,?)");
			ps.setString(1, r.getNomClient());
			ps.setDouble(2, r.getPrix());
			ps.executeUpdate();
			PreparedStatement ps2 = conn.prepareStatement("SELECT MAX(ID_RESERVATION) as MAX_ID FROM resrvation");
			ResultSet rs = ps2.executeQuery();
			if (rs.next()) {
				r.setIdReservation(rs.getLong("MAX_ID"));
			}
			ps.close();
			ps2.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}

	@Override
	public List<Reservation> ReservationsParMC(String mc) {
		List<Reservation> res = new ArrayList<Reservation>();
		Connection conn = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from resrvation where NOM_CLIENT LIKE ?");
			ps.setString(1, "%" + mc + "%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Reservation r = new Reservation();
				r.setIdReservation(rs.getLong("ID_RESERVATION"));
				r.setNomClient(rs.getString("NOM_CLIENT"));
				r.setPrix(rs.getDouble("RIX_SEJOUR"));
				res.add(r);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public Reservation getReservation(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation updateReservation(Reservation r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteReservation(Long id) {
		// TODO Auto-generated method stub

	}

}
