
public class Principal
{	
    public static void main(String args[]) {

		Paciente p1 = new Paciente(52, 1.72);
		Paciente p2 = new Paciente(60, 1.67);
		Paciente p3 = new Paciente(120, 1.23);
	
		System.out.println("Paciente 1 - IMC: " + p1.calculaIMC());
		System.out.println(p1.diagnostico());
		System.out.println();
	
		System.out.println("Paciente 2 - IMC: " + p2.calculaIMC());
		System.out.println(p2.diagnostico());
		System.out.println();
	
		System.out.println("Paciente 3 - IMC: " + p3.calculaIMC());
		System.out.println(p3.diagnostico());
		System.out.println();
    }
}
