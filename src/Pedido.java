
public class Pedido {

		String numeroPedido;
		String codigoCliente;
		double valor;
		String numeroProduto;
		double valorTotal;
		String quantidade;
		
		public Pedido(String numeroPedido, String codigoCliente, double valor, String numeroProduto, double valorTotal,
				String quantidade) {
			super();
			this.numeroPedido = numeroPedido;
			this.codigoCliente = codigoCliente;
			this.valor = valor;
			this.numeroProduto = numeroProduto;
			this.valorTotal = valorTotal;
			this.quantidade = quantidade;
		}

		public void efetuarPedido() {
			
		}
		
		public void cancelarPedido() {
			
		}

		public String getNumeroPedido() {
			return numeroPedido;
		}

		public void setNumeroPedido(String numeroPedido) {
			this.numeroPedido = numeroPedido;
		}

		public String getCodigoCliente() {
			return codigoCliente;
		}

		public void setCodigoCliente(String codigoCliente) {
			this.codigoCliente = codigoCliente;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public String getNumeroProduto() {
			return numeroProduto;
		}

		public void setNumeroProduto(String numeroProduto) {
			this.numeroProduto = numeroProduto;
		}

		public double getValorTotal() {
			return valorTotal;
		}

		public void setValorTotal(double valorTotal) {
			this.valorTotal = valorTotal;
		}

		public String getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(String quantidade) {
			this.quantidade = quantidade;
		}
		
}
