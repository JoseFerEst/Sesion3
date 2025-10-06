package pkg;

public class Cuenta {
	
	String numero;
	String titular;
	Double saldo;

	public Cuenta(double i) {
		saldo = i;
	}

	public double ingresar(double i) {
		saldo += i;
		return saldo;
	}

	public double retirar(double i) {
		saldo -= i;
		return saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
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
