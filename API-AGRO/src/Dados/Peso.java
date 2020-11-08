package Dados;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor 
public class Peso {
    @Getter @Setter private double pesoArroba;
    @Getter @Setter private double pesoKg;
    
	
	public Peso(double pesokg, double pesoarroba){
		if(pesokg != 0 && pesoarroba !=0) {
			this.pesoKg = pesokg;
			this.pesoArroba = pesoarroba;
		}
		else if(pesoarroba == 0) {
			converteArroba(pesokg);
		}
		else if(pesokg == 0) {
			converteKg(pesoarroba);
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
	
}