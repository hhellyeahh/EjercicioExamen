package EjercicioExamen;

public class Empleado {

    private String id;
    private String nombre;
    private float sueldoBase;
    private String sector;

    public Empleado() {

    }

    public Empleado(String id, String nombre, float sueldoBase, String sector) {
        this.id = id;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.sector = sector;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", sector=" + sector + ", sueldoBase=" + sueldoBase + "]";
    }

    
}