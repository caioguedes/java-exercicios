
public class Principal {
	public static void main(String[] args) {
		Aluno caio = new Aluno();
		caio.bim1 = 70;
		caio.bim2 = 60;
		caio.bim3 = 80;
		caio.bim4 = 70;
		
		System.out.println(VerificadoraNotas.mediaAluno(caio));
		System.out.println(VerificadoraNotas.passouDeAno(caio));
	}
}
