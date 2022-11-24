package persistence.e1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO Auto-generated method stub
        //CINTHIA MOLINA CUTILE
        ArchivoAvion archivoAvion=new ArchivoAvion("Datos.txt");
        archivoAvion.crear();
        Avion a1=new Avion("76226","La Paz","Oruro","6:00","Alex");
        Avion a2=new Avion ("6788","Santa Cruz","Beni","7:00","Gabriel");
        Avion a3=new Avion ("78754","Tarija","Cochabamba","5:30","Cristian");

        archivoAvion.agregar(a1);
        archivoAvion.agregar(a2);
        archivoAvion.agregar(a3);
        archivoAvion.listar();
        // archivoAvion.eliminar("76226");
        // archivoAvion.listar();
    }

}