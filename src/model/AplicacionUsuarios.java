package src.model;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import src.gui.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import src.gui.VentanaInicioSesion;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AplicacionUsuarios {

	private final String RUTA_FICHERO = ".\\files\\usuarios.json";
	private VentanaInicioSesion ventanaInicioSesion;
	private VentanaCrearUsuario ventanaCrearUsuario;
	private VentanaMenuUsuario ventanaMenuUsuario;
	private VentanaVerUsuario ventanaVerUsuario;
	private VentanaCambiarContraseña ventanaCambiarContraseña;
	private VentanaBorrarUsuario ventanaBorrarUsuario;

	private void crearFicheroJson() {
		File file = new File("./src/files/usuarios.json");
		//Crear carpeta para guardar los JSON
		crearCarpetaFiles();
		if (!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

	}

	private void crearCarpetaFiles() {
		File file = new File("./src/files");
		if (!file.exists()){
			file.mkdir();
		}
	}

	private JSONArray obtenerUsuariosJson() {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("./src/files/usuarios.json"));
		} catch (IOException | ParseException e) {
			throw new RuntimeException(e);
		}
		JSONArray list = new JSONArray();

	return list;
	}

	private int obtenerPosicionUsuario(String nombreUsuario, JSONArray usuarios) {
		return  0;
	}

	private JSONObject obtenerUsuarioJson(String nombreUsuario) {

		return  null;
	}

	public void ejecutar() {
		crearFicheroJson();
		crearUsuario("paco","abc","20","paco@gmail.com");

	}

	public void iniciarSesion(String nombreUsuario, String contraseñaUsuario) {

	}

	public void cerrarSesion() {

	}

	public void crearUsuario(String nombre, String contraseña, String edad, String correo) {

	}

	public void cambiarContraseña(String nombreUsuario, String nuevaContraseña) {

	}

	public void borrarUsuario(String nombreUsuario) {

	}

	public void mostrarVentanaCrearUsuario() {

	}

	public void mostrarVentanaVerUsuario(String nombreUsuario) {

	}

	public void mostrarVentanaCambiarContraseña(String nombreUsuario) {

	}

	public void mostrarVentanaBorrarUsuario(String nombreUsuario) {

	}
}
