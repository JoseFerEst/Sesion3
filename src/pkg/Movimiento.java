package pkg;

public class Movimiento {

	EnumSigno signo;
	String detalle;
	Double importe;
	
	public Movimiento(EnumSigno s, String d, Double i) {
		signo = s;
		detalle = d;
		importe = i;
	}
	
	public String getDetalle() {
		return detalle;
	}
	
	public Double getImporte() {
		return importe;
	}
	
	public EnumSigno getSigno() {
		return signo;
	}
	
	public void setDetalle(String d) {
		detalle = d;
	}
	
	public void setImporte(Double i) {
		importe = i;
	}
	
	public void setSigno(EnumSigno s) {
		signo = s;
	}
}
