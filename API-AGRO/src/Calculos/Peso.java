package Calculos;

public class Peso {
	protected double pesoArroba;
	protected double pesoKg;
	
	
	public Peso(double pesokg, double pesoarroba){
		if(pesokg == 0) {
			converteKg(pesoarroba);
		}
		else if(pesoarroba == 0) {
			converteArroba(pesokg);
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
}