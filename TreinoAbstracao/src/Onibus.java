public class Onibus {
int assentos;
int portas;
String combustivel;

public Onibus(int qntdAssentos,int qntdPortas, String tipoCombustivel) {
	this.assentos = qntdAssentos;
	this.portas = qntdPortas;
	this.combustivel = tipoCombustivel;
}
public void andar() {
	 System.out.println("chegando ao ponto");
	 System.out.println("Passageiro no ponto!");
}
}
