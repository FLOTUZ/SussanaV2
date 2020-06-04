package VO_Y_DAO.DAO;

import VO_Y_DAO.VO.CanalizacionVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CanalizacionDAO {

    private Connection conector = null;

    public CanalizacionDAO(Connection conector) {
        this.conector = conector;
    }
    
    public int altaCanalización(CanalizacionVO canalizacion) throws SQLException {
        PreparedStatement objetoSQL = null;
        ResultSet generatedKeys = null;
        int id = 0;

        String inserta = " INSERT_canalizacion(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            conector.setAutoCommit(false);

            objetoSQL = conector.prepareStatement(inserta, PreparedStatement.RETURN_GENERATED_KEYS);

            objetoSQL.setString(1, canalizacion.getFecha());
            objetoSQL.setString(2, canalizacion.getTutor());
            objetoSQL.setInt(3, canalizacion.getAlumno_idAlumno());
            objetoSQL.setInt(4, canalizacion.getCarrera_idCarrera());
            objetoSQL.setBoolean(5, canalizacion.isTrizteza());
            objetoSQL.setBoolean(6, canalizacion.isAngustia());
            objetoSQL.setBoolean(7, canalizacion.isAnsiedad());
            objetoSQL.setBoolean(8, canalizacion.isDesesperacion());
            objetoSQL.setBoolean(9, canalizacion.isLlanto());
            objetoSQL.setBoolean(10, canalizacion.isConduta());
            objetoSQL.setBoolean(11, canalizacion.isAnimo());
            objetoSQL.setBoolean(12, canalizacion.isExitacion());
            objetoSQL.setBoolean(13, canalizacion.isIrritabilidad());
            objetoSQL.setBoolean(15, canalizacion.isDrogas());
            objetoSQL.setBoolean(16, canalizacion.isAprendizaje());
            objetoSQL.setBoolean(17, canalizacion.isAutoAgresiones());
            objetoSQL.setString(18, canalizacion.getOtro());
            objetoSQL.setString(19, canalizacion.getDescripcion());

            //Se ejecuta la sentencia
            objetoSQL.executeUpdate();

            //Se recogen llaves generadas
            generatedKeys = objetoSQL.getGeneratedKeys();

            if (generatedKeys.next()) {
                id = generatedKeys.getConcurrency();
            }
            conector.commit();
            JOptionPane.showMessageDialog(null, "Se creó nuevo alumno con éxito");
        } catch (SQLException ex1) {
            conector.rollback();
            System.out.println("Error en la transacción " + ex1.toString());
            JOptionPane.showMessageDialog(null, "Error desde" + this.getClass().getName());
        }
        return id;
    }
}
