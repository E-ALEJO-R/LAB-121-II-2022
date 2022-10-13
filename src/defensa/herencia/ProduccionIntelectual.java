package defensa.herencia;

public class ProduccionIntelectual {
    protected String autor, tipo;

    public ProduccionIntelectual(String autor, String tipo) {
        this.autor = autor;
        this.tipo = tipo;
    }

    public void mostrar() {
        System.out.println("Autor: " + autor);
        System.out.println("Tipo: " + tipo);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
