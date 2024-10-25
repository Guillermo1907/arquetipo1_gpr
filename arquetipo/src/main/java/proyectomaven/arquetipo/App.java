package proyectomaven.arquetipo;

import servicios.ConexionBaseDatos;
import servicios.InterfazConexionBaseDatos;

/**
 * Hello world!
 */
public class App {
	
    public static void main(String[] args) {
       InterfazConexionBaseDatos ic = new ConexionBaseDatos();	
       
       
       ic.generaConexion();
       
       
    }
}
