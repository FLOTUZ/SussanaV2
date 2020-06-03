package VO_Y_DAO.VO;

public class PersonaVO {
    private int idPersona;
    private String nombre;
    private String apellidos;
    private int NC;

    public PersonaVO() {
    }

    public PersonaVO(int idPersona, String nombre, String apellidos, int NC) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NC = NC;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNC() {
        return NC;
    }

    public void setNC(int NC) {
        this.NC = NC;
    }

    @Override
    public String toString() {
        return "PersonaVO{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", NC=" + NC + '}';
    }
}
