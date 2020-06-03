package VO_Y_DAO.DAO;

import VO_Y_DAO.VO.AlumnoVO;
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

    //Obtener alumno por numero de control
    public AlumnoVO getAlumnoByNC(int idAlumno) {

        AlumnoVO alumno = null;
        //Se encapsula query
        PreparedStatement consulta = null;
        //Se obtiene el set de resultado
        ResultSet resultSet = null;

        //Se crea el query para ponerlo en el objeto PrepareStatement
        String consultaSQL = "call SELECT_alumnoByNC(?)";

        try {
            consulta = conector.prepareStatement(consultaSQL);

            //El 1 es el indice del primer signo de interrogación
            consulta.setInt(1, idAlumno);

            resultSet = consulta.executeQuery();

            //Mientras haya registros de la BD se ejecuta este codigo
            while (resultSet != null && resultSet.next()) {

                //Se crea el objeto con los datos que retorna la BD
                alumno = new AlumnoVO();
                
                alumno.setIdAlumno( resultSet.getInt(1) );
                alumno.setSemestre(resultSet.getInt(2) );
                alumno.setGrupo(resultSet.getString(3) );
                alumno.setNombre(resultSet.getString(4) );
                alumno.setApellidos(resultSet.getString(5) );
                alumno.setNC(resultSet.getInt(6) );
                alumno.setNombre(resultSet.getString(7) );
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error desde AlumnoDAO.getAlumnoByNC");
        }

        return alumno;
    }
}
