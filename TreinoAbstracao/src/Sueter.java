

public class Sueter {
    public String material;
    public String estilo;
    public String tamanho;

    public Sueter(String tipoMaterial, String estiloSueter, String tamanhoSueter) {
        this.material = tipoMaterial;
        this.estilo = estiloSueter;
        this.tamanho = tamanhoSueter;
    }

    public void vestir() {
        System.out.println("Vestindo suéter...");
        System.out.println("Vestiu!");
    }
}
