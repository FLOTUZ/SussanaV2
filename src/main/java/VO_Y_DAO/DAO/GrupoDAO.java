package VO_Y_DAO.DAO;

import VO_Y_DAO.VO.GrupoVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GrupoDAO {
        private Connection conector = null;

    public GrupoDAO(Connection conector) {
        this.conector = conector;
    }
    
     public ArrayList<GrupoVO> consultaMasiva() {
        ArrayList<GrupoVO> lista_de_grupos= new ArrayList<>();

        GrupoVO grupo = null;
        //Se encapsula query
        PreparedStatement consulta = null;
        //Se obtiene el set de resultado
        ResultSet resultSet = null;

        //Se crea el query para ponerlo en el objeto PrepareStatement
        String consultaSQL ="call SELECT_grupos()";

        try {
            consulta = conector.prepareStatement(consultaSQL);
            resultSet = consulta.executeQuery();

            //Mientras haya registros de la BD se ejecuta este codigo
            while(resultSet != null && resultSet.next()){

                //Se crea el objeto con los datos que retorna la BD
                grupo = new GrupoVO();
                grupo.setIdGrupo(resultSet.getInt(1));
                grupo.setLetra(resultSet.getString(2));
                

                lista_de_grupos.add(grupo);
            }

        } catch (SQLException ex) {
            System.out.println("Error en la transacción " + ex.toString());
            JOptionPane.showMessageDialog(null, "Error desde: GrupoDAO.ConsultaMasiva" );
        }
        return lista_de_grupos;
    }
}
