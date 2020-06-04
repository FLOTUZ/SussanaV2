package VO_Y_DAO.DAO;

import VO_Y_DAO.VO.CarreraVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CarreraDAO {

    private Connection conector = null;

    public CarreraDAO(Connection conector) {
        this.conector = conector;
    }
    
    public ArrayList<CarreraVO> consultaMasiva() {
        ArrayList<CarreraVO> lista_de_carreras= new ArrayList<>();

        CarreraVO carrera = null;
        //Se encapsula query
        PreparedStatement consulta = null;
        //Se obtiene el set de resultado
        ResultSet resultSet = null;

        //Se crea el query para ponerlo en el objeto PrepareStatement
        String consultaSQL ="call SELECT_carreras()";

        try {
            consulta = conector.prepareStatement(consultaSQL);
            resultSet = consulta.executeQuery();

            //Mientras haya registros de la BD se ejecuta este codigo
            while(resultSet != null && resultSet.next()){

                //Se crea el objeto con los datos que retorna la BD
                carrera = new CarreraVO();
                carrera.setIdcarrera(resultSet.getInt(1));
                carrera.setNombre(resultSet.getString(2));
                

                lista_de_carreras.add(carrera);
            }

        } catch (SQLException ex) {
            System.out.println("Error en la transacción " + ex.toString());
            JOptionPane.showMessageDialog(null, "Error desde: CarreraDAO.ConsultaMasiva" );
        }
        return lista_de_carreras;
    }
}
