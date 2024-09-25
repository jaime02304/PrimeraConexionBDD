package EjercicioJDBC.Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class inicioApp {

	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:port/user";
		
		String usuario="user";
		
		String contrasenia ="password";
	try {	
		Class.forName("org.postgresql.Driver");
		
		Connection conexionJDBC = DriverManager.getConnection(url, usuario, contrasenia);
		
		if(conexionJDBC!=null) {
			System.out.println("LA conexion ha sido un exito");
		}else {
			System.out.println("La conexion ha sido lamentable");
		}
	} catch (SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}

	}

}
