package VO_Y_DAO.VO;

public class TutorVO {
    private int idTutor;
    private String departamento;
    private String puesto;
    private String correo;
    private int telefono;
    private int extension;
    private int idPersona;
    private String nombre;
    private String apellidos;
    private int NC;

    public TutorVO() {
    }

    public TutorVO(int idTutor, String departamento, String puesto, String correo, int telefono, int extension, int idPersona, String nombre, String apellidos, int NC) {
        this.idTutor = idTutor;
        this.departamento = departamento;
        this.puesto = puesto;
        this.correo = correo;
        this.telefono = telefono;
        this.extension = extension;
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NC = NC;
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
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
        return "TutorVO{" + "idTutor=" + idTutor + ", departamento=" + departamento + ", puesto=" + puesto + ", correo=" + correo + ", telefono=" + telefono + ", extension=" + extension + ", idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", NC=" + NC + '}';
    }
    
}