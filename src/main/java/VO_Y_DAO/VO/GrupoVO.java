package VO_Y_DAO.VO;

public class GrupoVO {
    private int idFrupo;
    private String letra;
    private int semestre;

    public GrupoVO() {
    }

    public GrupoVO(int idFrupo, String letra, int semestre) {
        this.idFrupo = idFrupo;
        this.letra = letra;
        this.semestre = semestre;
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

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "GrupoVO{" + "idFrupo=" + idFrupo + ", letra=" + letra + ", semestre=" + semestre + '}';
    }
}
