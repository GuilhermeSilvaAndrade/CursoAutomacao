
public class Main {
		
	public static void  main(String[] args) {
		
		Cliente cliente = new Cliente("1", "teste@teste.com", "Guilherme");
		System.out.println("Nome cliente: "+ cliente.getNome());
		System.out.println("Codigo cliente: "+ cliente.getCodigo());
		System.out.println("E-mail cliente: "+ cliente.getEmail());
		
		cliente.setEmail("guilherme@teste.com");
		
		System.out.println("Nome cliente: "+ cliente.getNome());
		System.out.println("Codigo cliente: "+ cliente.getCodigo());
		System.out.println("E-mail cliente: "+ cliente.getEmail());
	}

}
