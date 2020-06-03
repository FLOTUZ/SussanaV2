
package VO_Y_DAO.VO;

import java.util.Date;

public class CanalizacionVO {
    private int idCanalizacion;
    private Date fecha;
    private int Tutor_idTutor;
    private int Alumno_idAlumno;
    private int carrera_idCarrera;
    private boolean trizteza;
    private boolean angustia;
    private boolean ansiedad;
    private boolean desesperacion;
    private boolean llanto;
    private boolean conduta;
    private boolean animo;
    private boolean exitacion;
    private boolean irritabilidad;
    private boolean drogas;
    private boolean aprendizaje;
    private boolean autoAgresiones;
    private String otro;
    private String descripcion;

    public CanalizacionVO() {
    }

    public CanalizacionVO(int idCanalizacion, Date fecha, int Tutor_idTutor, int Alumno_idAlumno, int carrera_idCarrera, boolean trizteza, boolean angustia, boolean ansiedad, boolean desesperacion, boolean llanto, boolean conduta, boolean animo, boolean exitacion, boolean irritabilidad, boolean drogas, boolean aprendizaje, boolean autoAgresiones, String otro, String descripcion) {
        this.idCanalizacion = idCanalizacion;
        this.fecha = fecha;
        this.Tutor_idTutor = Tutor_idTutor;
        this.Alumno_idAlumno = Alumno_idAlumno;
        this.carrera_idCarrera = carrera_idCarrera;
        this.trizteza = trizteza;
        this.angustia = angustia;
        this.ansiedad = ansiedad;
        this.desesperacion = desesperacion;
        this.llanto = llanto;
        this.conduta = conduta;
        this.animo = animo;
        this.exitacion = exitacion;
        this.irritabilidad = irritabilidad;
        this.drogas = drogas;
        this.aprendizaje = aprendizaje;
        this.autoAgresiones = autoAgresiones;
        this.otro = otro;
        this.descripcion = descripcion;
    }

    public int getIdCanalizacion() {
        return idCanalizacion;
    }

    public void setIdCanalizacion(int idCanalizacion) {
        this.idCanalizacion = idCanalizacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTutor_idTutor() {
        return Tutor_idTutor;
    }

    public void setTutor_idTutor(int Tutor_idTutor) {
        this.Tutor_idTutor = Tutor_idTutor;
    }

    public int getAlumno_idAlumno() {
        return Alumno_idAlumno;
    }

    public void setAlumno_idAlumno(int Alumno_idAlumno) {
        this.Alumno_idAlumno = Alumno_idAlumno;
    }

    public int getCarrera_idCarrera() {
        return carrera_idCarrera;
    }

    public void setCarrera_idCarrera(int carrera_idCarrera) {
        this.carrera_idCarrera = carrera_idCarrera;
    }

    public boolean isTrizteza() {
        return trizteza;
    }

    public void setTrizteza(boolean trizteza) {
        this.trizteza = trizteza;
    }

    public boolean isAngustia() {
        return angustia;
    }

    public void setAngustia(boolean angustia) {
        this.angustia = angustia;
    }

    public boolean isAnsiedad() {
        return ansiedad;
    }

    public void setAnsiedad(boolean ansiedad) {
        this.ansiedad = ansiedad;
    }

    public boolean isDesesperacion() {
        return desesperacion;
    }

    public void setDesesperacion(boolean desesperacion) {
        this.desesperacion = desesperacion;
    }

    public boolean isLlanto() {
        return llanto;
    }

    public void setLlanto(boolean llanto) {
        this.llanto = llanto;
    }

    public boolean isConduta() {
        return conduta;
    }

    public void setConduta(boolean conduta) {
        this.conduta = conduta;
    }

    public boolean isAnimo() {
        return animo;
    }

    public void setAnimo(boolean animo) {
        this.animo = animo;
    }

    public boolean isExitacion() {
        return exitacion;
    }

    public void setExitacion(boolean exitacion) {
        this.exitacion = exitacion;
    }

    public boolean isIrritabilidad() {
        return irritabilidad;
    }

    public void setIrritabilidad(boolean irritabilidad) {
        this.irritabilidad = irritabilidad;
    }

    public boolean isDrogas() {
        return drogas;
    }

    public void setDrogas(boolean drogas) {
        this.drogas = drogas;
    }

    public boolean isAprendizaje() {
        return aprendizaje;
    }

    public void setAprendizaje(boolean aprendizaje) {
        this.aprendizaje = aprendizaje;
    }

    public boolean isAutoAgresiones() {
        return autoAgresiones;
    }

    public void setAutoAgresiones(boolean autoAgresiones) {
        this.autoAgresiones = autoAgresiones;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "CanalizacionVO{" + "idCanalizacion=" + idCanalizacion + ", fecha=" + fecha + ", Tutor_idTutor=" + Tutor_idTutor + ", Alumno_idAlumno=" + Alumno_idAlumno + ", carrera_idCarrera=" + carrera_idCarrera + ", trizteza=" + trizteza + ", angustia=" + angustia + ", ansiedad=" + ansiedad + ", desesperacion=" + desesperacion + ", llanto=" + llanto + ", conduta=" + conduta + ", animo=" + animo + ", exitacion=" + exitacion + ", irritabilidad=" + irritabilidad + ", drogas=" + drogas + ", aprendizaje=" + aprendizaje + ", autoAgresiones=" + autoAgresiones + ", otro=" + otro + ", descripcion=" + descripcion + '}';
    }
    
}
