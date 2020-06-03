package VO_Y_DAO.DAO;

import VO_Y_DAO.VO.AlumnoVO;
import VO_Y_DAO.VO.PersonaVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AlumnoDAO {

    private Connection conector = null;

    public AlumnoDAO(Connection conector) {
        this.conector = conector;
    }

    public int altaAlumno(int id_grupo, PersonaVO persona, int carrera, AlumnoVO alumno) throws SQLException {
        PreparedStatement objetoSQL = null;
        ResultSet generatedKeys = null;
        int id = 0;

        String inserta = "call INSERT_alumno(?,?,?,?,?,?)";

        try {
            conector.setAutoCommit(false);

            objetoSQL = conector.prepareStatement(inserta, PreparedStatement.RETURN_GENERATED_KEYS);

            objetoSQL.setString(1, persona.getNombre());
            objetoSQL.setString(1, persona.getApellidos());
            objetoSQL.setInt(1, persona.getNC());
            objetoSQL.setInt(1, alumno.getSemestre());
            objetoSQL.setInt(1, id_grupo);
            objetoSQL.setInt(1, carrera);

            //Se ejecuta la sentencia
            objetoSQL.executeUpdate();

            //Se recogen llaves generadas
            generatedKeys = objetoSQL.getGeneratedKeys();

            if (generatedKeys.next()) {
                id = generatedKeys.getConcurrency();
            }
            conector.commit();

        } catch (SQLException ex1) {
            conector.rollback();
            System.out.println("Error en la transacción " + ex1.toString());
            JOptionPane.showMessageDialog(null, "Error desde" + this.getClass().getName());
        }
        return id;
    }

}
