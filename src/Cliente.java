
public class Cliente {
	
	String codigo;
	String email;
	String nome;
		
	public Cliente(String codigo, String email, String nome) {
		super();
		this.codigo = codigo;
		this.email = email;
		this.nome = nome;
	}

	public void compra() {
		
	}
	
	public void troca() {
		
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
