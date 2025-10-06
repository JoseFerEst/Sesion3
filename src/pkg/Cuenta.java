package pkg;

public class Cuenta {
	
	String numero;
	String titular;
	Double saldo;

	public Cuenta(Double i) {
		saldo = i;
	}

	public Double ingresar(Double i) {
		saldo = 200.0;
		return saldo;
	}

	public Double retirar(Double i) {
		saldo = -200.0;
		return saldo;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
}
