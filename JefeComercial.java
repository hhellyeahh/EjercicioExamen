package EjercicioExamen;

public class JefeComercial extends Empleado{

    private int plus;

    public JefeComercial(String id, String nombre, float sueldoBase, String sector, int plus) {
        super(id, nombre, sueldoBase, sector);
        this.plus = plus;
    }

    public JefeComercial(){
        super();
    }

    public int getPlus() {
        return plus;
    }

    public void setPlus(int plus) {
        this.plus = plus;
    }


    public void buscarJefeComercial(){
        
    }

    @Override
    public String toString() {
        return "JefeComercial [plus=" + plus + "]";
    }

    
}
