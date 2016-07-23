
public class Paciente
{	
    private double peso;
    private double altura;

    /**
     * @param double peso
     * @param double altura
     */
    public Paciente(double peso, double altura) {
  
		this.peso = peso;
		this.altura = altura;
    }

    /**
     * @return double
     */
    public double getPeso() {
	return peso;
    }

    /**
     * @return double
     */
    public double getAltura() {
    	return altura;
    }

    /**
     * @param double altura
     * @return void
     */
    public void setAltura(double altura) {
    	this.altura = altura;
    }

    /**
     * @param double peso
     * @return void
     */
    public void setPeso(double peso) {
    	this.peso = peso;
    }

    /**
     * @return double
     */
    public double calculaIMC() {

		double calculo;
	
		calculo = peso / (altura * altura);
	
		return calculo;
    }

    /**
     * @return void
     */
    public String diagnostico() {

    	String resultado = "";
		double calculo = this.calculaIMC();
	
		if (calculo < 16) {
		    resultado = "Baixo peso muito grave = IMC abaixo de 16 kg/m²";
		}
	
		if (calculo >= 16 && calculo <= 16.99) {
		    resultado = "Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
		}
	
		if (calculo >= 17 && calculo <= 18.49) {
		    resultado = "Baixo peso = IMC entre 17 e 18,49 kg/m²";
		}
	
		if (calculo >= 18.50 && calculo <= 24.99) {
		    resultado = "Peso normal = IMC entre 18,50 e 24,99 kg/m²";
		}
	
		if (calculo >= 25 && calculo <= 29.99) {
		    resultado = "Sobrepeso = IMC entre 25 e 29,99 kg/m²";
		}
	
		if (calculo >= 30 && calculo <= 34.99) {
		    resultado = "Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
		}
	
		if (calculo >= 35 && calculo <= 39.99) {
		    resultado = "Obesidade grau II = IMC entre 35 e 39,99 kg/m²";
		}
	
		if (calculo >= 40) {
		    resultado = "Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²";
		}
		
		return resultado;
    }
}
