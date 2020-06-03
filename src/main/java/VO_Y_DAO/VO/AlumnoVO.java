package VO_Y_DAO.VO;

public class AlumnoVO {
    private int idAlumno;
    private int semestre;
    private int Grupo_idGrupo;
    private int Persona_idPersona;
    private int carrera_idcarrera;

    public AlumnoVO() {
    }

    public AlumnoVO(int idAlumno, int semestre, int Grupo_idGrupo, int Persona_idPersona, int carrera_idcarrera) {
        this.idAlumno = idAlumno;
        this.semestre = semestre;
        this.Grupo_idGrupo = Grupo_idGrupo;
        this.Persona_idPersona = Persona_idPersona;
        this.carrera_idcarrera = carrera_idcarrera;
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

    public int getGrupo_idGrupo() {
        return Grupo_idGrupo;
    }

    public void setGrupo_idGrupo(int Grupo_idGrupo) {
        this.Grupo_idGrupo = Grupo_idGrupo;
    }

    public int getPersona_idPersona() {
        return Persona_idPersona;
    }

    public void setPersona_idPersona(int Persona_idPersona) {
        this.Persona_idPersona = Persona_idPersona;
    }

    public int getCarrera_idcarrera() {
        return carrera_idcarrera;
    }

    public void setCarrera_idcarrera(int carrera_idcarrera) {
        this.carrera_idcarrera = carrera_idcarrera;
    }

    @Override
    public String toString() {
        return "AlumnoVO{" + "idAlumno=" + idAlumno + ", semestre=" + semestre + ", Grupo_idGrupo=" + Grupo_idGrupo + ", Persona_idPersona=" + Persona_idPersona + ", carrera_idcarrera=" + carrera_idcarrera + '}';
    }
    
}