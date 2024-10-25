#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package servicios;

import java.sql.Connection;

public interface InterfazConexionBaseDatos {
	public Connection generaConexion();
}
