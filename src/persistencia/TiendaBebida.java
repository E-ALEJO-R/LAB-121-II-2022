package persistencia;

public class TiendaBebida extends Tienda {
    private int nroBebidas;
    private Bebida[] bebidas;
    private String registroSanitario;

    public TiendaBebida(int nit, String nombre, String direcion, int nroBebidas, String registroSanitario) {
        super(nit, nombre, direcion);
        this.nroBebidas = nroBebidas;
        this.bebidas = new Bebida[this.nroBebidas];
        this.registroSanitario = registroSanitario;
    }

    public TiendaBebida(int nroBebidas, String registroSanitario) {
        this.nroBebidas = nroBebidas;
        this.bebidas = new Bebida[this.nroBebidas];
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

    public void setBebida(Bebida bebida) {
        for (int i = 0; i < nroBebidas; i++) {
            if (this.bebidas[i] == null){
                this.bebidas[i] = bebida;
                break;
            }
        }
    }

    public String getRegistroSanitario() {
        return registroSanitario;
    }

    public void setRegistroSanitario(String registroSanitario) {
        this.registroSanitario = registroSanitario;
    }
}
