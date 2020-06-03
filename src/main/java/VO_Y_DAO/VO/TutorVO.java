package VO_Y_DAO.VO;

public class TutorVO {
    private int idTutor;
    private int Grupo_idGrupo;
    private int docente_iddocente;

    public TutorVO() {
    }

    public TutorVO(int idTutor, int Grupo_idGrupo, int docente_iddocente) {
        this.idTutor = idTutor;
        this.Grupo_idGrupo = Grupo_idGrupo;
        this.docente_iddocente = docente_iddocente;
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public int getGrupo_idGrupo() {
        return Grupo_idGrupo;
    }

    public void setGrupo_idGrupo(int Grupo_idGrupo) {
        this.Grupo_idGrupo = Grupo_idGrupo;
    }

    public int getDocente_iddocente() {
        return docente_iddocente;
    }

    public void setDocente_iddocente(int docente_iddocente) {
        this.docente_iddocente = docente_iddocente;
    }

    @Override
    public String toString() {
        return "TutorVO{" + "idTutor=" + idTutor + ", Grupo_idGrupo=" + Grupo_idGrupo + ", docente_iddocente=" + docente_iddocente + '}';
    }    
}
