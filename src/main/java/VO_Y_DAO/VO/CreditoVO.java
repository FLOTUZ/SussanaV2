package VO_Y_DAO.VO;

import java.util.Date;

public class CreditoVO {
    private int idCredito;
    private int folio;
    private String status;
    private Date fecha;
    private String tipo;
    private int Alumno_idAlumno;

    public CreditoVO() {
    }

    public CreditoVO(int idCredito, int folio, String status, Date fecha, String tipo, int Alumno_idAlumno) {
        this.idCredito = idCredito;
        this.folio = folio;
        this.status = status;
        this.fecha = fecha;
        this.tipo = tipo;
        this.Alumno_idAlumno = Alumno_idAlumno;
    }

    public int getIdCredito() {
        return idCredito;
    }

    public void setIdCredito(int idCredito) {
        this.idCredito = idCredito;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAlumno_idAlumno() {
        return Alumno_idAlumno;
    }

    public void setAlumno_idAlumno(int Alumno_idAlumno) {
        this.Alumno_idAlumno = Alumno_idAlumno;
    }

    @Override
    public String toString() {
        return "CreditoVO{" + "idCredito=" + idCredito + ", folio=" + folio + ", status=" + status + ", fecha=" + fecha + ", tipo=" + tipo + ", Alumno_idAlumno=" + Alumno_idAlumno + '}';
    }
    
}