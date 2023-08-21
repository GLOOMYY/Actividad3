package crud;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Editar {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Debe proporcionar el nombre del archivo como argumento.");
            return;
        }

        String archivo = args[0];
        String nuevoNombre = args[1];
        long nuevoNumero = Long.parseLong(args[2]);

        editarContacto(archivo, nuevoNombre, nuevoNumero);
    }

    public static void editarContacto(String archivo, String nuevoNombre, long nuevoNumero) {
        try {
            File file = new File(archivo);

            if (!file.exists()) {
                System.out.println("El archivo no existe.");
                return;
            }

            // Crear un archivo temporal
            File tempFile = new File("temp.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));
            FileWriter fw = new FileWriter(tempFile);

            String line;
            boolean encontrado = false;

            while ((line = br.readLine()) != null) {
                String[] datos = line.split("!");

                String nombre = datos[0];
                long numero = Long.parseLong(datos[1]);

                if (nombre.equals(nuevoNombre)) {
                    // Actualizar el número de contacto
                    line = nuevoNombre + "!" + nuevoNumero;
                    encontrado = true;
                }

                fw.write(line);
                fw.write(System.lineSeparator());
            }

            br.close();
            fw.close();

            if (encontrado) {
                // Eliminar el archivo original
                file.delete();

                // Renombrar el archivo temporal al nombre original
                tempFile.renameTo(file);

                System.out.println("Contacto actualizado.");
            } else {
                System.out.println("El contacto no existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al editar el contacto: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("El número proporcionado no es válido.");
        }
    }
}
