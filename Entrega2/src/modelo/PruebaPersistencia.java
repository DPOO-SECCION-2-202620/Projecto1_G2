package modelo;

import java.util.ArrayList;

public class PruebaPersistencia {

    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        Socio socio1 = new Socio("valen_padel", "clave123", "Intermedio");
        Administrador admin1 = new Administrador("admin_carlos", "admin123");
        Entrenador profe1 = new Entrenador("profe_luis", "luis123", "DESC-LUIS");
        
        usuarios.add(socio1);
        usuarios.add(admin1);
        usuarios.add(profe1);
        
        PersistenciaUsuarios persistencia = new PersistenciaUsuarios();
        System.out.println("Guardando datos...");
        persistencia.guardarUsuarios(usuarios);
    }
}
