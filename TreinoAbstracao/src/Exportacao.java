public class Exportacao {
int produtos;
String destino;
String mercadoria;
public Exportacao(int qntdProdutos,String paisDestino,String tipoMercadoria) {
	 this.produtos = qntdProdutos;
	 this.destino = paisDestino;
	 this.mercadoria = tipoMercadoria;
}
public void exportar() {
	System.out.println("exportando...");
	System.out.println("exportado");
}
}
