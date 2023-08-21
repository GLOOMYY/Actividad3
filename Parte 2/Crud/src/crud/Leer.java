package crud;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;
import java.util.ArrayList;
import java.util.List;

public class Leer {

    private String nombreArchivo;

    public Leer(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public List<String> leerArchivo() {
        List<String> contenidoArchivo = new ArrayList<>();

        try {
            String nameNumberString;
            String name;
            long number;
            int index;

            // Using file pointer creating the file.
            File file = new File("C:\\Users\\admin\\Documents\\NetBeansProjects\\Actividad3\\Parte 2\\Crud\\archivos", nombreArchivo);

            if (!file.exists()) {
                System.out.println("El archivo no existe.");
                return contenidoArchivo;
            }

            // Opening file in reading mode.
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            boolean found = false;

            // Traversing the file
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {
                // reading line from the file.
                nameNumberString = raf.readLine();

                // splitting the string to get name and number
                String[] lineSplit = nameNumberString.split("!");

                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                // Add the contact data to the list
                String contactData = "Friend Name: " + name + "\n" + "Contact Number: " + number + "\n";
                contenidoArchivo.add(contactData);
            }
        } catch (IOException ioe) {
            System.out.println("Error al leer el archivo: " + ioe.getMessage());
        } catch (NumberFormatException nef) {
            System.out.println("Error de formato numérico: " + nef.getMessage());
        }

        return contenidoArchivo;
    }

    public static void main(String data[]) {
        if (data.length < 1) {
            System.out.println("Debe proporcionar el nombre del archivo.");
            return;
        }

        String nombreArchivo = data[0];
        Leer leer = new Leer(nombreArchivo);
        List<String> contenido = leer.leerArchivo();

        // Imprimir el contenido del archivo
        for (String linea : contenido) {
            System.out.println(linea);
        }
    }
}
