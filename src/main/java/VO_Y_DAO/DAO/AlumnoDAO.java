package VO_Y_DAO.DAO;

import VO_Y_DAO.VO.AlumnoVO;
import VO_Y_DAO.VO.PersonaVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
            objetoSQL.setString(2, persona.getApellidos());
            objetoSQL.setInt(3, persona.getNC());
            objetoSQL.setInt(4, alumno.getSemestre());
            objetoSQL.setInt(5, id_grupo);
            objetoSQL.setInt(6, carrera);

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
    
    public AlumnoVO getAlumnoByNC(int numeroControl) {
        AlumnoVO alumno = new AlumnoVO();
        //Se encapsula query
        PreparedStatement consulta = null;
        //Se obtiene el set de resultado
        ResultSet resultSet = null;

        //Se crea el query para ponerlo en el objeto PrepareStatement
        String consultaSQL ="call SELECT_alumnoByNC(?)";

        try {
            consulta = conector.prepareStatement(consultaSQL);

            //El 1 es el indice del primer signo de interrogación
            consulta.setInt(1, numeroControl);

            resultSet = consulta.executeQuery();

            //Mientras haya registros de la BD se ejecuta este codigo
            while (resultSet != null && resultSet.next()) {

                //Se crea el objeto con los datos que retorna la BD
                alumno.setIdAlumno(resultSet.getInt(1));
                alumno.setNC(resultSet.getInt(2));
                alumno.setNombre(resultSet.getString(3));
                alumno.setApellidos(resultSet.getString(4));
                alumno.setSemestre(resultSet.getInt(5));
                alumno.setCarrera(resultSet.getString(6));
                alumno.setGrupo(resultSet.getString(7));
                alumno.setGrupo_idGrupo(resultSet.getInt(8));
                alumno.setPersona_idPersona(resultSet.getInt(9));
                alumno.setCarrera_idcarrera(resultSet.getInt(10));
            }
        } catch (SQLException ex) {
        System.out.println("Error en la transacción " + ex.toString());
        JOptionPane.showMessageDialog(null, "Error desde AlumnoDAO.getAlumnoByNC()");
    }
        return alumno;
    }
    
    public ArrayList<AlumnoVO> consultaMasiva() {
        ArrayList<AlumnoVO> lista_de_alumnos= new ArrayList<>();

        AlumnoVO alumno = null;
        //Se encapsula query
        PreparedStatement consulta = null;
        //Se obtiene el set de resultado
        ResultSet resultSet = null;

        //Se crea el query para ponerlo en el objeto PrepareStatement
        String consultaSQL ="call SELECT_alumnos()";

        try {
            consulta = conector.prepareStatement(consultaSQL);
            resultSet = consulta.executeQuery();

            //Mientras haya registros de la BD se ejecuta este codigo
            while(resultSet != null && resultSet.next()){

                //Se crea el objeto con los datos que retorna la BD
                alumno = new AlumnoVO();
                alumno.setIdAlumno(resultSet.getInt(1));
                alumno.setSemestre(resultSet.getInt(2));
                alumno.setGrupo_idGrupo(resultSet.getInt(3));
                alumno.setPersona_idPersona(resultSet.getInt(4));
                alumno.setCarrera_idcarrera(resultSet.getInt(5));
                alumno.setNC(resultSet.getInt(6));
                alumno.setNombre(resultSet.getString(7));
                alumno.setApellidos(resultSet.getString(8));
                alumno.setCarrera(resultSet.getString(9));
                alumno.setGrupo(resultSet.getString(10));
                

                lista_de_alumnos.add(alumno);
            }

        } catch (SQLException ex) {
            System.out.println("Error en la transacción " + ex.toString());
            JOptionPane.showMessageDialog(null, "Error desde: AlumnoDAO.ConsultaMasiva" );
        }
        return lista_de_alumnos;
    }

    public int actualizarAlumno(AlumnoVO alumno){
        PreparedStatement objetoSQL = null;
        ResultSet generatedKeys = null;
        
        int id = 0;
        String actualiza = "call UPDATE_alumno(?,?,?,?,?,?,?,?);";

        try{
            conector.setAutoCommit(false);

            objetoSQL = conector.prepareStatement(actualiza,PreparedStatement.RETURN_GENERATED_KEYS);

            objetoSQL.setInt(1, alumno.getIdAlumno());
            objetoSQL.setInt(1, alumno.getSemestre());
            objetoSQL.setInt(1, alumno.getGrupo_idGrupo());
            objetoSQL.setInt(1, alumno.getCarrera_idcarrera());
            objetoSQL.setInt(1, alumno.getNC());
            objetoSQL.setString(1, alumno.getNombre());
            objetoSQL.setString(1, alumno.getApellidos());
            objetoSQL.setInt(1, alumno.getPersona_idPersona());

            //Se ejecuta la sentencia
            objetoSQL.executeUpdate();

            //Se recogen llaves generadas
            generatedKeys = objetoSQL.getGeneratedKeys();

            if (generatedKeys.next()) {
                id = generatedKeys.getConcurrency();
            }
            conector.commit();

        }catch(SQLException e){
            try{
                conector.rollback();
                JOptionPane.showMessageDialog(null, "Se acualizó correctamente la info de "+ alumno.getNombre());
            }catch(SQLException ex1){
                System.out.println("Error en la transacción " + ex1.toString());
                JOptionPane.showMessageDialog(null, "Error desde AlumnoDAO.ActualozarAlumno()");
            }
        }
        return id;
    }
    
    
}
