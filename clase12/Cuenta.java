package clase12;

public abstract class Cuenta {
	
	private double saldo;

	public void setSaldo(double saldo) {
		this.saldo = saldo;
		System.out.println("Tu nuevo saldo es: " + informarSaldo());
	}

	public double informarSaldo() {
		return saldo;
	}

	public void depositar(double monto) {
		setSaldo(informarSaldo() + monto);
	}

	public abstract void extraer(double monto);

}
