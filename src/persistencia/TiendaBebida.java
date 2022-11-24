package persistencia;

public class TiendaBebida extends Tienda {
    private int nroBebidas;
    private Bebida[] bebidas = new Bebida[50];
    private String registroSanitario;

    public TiendaBebida(int nit, String nombre, String direcion, int nroBebidas, Bebida[] bebidas, String registroSanitario) {
        super(nit, nombre, direcion);
        this.nroBebidas = nroBebidas;
        this.bebidas = bebidas;
        this.registroSanitario = registroSanitario;
    }

    public TiendaBebida(int nroBebidas, Bebida[] bebidas, String registroSanitario) {
        this.nroBebidas = nroBebidas;
        this.bebidas = bebidas;
        this.registroSanitario = registroSanitario;
    }

    public int getNroBebidas() {
        return nroBebidas;
    }

    public void setNroBebidas(int nroBebidas) {
        this.nroBebidas = nroBebidas;
    }

    public Bebida[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(Bebida[] bebidas) {
        this.bebidas = bebidas;
    }

    public String getRegistroSanitario() {
        return registroSanitario;
    }

    public void setRegistroSanitario(String registroSanitario) {
        this.registroSanitario = registroSanitario;
    }
}
