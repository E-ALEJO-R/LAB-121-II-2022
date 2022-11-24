package persistence.defensa.archivos;

import persistence.defensa.Canal;
import persistencia.file.MyObjectOutputStream;

import java.io.*;

public class ArchivoRanking {
    private final File file;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    private Canal canal;

    public ArchivoRanking(String name) {
        this.file = new File(name);
    }

    public void crear() {
        try {
            if (file.createNewFile()) {
                System.out.println("se ha creado el archivo con éxito");
            } else {
                System.out.println("el archivo ya ha sido creado anteriormente");
            }
        } catch (IOException e) {
            System.out.println("no se ha podido crear el archivo, ruta invalida...");
        }
    }

    public void adicionar(Canal canal) {
        try {
            if (file.length() > 0) {
                oos = new MyObjectOutputStream(new FileOutputStream(file, true));
            } else {
                oos = new ObjectOutputStream(new FileOutputStream(file));
            }
            oos.writeObject(canal);
            oos.flush();
            oos.close();
            System.out.println("guardado correctamente");
        } catch (FileNotFoundException e) {
            System.out.println("archivo no encontrado");
        } catch (IOException e) {
            System.out.println("error de entrada y salida");
        }
    }

    public void listar() {
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            while (true) {
                canal = (Canal) ois.readObject();
                canal.mostrar();
            }
        } catch (EOFException e) {
            try {
                if (ois != null) {
                    ois.close();
                    System.out.println("fin de lectura");
                }
            } catch (IOException ioe) {
                System.out.println("error de entrada y salida");
            }
        } catch (FileNotFoundException e) {
            System.out.println("archivo no encontrado");
        } catch (ClassNotFoundException e) {
            System.out.println("clase no encontrada");
        } catch (IOException e) {
            System.out.println("error de entrada y salida");
        } catch (NullPointerException e) {
            System.out.println("valor nulo: " + e.getMessage());
        }
    }

    public void canalMasAprob() {

    }
}
