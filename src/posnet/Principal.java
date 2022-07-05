package posnet;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Posnet posnet = new Posnet();
		Persona titular = new Persona("35366170", "Ignacio", "Antonuccio", "1157380154", "nachoantonuccio@gmail.com");
		TarjetaDeCredito tarjeta = new TarjetaDeCredito("RIOP", "4566700034551000", 15000, EntidadFinanciera.CASTRMARD, titular);
		
		
		
		System.out.println("Tarjeta antes del pago...");
		System.out.println(tarjeta);
		
		Ticket ticketGenerado =	posnet.efectuarPago(tarjeta, 10000, 1);
		System.out.println(ticketGenerado);
		
		System.out.println("Tarjeta despues del pago...");
		System.out.println(tarjeta);
		
		
	}

}
