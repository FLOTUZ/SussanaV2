package VO_Y_DAO.DAO;

import VO_Y_DAO.VO.BajaAusentismoVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BajaAusentismoDAO {

    private Connection conector = null;

    public BajaAusentismoDAO(Connection conector) {
        this.conector = conector;
    }
        public int altaBajaAusentismo(BajaAusentismoVO bajaAusentismo) throws SQLException {
        PreparedStatement objetoSQL = null;
        ResultSet generatedKeys = null;
        int id = 0;

        String inserta = "call INSERT_bajaAusentismo(?,?,?,?,?,?,?,?)";

        try {
            conector.setAutoCommit(false);

            objetoSQL = conector.prepareStatement(inserta, PreparedStatement.RETURN_GENERATED_KEYS);

            objetoSQL.setString(1, bajaAusentismo.getFecha());
            objetoSQL.setString(2, bajaAusentismo.getDocenteReporta());
            objetoSQL.setString(3, bajaAusentismo.getAsignatura());
            objetoSQL.setInt(4, bajaAusentismo.getClave());
            objetoSQL.setString(5, bajaAusentismo.getFechasInasistencia());
            objetoSQL.setString(6, bajaAusentismo.getPosibleCausa());
            objetoSQL.setString(7, bajaAusentismo.getResultado());
            objetoSQL.setInt(8, bajaAusentismo.getAlumno_idAlumno());

            //Se ejecuta la sentencia
            objetoSQL.executeUpdate();

            //Se recogen llaves generadas
            generatedKeys = objetoSQL.getGeneratedKeys();

            if (generatedKeys.next()) {
                id = generatedKeys.getConcurrency();
            }
            conector.commit();
            JOptionPane.showMessageDialog(null, "Se guardo la baja por ausentismo");
        } catch (SQLException ex1) {
            conector.rollback();
            System.out.println("Error en la transacción " + ex1.toString());
            JOptionPane.showMessageDialog(null, "Error desde" + this.getClass().getName());
        }
        return id;
    }
    
}
