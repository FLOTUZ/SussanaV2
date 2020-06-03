package VO_Y_DAO.VO;

public class GrupoVO {
    private int idFrupo;
    private String letra;
    private int tutor_iddocente;

    public GrupoVO() {
    }

    public GrupoVO(int idFrupo, String letra, int tutor_iddocente) {
        this.idFrupo = idFrupo;
        this.letra = letra;
        this.tutor_iddocente = tutor_iddocente;
    }

    public int getIdFrupo() {
        return idFrupo;
    }

    public void setIdFrupo(int idFrupo) {
        this.idFrupo = idFrupo;
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
        return "GrupoVO{" + "idFrupo=" + idFrupo + ", letra=" + letra + ", tutor_iddocente=" + tutor_iddocente + '}';
    }
    
}
