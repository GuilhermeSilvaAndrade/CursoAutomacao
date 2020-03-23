
public class Roupa {
	
	String id;
	String tamanho;
	String cor;
	double preco;
	String quantidadeItem;

	public Roupa(String id, String tamanho, String cor, double preco, String quantidadeItem) {
		super();
		this.id = id;
		this.tamanho = tamanho;
		this.cor = cor;
		this.preco = preco;
		this.quantidadeItem = quantidadeItem;
	}

	public void compra() {
		
	}
	
	public void vende() {
		
	}
	
	public void troca() {
		
	}
	
	public void desconto() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getQuantidadeItem() {
		return quantidadeItem;
	}

	public void setQuantidadeItem(String quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}
	
}
