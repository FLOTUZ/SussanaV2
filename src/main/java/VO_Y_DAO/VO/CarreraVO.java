
package VO_Y_DAO.VO;

public class CarreraVO {
    private int idcarrera;
    private String nombre;

    public CarreraVO() {
    }

    public CarreraVO(int idcarrera, String nombre) {
        this.idcarrera = idcarrera;
        this.nombre = nombre;
    }

    public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CarreraVO{" + "idcarrera=" + idcarrera + ", nombre=" + nombre + '}';
    }
}
