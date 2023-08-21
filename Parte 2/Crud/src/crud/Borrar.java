package crud;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Borrar {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Debe proporcionar el nombre del archivo a borrar.");
            return;
        }

        String nombreArchivo = args[0];

        try {
            // Crear el objeto File con el nombre del archivo
            File archivo = new File(nombreArchivo);

            // Verificar si el archivo existe
            if (archivo.exists()) {
                // Eliminar el archivo
                if (archivo.delete()) {
                    System.out.println("Archivo eliminado correctamente.");
                } else {
                    System.out.println("No se pudo eliminar el archivo.");
                }
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar el archivo: " + e.getMessage());
        }
    }
}
