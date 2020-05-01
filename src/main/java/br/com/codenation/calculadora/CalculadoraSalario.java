package br.com.codenation.calculadora;


public class CalculadoraSalario {

	public long calcularSalarioLiquido(double salarioBase) {
		if (salarioBase > 1039) {
			Double descontoINSS = calcularInss(salarioBase);
			Double descontoIRRF = calcularIRFF(salarioBase - descontoINSS);
			return Math.round(salarioBase - descontoINSS - descontoIRRF);
		} else
			return Math.round(0.0);
	}


	private double calcularInss(double salarioBase) {
		double desconto;
		if (salarioBase <= 1500) {
			desconto = 0.08;
		} else if (salarioBase <= 4000) {
			desconto = 0.09;
		} else
			desconto = 0.11;
		return salarioBase * desconto;
	}

	private double calcularIRFF(double salarioBase) {
		double desconto;
		if (salarioBase <= 3000) {
			desconto = 0.0;
		} else if (salarioBase <= 6000) {
			desconto = 0.075;
		} else
			desconto = 0.15;
		return salarioBase * desconto;

	}


}
