package VO_Y_DAO.VO;

public class TutorVO {
    private int iddocente;
    private String departamento;
    private String puesto;
    private String correo;
    private int telefono;
    private int extension;
    private int persona_idPersona;

    public TutorVO() {
    }

    public TutorVO(int iddocente, String departamento, String puesto, String correo, int telefono, int extension, int persona_idPersona) {
        this.iddocente = iddocente;
        this.departamento = departamento;
        this.puesto = puesto;
        this.correo = correo;
        this.telefono = telefono;
        this.extension = extension;
        this.persona_idPersona = persona_idPersona;
    }

    public int getIddocente() {
        return iddocente;
    }

    public void setIddocente(int iddocente) {
        this.iddocente = iddocente;
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

    public int getPersona_idPersona() {
        return persona_idPersona;
    }

    public void setPersona_idPersona(int persona_idPersona) {
        this.persona_idPersona = persona_idPersona;
    }

    @Override
    public String toString() {
        return "TutorVO{" + "iddocente=" + iddocente + ", departamento=" + departamento + ", puesto=" + puesto + ", correo=" + correo + ", telefono=" + telefono + ", extension=" + extension + ", persona_idPersona=" + persona_idPersona + '}';
    }
}