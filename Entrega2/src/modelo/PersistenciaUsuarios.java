package modelo;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class PersistenciaUsuarios {
    
    String ruta = "C:/Datos_Seneca/usuarios.json";
    
    public void guardarUsuarios(ArrayList<Usuario> listaUsuarios) {
        try {
            Gson gson = new Gson(); 
            FileWriter escritor = new FileWriter(ruta);
            
            gson.toJson(listaUsuarios, escritor);
            
            escritor.close();
            System.out.println("¡Usuarios guardados con éxito!");
            
        } catch (Exception e) {
            System.out.println("Ocurrió un error al guardar el archivo.");
        }
    }
    

    public ArrayList<Usuario> cargarUsuarios() {
        try {
            Gson gson = new Gson();
            FileReader lector = new FileReader(ruta);
            
            java.lang.reflect.Type tipo = new TypeToken<ArrayList<Usuario>>(){}.getType();
            ArrayList<Usuario> usuarios = gson.fromJson(lector, tipo);
            
            lector.close();
            return usuarios;
            
        } catch (Exception e) {
            System.out.println("No hay archivo previo. Empezamos con una lista vacía.");
            return new ArrayList<Usuario>();
        }
    }
}