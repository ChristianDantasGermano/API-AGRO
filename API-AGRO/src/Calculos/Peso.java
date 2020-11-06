package Calculos;

public class Peso {
	protected double pesoArroba;
	protected double pesoKg;
		
	
	public Peso(double peso, String tipo){
		if(tipo == "arroba") {
			converteKg(peso);
		}
		else if(tipo == "kg") {
			converteKg(peso);
		}
	}
	
	public double converteKg(double valorArroba) {
		this.pesoArroba = valorArroba;
		this.pesoKg = (valorArroba*14.688);
		return (pesoKg);
	}
	
	public double converteArroba(double valorKg) {
		this.pesoKg = valorKg;
		this.pesoArroba = (valorKg/14.688);
		return (pesoArroba);
	}

	public double getPesoArroba() {
		return pesoArroba;
	}

	public void setPesoArroba(double pesoArroba) {
		this.pesoArroba = pesoArroba;
	}

	public double getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(double pesoKg) {
		this.pesoKg = pesoKg;
	}
}
