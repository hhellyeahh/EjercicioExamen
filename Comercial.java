package EjercicioExamen;

import java.util.ArrayList;
import java.time.LocalDate;

public class Comercial extends Empleado{

    private String codigo;
    private ArrayList <Venta> ventas = new ArrayList <Venta>();

    public Comercial(String id, String nombre, float sueldoBase, String sector, String codigo) {
        super(id, nombre, sueldoBase, sector);
        this.codigo = codigo;
    }

    public Comercial(){
        super();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void addVenta(Venta pVenta) {
        this.ventas.add(pVenta);
    }

    public void listarVentasPorFecha(LocalDate fecha){
        float total = 0;
        for (Venta v : ventas) {
            if(fecha.equals(v.getFecha())) {
                System.out.println(v.toString());
                total += v.getImporteVendido();
            }
        }
        if(total != 0 )
            System.out.println("Total ventas desde la fecha pedida: " + total);
        else
            System.out.println("NO HAY VENTAS");
    }

    @Override
    public String toString() {
        return "Comercial [codigo=" + codigo + ", ventas=" + ventas + "]";
    }

    
}