import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
      //Scanner scan = new Scanner(System.in);
		//System.out.println("hello world");
         //String nome = "Ale";
		//int opcao;
		//double num1,num2;
		//Calculadora calc = new Calculadora();
		 //System.out.println("Selecionar operação 1/soma 2/subtracao 3/mult 4/divisao");
		 //opcao = scan.nextInt();
		 //calc.selecionarOp(opcao);

	   Girafa giraMili = new Girafa(1.5,45.5);
		
		giraMili.comer();
		giraMili.idade = 3;
		
		System.out.println(giraMili.idade);
		System.out.println(giraMili.altura);
		
       Impressora impressorahp = new Impressora(90,"termico","laser");
		
		impressorahp.imprimir();
       
		System.out.println(impressorahp.tamanhoPapel);
		System.out.println(impressorahp.tipoImpressao);
		
		
		BuracoNegro buraco = new BuracoNegro(100,"estatico" , 900);
		
		buraco.atrair();
        System.out.println(buraco.massa);
        System.out.println(buraco.rotacao);
        System.out.println(buraco.campoGravitacional);
        
        Planeta planetinha = new Planeta(5000,"Gasoso" , "densa");
		
		planetinha.Orbitar();
        System.out.println(planetinha.tamanho);
        System.out.println(planetinha.composicao);
        System.out.println(planetinha.atmosfera);
        
        Serpente cobra = new Serpente(6,"Naja" , "Onivora");
		
		cobra.cacar();
        System.out.println(cobra.tamanho);
        System.out.println(cobra.especie);
        System.out.println(cobra.dieta);
        
        Ceramica escultura = new Ceramica("Barro",5, 10);
		
		escultura.esculpir();
        System.out.println(escultura.composicao);
        System.out.println(escultura.altura);
        System.out.println(escultura.largura);
        
        Cometa astro = new Cometa(4500,"Gelo" , "Poeira");
		
		astro.orbitar();
        System.out.println(astro.tamanho);
        System.out.println(astro.composicaoQuimica);
        System.out.println(astro.composicaoNucleo);
        
        Estrela estrelinha = new Estrela(7500,"Rosa" , "Supernova");
		
		estrelinha.brilhar();
        System.out.println(estrelinha.massa);
        System.out.println(estrelinha.cor);
        System.out.println(estrelinha.tipo);
        
        Onibus busao = new Onibus(50, 3 , "Diesel");
		
		busao.andar();
        System.out.println(busao.assentos);
        System.out.println(busao.portas);
        System.out.println(busao.combustivel);
        
        Exportacao trambique = new Exportacao(5,"Noruega" , "Teclados");
		
		trambique.exportar();
        System.out.println(trambique.produtos);
        System.out.println(trambique.destino);
        System.out.println(trambique.mercadoria);
        
        Dentista paulo = new Dentista("Plastico","Sugador" , "Pós Graduação");
		
		paulo.tratamento();
        System.out.println(paulo.especializacao);
        System.out.println(paulo.ferramentas);
        System.out.println(paulo.formacao);
        
        Jaqueta jeans = new Jaqueta("Jeans","Oversized" , "G");
		
		jeans.vestir();
        System.out.println(jeans.material);
        System.out.println(jeans.estilo);
        System.out.println(jeans.tamanho);
        
        Botas sapato = new Botas("Couro","Curta" , "42");
		
		sapato.vestir();
        System.out.println(sapato.material);
        System.out.println(sapato.estilo);
        System.out.println(sapato.tamanho);
        
        Chapeu chapeuPalha = new Chapeu("Palha","Grande" , "29");
		
		chapeuPalha.Vestir();
        System.out.println(chapeuPalha.material);
        System.out.println(chapeuPalha.estilo);
        System.out.println(chapeuPalha.tamanho);
        
        Gravata social = new Gravata("Social","Preta" , "4");
		
		social.vestir();
		System.out.println(social.material);
        System.out.println(social.estilo);
        System.out.println(social.tamanho);
        
        Vestido casamento = new Vestido("Algodão","Casamento" , "43");
		
		casamento.vestir();
		System.out.println(casamento.material);
        System.out.println(casamento.estilo);
        System.out.println(casamento.tamanho);
        
        Saia saiacurta = new Saia("Xadrez","vermelha" , "32");
		
        saiacurta.vestir();
		System.out.println(saiacurta.material);
        System.out.println(saiacurta.estilo);
        System.out.println(saiacurta.tamanho);
        
        Tenis nike = new Tenis("Nike","Jordan" ,"37");
		
        nike.vestir();
		System.out.println(nike.material);
        System.out.println(nike.estilo);
        System.out.println(nike.tamanho);
        
        Calca cargo = new Calca("Cargo","marrom" , "28");
		
        cargo.vestir();
		System.out.println(cargo.material);
        System.out.println(cargo.estilo);
        System.out.println(cargo.tamanho);
        
       Camisa polo = new Camisa("Polo","Vermelha" , "M");
		
        polo.vestir();
		System.out.println(polo.material);
        System.out.println(polo.estilo);
        System.out.println(polo.tamanho);
        
        Sueter sueterla = new Sueter("Lã","Roxo" , "24");
		
        sueterla.vestir();
		System.out.println(sueterla.material);
        System.out.println(sueterla.estilo);
        System.out.println(sueterla.tamanho);
        
	}
	
	}


