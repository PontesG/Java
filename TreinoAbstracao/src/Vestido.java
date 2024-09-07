
public class Vestido {
    public String material;
    public String estilo;
    public String tamanho;

    public Vestido(String tipoMaterial, String estiloVestido, String tamanhoVestido) {
        this.material = tipoMaterial;
        this.estilo = estiloVestido;
        this.tamanho = tamanhoVestido;
    }

    public void vestir() {
        System.out.println("Vestindo vestido...");
        System.out.println("Vestiu!");
    }
}
