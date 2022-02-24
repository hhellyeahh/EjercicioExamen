package EjercicioExamen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;

public class Gestor {
    
    private static File f = new File("empleados.obj");

    public static void insertarJefeComercial(){
        System.out.println("Introduce el ID del empleado a buscar.");
        String pID = Util.readText();

        if(f.exists()){
            System.out.println("El fichero ya existe.");
            int longitud = 0;
            boolean salir = false;
            FileInputStream fis = null;
            ObjectInputStream ois = null;
            Empleado e = null;
            try {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                longitud = Util.fileLength(f);
                
                for (int i = 0; i < longitud && salir == false; i++) {
                    e = (Empleado) ois.readObject();
                    if (e.getId()==pID){
                            salir = true;
                    }
                }
            } catch (Exception ex){
                System.out.println("Ha habido un problema, tio. No se ha podido encontrar.");
            }

            try {
                ois.close();
                fis.close();
            }
            catch (IOException ioe) {
                System.out.println("Ha habido un problema cerrando los flujos.");
            }

            if(salir == true){
                if(e instanceof JefeComercial)
                System.out.println(e.getNombre() + " es jefe del sector " + e.getSector() + ".");
            
                else if(e instanceof Comercial)
                System.out.println(
                    "Comercial: " + e.getNombre() + " con código: " + e.getId() +
                    "\nDesde qué fecha se desea ver las ventas (dd/mm/aaaa)?");
                    LocalDate fecha = Util.readDateDMY();
                    // TODO: luego explicamos el casteo 
                    ((Comercial) e).listarVentasPorFecha(fecha);     
            }

            else if(salir == false){
                System.out.println(
                    "¿Quieres añadir un jefe comercial o un comercial? [j/c]");
                char opt = Util.readChar('j', 'c');

                if(opt == 'j'){
                    System.out.println(
                        "¿De qué sector es el jefe comercial?");
                    String sector = Util.readText();
                    try {
                        fis = new FileInputStream(f);
                        ois = new ObjectInputStream(fis);
                        longitud = Util.fileLength(f);
                        
                        for (int i = 0; i < longitud && salir == false; i++) {
                            e = (Empleado) ois.readObject();
                            if (e.getSector().equalsIgnoreCase(sector) && e instanceof JefeComercial){
                                    salir = true;
                            }
                        }
                    } catch (Exception ex){
                        System.out.println("Ha habido un problema, tio. No se ha podido encontrar.");
                    }
        
                    try {
                        ois.close();
                        fis.close();
                    }
                    catch (IOException ioe) {
                        System.out.println("Ha habido un problema cerrando los flujos.");
                    }
                  if(salir == true){
                      System.out.println("");
                  }
                  else
                    System.out.println();
                }
            }
        
        }
    }

}
