package VO_Y_DAO.VO;


public class BajaAusentismoVO {

    private int idbajaAusentismo;
    private String fecha;
    private String docenteReporta;
    private String asignatura;
    private int clave;
    private String fechasInasistencia;
    private String posibleCausa;
    private int alumno_idAlumno;
    private String resultado;

    public BajaAusentismoVO() {
    }

    public BajaAusentismoVO(int idbajaAusentismo, String fecha, String docenteReporta, String asignatura, int clave, String fechasInasistencia, String posibleCausa, int alumno_idAlumno) {
        this.idbajaAusentismo = idbajaAusentismo;
        this.fecha = fecha;
        this.docenteReporta = docenteReporta;
        this.asignatura = asignatura;
        this.clave = clave;
        this.fechasInasistencia = fechasInasistencia;
        this.posibleCausa = posibleCausa;
        this.alumno_idAlumno = alumno_idAlumno;
    }

    public int getIdbajaAusentismo() {
        return idbajaAusentismo;
    }

    public void setIdbajaAusentismo(int idbajaAusentismo) {
        this.idbajaAusentismo = idbajaAusentismo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDocenteReporta() {
        return docenteReporta;
    }

    public void setDocenteReporta(String docenteReporta) {
        this.docenteReporta = docenteReporta;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getFechasInasistencia() {
        return fechasInasistencia;
    }

    public void setFechasInasistencia(String fechasInasistencia) {
        this.fechasInasistencia = fechasInasistencia;
    }

    public String getPosibleCausa() {
        return posibleCausa;
    }

    public void setPosibleCausa(String posibleCausa) {
        this.posibleCausa = posibleCausa;
    }

    public int getAlumno_idAlumno() {
        return alumno_idAlumno;
    }

    public void setAlumno_idAlumno(int alumno_idAlumno) {
        this.alumno_idAlumno = alumno_idAlumno;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "BajaAusentismoVO{" + "idbajaAusentismo=" + idbajaAusentismo + ", fecha=" + fecha + ", docenteReporta=" + docenteReporta + ", asignatura=" + asignatura + ", clave=" + clave + ", fechasInasistencia=" + fechasInasistencia + ", posibleCausa=" + posibleCausa + ", alumno_idAlumno=" + alumno_idAlumno + ", resultado=" + resultado + '}';
    }
    

    
}
