package EjercicioExamen;

import java.time.LocalDate;

public class Venta{
    
    private float importeVendido;
    private LocalDate fecha;
   
    public Venta(float importeVendido, LocalDate fecha) {
        this.importeVendido = importeVendido;
        this.fecha = fecha;
    }

    public Venta(){
        
    }

    public float getImporteVendido() {
        return importeVendido;
    }

    public void setImporteVendido(float importeVendido) {
        this.importeVendido = importeVendido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public String toString() {
        return "Venta [fecha=" + fecha + ", importeVendido=" + importeVendido + "]";
    }

   
}
