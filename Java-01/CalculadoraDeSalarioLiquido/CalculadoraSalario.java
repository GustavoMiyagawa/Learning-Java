public class CalculadoraSalario {

	public long calcularSalarioLiquido(double salarioBase) {
		if (salarioBase <= 1039) return Math.round(0.0);

        	double salarioMenosINSS = calcularInss(salarioBase);
        	double resultado = calculaIRRF(salarioMenosINSS);
        	return Math.round(resultado);
	}
	
	private double calcularInss(double salarioBase) {
	
		double salarioMenosINSS = 0.0, percentual = 0.0;

		if (salarioBase <= 1500) {
            		percentual = 8.0 / 100;
            		salarioMenosINSS = salarioBase - (percentual * salarioBase);
        	} else if (salarioBase >= 1500.01 && salarioBase <= 4000) {
            		percentual = 9.0 / 100;
            		salarioMenosINSS = salarioBase - (percentual * salarioBase);
        	} else {
            		percentual = 11.0 / 100;
            		salarioMenosINSS = salarioBase - (percentual * salarioBase);
        	}
        	
        	return salarioMenosINSS;
	}

	private static Double calculaIRRF(double salarioMenosINSS) {

		double salarioMenosIRRF = 0.0, percentual = 0.0;

		if (salarioMenosINSS <= 3000) {
				salarioMenosIRRF = salarioMenosINSS;
		} else if (salarioMenosINSS >= 3001 && salarioMenosINSS <= 6000) {
				percentual = 7.5 / 100;
				salarioMenosIRRF = salarioMenosINSS - (percentual * salarioMenosINSS);
		} else {
				percentual = 15.0 / 100;
				salarioMenosIRRF = salarioMenosINSS - (percentual * salarioMenosINSS);
		}

		return salarioMenosIRRF;
	}

}
