package VO_Y_DAO.DAO;

import VO_Y_DAO.VO.TutorVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TutorDAO {

    private Connection conector = null;

    public TutorDAO(Connection conector) {
        this.conector = conector;
    }
    
     public ArrayList<TutorVO> consultaMasiva() {
        ArrayList<TutorVO> lista_tutores= new ArrayList<>();

        TutorVO tutor = null;
        //Se encapsula query
        PreparedStatement consulta = null;
        //Se obtiene el set de resultado
        ResultSet resultSet = null;

        //Se crea el query para ponerlo en el objeto PrepareStatement
        String consultaSQL ="call SELECT_tutor()";

        try {
            consulta = conector.prepareStatement(consultaSQL);
            resultSet = consulta.executeQuery();

            //Mientras haya registros de la BD se ejecuta este codigo
            while(resultSet != null && resultSet.next()){

                //Se crea el objeto con los datos que retorna la BD
                tutor = new TutorVO();
                tutor.setIdPersona(resultSet.getInt(1));
                tutor.setNombre(resultSet.getString(2));
                tutor.setApellidos(resultSet.getString(3));
                tutor.setNC(resultSet.getInt(4));
                tutor.setIdTutor(resultSet.getInt(5));
                tutor.setDepartamento(resultSet.getString(6));
                tutor.setPuesto(resultSet.getString(7));
                tutor.setCorreo(resultSet.getString(8));
                tutor.setTelefono(resultSet.getInt(9));
                tutor.setExtension(resultSet.getInt(10));

                lista_tutores.add(tutor);
            }

        } catch (SQLException ex) {
            System.out.println("Error en la transacción " + ex.toString());
            JOptionPane.showMessageDialog(null, "Error desde: TutorDAO.ConsultaMasiva" );
        }
        return lista_tutores;
    }
}
