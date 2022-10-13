package herencia.e2;

public class Materia {
    protected String sigla, nombre, paralelo, tipo, carreraPerteneciente, modalidad, nomDocente;
    protected int cargaHoraria, idDocente;

    public Materia(String sigla, String nombre, String paralelo, String tipo, String carreraPerteneciente, String modalidad, String nomDocente, int cargaHoraria, int idDocente) {
        this.sigla = sigla;
        this.nombre = nombre;
        this.paralelo = paralelo;
        this.tipo = tipo;
        this.carreraPerteneciente = carreraPerteneciente;
        this.modalidad = modalidad;
        this.nomDocente = nomDocente;
        this.cargaHoraria = cargaHoraria;
        this.idDocente = idDocente;
    }

    public void mostrar() {
        System.out.println("Sigla: " + sigla);
        System.out.println("Nombre: " + nombre);
        System.out.println("Paralelo: " + paralelo);
        System.out.println("Carga horaria: " + cargaHoraria);
        System.out.println("Tipo: " + tipo);
        System.out.println("Carrera perteneciente: " + carreraPerteneciente);
        System.out.println("Modalidad: " + modalidad);
        System.out.println("Nombre docente: " + nomDocente);
        System.out.println("ID docente: " + idDocente);
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCarreraPerteneciente() {
        return carreraPerteneciente;
    }

    public void setCarreraPerteneciente(String carreraPerteneciente) {
        this.carreraPerteneciente = carreraPerteneciente;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getNomDocente() {
        return nomDocente;
    }

    public void setNomDocente(String nomDocente) {
        this.nomDocente = nomDocente;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }
}
