package posnet;

public class Posnet {
	public static final double RECARGO_POR_CUOTA = 0.03;
	public static final int MIN_CANT_CUOTAS = 1;
	public static final int MAX_CANT_CUOTAS = 6;
	
	
	public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoAAbonar, int cantidadCuotas) {
		
		Ticket ticket = null;
		
		if (datosValidos(tarjeta,montoAAbonar,cantidadCuotas)) {
			double montoFinal = montoAAbonar + (montoAAbonar * recargoSegunCuotas(cantidadCuotas));
			if (tarjeta.tieneSaldoDisponible(montoFinal)) {
				tarjeta.descontar(montoFinal);
				String nombreApellido = tarjeta.nombreCompletoTitular();
				double montoPorCuota = montoFinal / cantidadCuotas;
				ticket = new Ticket(nombreApellido, montoFinal, montoPorCuota);
			}	
		}
		
		return ticket;
	}


	private boolean datosValidos(TarjetaDeCredito tarjeta, double montoAAbonar, int cantidadCuotas) {
		// TODO Auto-generated method stub
		boolean esTarjetaValida = tarjeta != null;
		boolean montoValido = montoAAbonar > 0;
		boolean cantCuotasValidas = cantidadCuotas >= MIN_CANT_CUOTAS && cantidadCuotas <= MAX_CANT_CUOTAS;
		
		return esTarjetaValida && montoValido && cantCuotasValidas;
	}


	private double recargoSegunCuotas(int cantidadCuotas) {
		// TODO Auto-generated method stub
		return (cantidadCuotas - 1) * RECARGO_POR_CUOTA;
	}
	
	
	
}
