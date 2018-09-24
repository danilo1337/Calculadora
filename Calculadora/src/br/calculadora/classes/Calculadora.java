package br.calculadora.classes;


public class Calculadora {
	private double valor1 = 0;
	private double valor2 = 0;
	
	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}
	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	
	
	public double calcularAdicao() {
		
		return valor1+valor2;
	}
	
	
	public double calcularSubtracao(){
		
		return valor1 - valor2;
	}
	
	public double calcularMultiplicacao() {
		return valor1 * valor2;
	}
	
	public double calcularDivisao() {
		return valor1 / valor2;
	}
	
	public double calcularPotencia() {
		return Math.pow(valor1, valor2);
	}
	
	public double calcularRaizQ() throws Exception{
		double calculo;
		if(valor1 == 0)
			throw  new Exception("Não existe Raiz quadrada de 0");
		if(valor1 < 0)
			calculo = Math.sqrt(valor1) *(-1);
		else
		calculo = Math.sqrt(valor1);
		
		return calculo; 
	}
	
}
