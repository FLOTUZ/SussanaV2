package VO_Y_DAO.VO;

public class GrupoVO {
    private int idGrupo;
    private String letra;
    private int tutor_iddocente;

    public GrupoVO() {
    }

    public GrupoVO(int idGrupo, String letra, int tutor_iddocente) {
        this.idGrupo = idGrupo;
        this.letra = letra;
        this.tutor_iddocente = tutor_iddocente;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getTutor_iddocente() {
        return tutor_iddocente;
    }

    public void setTutor_iddocente(int tutor_iddocente) {
        this.tutor_iddocente = tutor_iddocente;
    }

    @Override
    public String toString() {
        return "GrupoVO{" + "idGrupo=" + idGrupo + ", letra=" + letra + ", tutor_iddocente=" + tutor_iddocente + '}';
    }
    
}
