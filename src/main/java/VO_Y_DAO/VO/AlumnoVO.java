package VO_Y_DAO.VO;

public class AlumnoVO {
    private int idAlumno;
    private int semestre;
    private String grupo;
    private String nombre;
    private String apellidos;
    private int NC;
    private int carrera;

    public AlumnoVO() {
    }

    public AlumnoVO(int idAlumno, int semestre, String grupo, String nombre, String apellidos, int NC, int carrera) {
        this.idAlumno = idAlumno;
        this.semestre = semestre;
        this.grupo = grupo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NC = NC;
        this.carrera = carrera;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
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

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "AlumnoVO{" + "idAlumno=" + idAlumno + ", semestre=" + semestre + ", grupo=" + grupo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", NC=" + NC + ", carrera=" + carrera + '}';
    }
    
}