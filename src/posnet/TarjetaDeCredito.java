package posnet;

public class TarjetaDeCredito {
	
	private String entidadBancaria;
	private String nroTarjeta;
	private double saldo;
	private EntidadFinanciera entidadFinanciera;
	private Persona titular;
	
	
	public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, double saldo, EntidadFinanciera entidadFinanciera,
			Persona titular) {
		this.entidadBancaria = entidadBancaria;
		this.nroTarjeta = nroTarjeta;
		this.saldo = saldo;
		this.entidadFinanciera = entidadFinanciera;
		this.titular = titular;
	}


	@Override
	public String toString() {
		return "TarjetaDeCredito [entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo="
				+ saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + "]";
	}


	public String getEntidadBancaria() {
		return entidadBancaria;
	}


	public void setEntidadBancaria(String entidadBancaria) {
		this.entidadBancaria = entidadBancaria;
	}


	public String getNroTarjeta() {
		return nroTarjeta;
	}


	public void setNroTarjeta(String nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public EntidadFinanciera getEntidadFinanciera() {
		return entidadFinanciera;
	}


	public void setEntidadFinanciera(EntidadFinanciera entidadFinanciera) {
		this.entidadFinanciera = entidadFinanciera;
	}


	public Persona getTitular() {
		return titular;
	}


	public void setTitular(Persona titular) {
		this.titular = titular;
	}


	public boolean tieneSaldoDisponible(double montoFinal) {
		// TODO Auto-generated method stub
		return montoFinal <= saldo;	
	}


	public void descontar(double montoFinal) {
		// TODO Auto-generated method stub
		saldo = saldo - montoFinal;
	}


	public String nombreCompletoTitular() {
		// TODO Auto-generated method stub
		return titular.nombreCompleto();
	}

	
	
	
	
}
