package pkg;

public class Cuenta {
	
	String numero;
	String titular;
	Double saldo;

	public Cuenta(double i) {
		saldo = i;
	}

	public void ingresar(double i) {
		saldo += i;
	}

	public void retirar(double i) {
		saldo -= i;
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
