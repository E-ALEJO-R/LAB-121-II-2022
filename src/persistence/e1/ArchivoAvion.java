package persistence.e1;

import persistencia.file.MyObjectOutputStream;

import java.io.*;

public class ArchivoAvion {

    private final File file;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    private Avion avion;

    public ArchivoAvion(String name) {
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

    public void agregar(Avion av) {
        try {
            if (file.length() > 0) {
                oos = new MyObjectOutputStream(new FileOutputStream(file, true));
            } else {
                oos = new ObjectOutputStream(new FileOutputStream(file));
            }
            oos.writeObject(av);
            oos.flush();
            oos.close();
            System.out.println("guardado correctamente");
        } catch (FileNotFoundException e) {
            System.out.println("archivo no encontrado");
        } catch (IOException e) {
            System.out.println("error de entrada y salida");
        }
    }

    public void eliminar(Avion avion) {
        File temp = new File("tmp.txt");
        try {
            if (!temp.createNewFile()) System.out.println("error al crear el archivo aux");
        } catch (IOException e) {
            System.out.println("no se a podido crear el archivo aux");
        }
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            oos = new ObjectOutputStream(new FileOutputStream(temp));
            while (true) {
                this.avion = (Avion) ois.readObject();
                if (!this.avion.equals(avion)) {
                    oos.writeObject(this.avion);
                }
            }

        } catch (EOFException e) {
            try {
                if (ois != null) ois.close();
                if (oos != null) oos.close();
                file.delete();
                temp.renameTo(file);
            } catch (IOException exception) {
                System.out.println("error de entrar y salida");
            }
        } catch (FileNotFoundException e) {
            System.out.println("archivo no encontrado");
        } catch (ClassNotFoundException e) {
            System.out.println("clase no encontrada");
        } catch (IOException e) {
            System.out.println("error de entrada y salida");
        }
    }

    public void listar() {
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            while (true) {
                avion = (Avion) ois.readObject();
                avion.mostrar();
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
        } catch (NullPointerException e){
            System.out.println("valor nulo: " + e.getMessage());
        }
    }
}
