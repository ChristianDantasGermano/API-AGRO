package Calculos;

public class Peso {
	private double pesoArroba;
	private double pesoKg;
	
	
	public Peso(double pesokg, double pesoarroba){
		if(pesokg == 0) {
			converteKg(pesoarroba);
		}
		else if(pesoarroba == 0) {
			converteArroba(pesokg);
		}
	}
	
	public double converteKg(double valorArroba) {
		this.setPesoArroba(valorArroba);
		this.setPesoKg((valorArroba*14.688));
		return (getPesoKg());
	}
	
	public double converteArroba(double valorKg) {
		this.setPesoKg(valorKg);
		this.setPesoArroba((valorKg/14.688));
		return (getPesoArroba());
	}

	public double getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(double pesoKg) {
		this.pesoKg = pesoKg;
	}

	public double getPesoArroba() {
		return pesoArroba;
	}

	public void setPesoArroba(double pesoArroba) {
		this.pesoArroba = pesoArroba;
	}
	
	
}