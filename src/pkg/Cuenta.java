package pkg;

import java.util.List;
import java.util.ArrayList;


public class Cuenta {
	
	String numero;
	String titular;
	Double saldo;
	List <Movimiento> nMovimientos;
	

	public Cuenta(double i, String num) {
		saldo = i;
		numero = num;
		titular = "Propietario";
		nMovimientos = new ArrayList<>();
	}

	public void ingresar(double i) {
		saldo += i;
		EnumSigno S = EnumSigno.H;
		Movimiento m = new Movimiento(S, "Ingresados " + i +"€ en la cuenta " + numero, i);
		nMovimientos.add(m);
	}

	public void retirar(double i) {
		if(saldo-i>=-500) {
			saldo -= i;
			EnumSigno S = EnumSigno.D;
			Movimiento m = new Movimiento(S, "Retirados " + i +"€ en la cuenta " + numero, i);
			nMovimientos.add(m);
		}
		else {
			System.out.println("Fondos insuficientes (saldo "+saldo+"€) en la cuenta 67890 para el reintegro de "+i+"€");
		}
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
