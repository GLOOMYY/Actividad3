package crud;

import java.io.File;
import java.io.IOException;

public class Crear {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Debe proporcionar el nombre del archivo.");
            return;
        }

        String nombreArchivo = args[0];
        if (!nombreArchivo.endsWith(".txt")) {
            nombreArchivo += ".txt";
        }
        
        String rutaCarpeta = "C:\\Users\\admin\\Documents\\NetBeansProjects\\Actividad3\\Parte 2\\Crud\\archivos";
        File carpeta = new File(rutaCarpeta);
        
        File file = new File(carpeta, nombreArchivo);

        try {
            if (file.createNewFile()) {
                System.out.println("Archivo '" + nombreArchivo + "' creado correctamente en la carpeta '" + carpeta.getAbsolutePath() + "'.");
            } else {
                System.out.println("El archivo '" + nombreArchivo + "' ya existe en la carpeta '" + carpeta.getAbsolutePath() + "'.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }
}
