import static org.junit.Assert.*;

import org.junit.Test;

public class TestRegistroPontos {

	@Test
	public void pontosCriarTopico() {
		
		Usuario usuario = new Usuario();
		usuario.nome = "Caio";
		RegistroPontos registroPontos = new RegistroPontos(new CalculadoraBonus());
		registroPontos.criarUmTopico(usuario);
		
		assertEquals(5, usuario.pontos);
	}
	
	@Test
	public void pontosCriaTopicoVip() {
		
		Usuario usuario = new Usuario();
		usuario.nome = "Caio";
		usuario.vip = true;
		RegistroPontos registroPontos = new RegistroPontos(new CalculadoraBonus());
		registroPontos.criarUmTopico(usuario);
		
		assertEquals(25, usuario.pontos);
	}
	
	@Test
	public void pontosCriaTopicoBonusDia() {
		
		Usuario usuario = new Usuario();
		usuario.nome = "Caio";
		CalculadoraBonus bonus = new CalculadoraBonus();
		bonus.bonusDoDia = 3;
		RegistroPontos registroPontos = new RegistroPontos(bonus);
		registroPontos.criarUmTopico(usuario);
		
		assertEquals(15, usuario.pontos);
	}

	@Test
	public void pontosCriaTopicoBonusDiaVip() {
		
		Usuario usuario = new Usuario();
		usuario.nome = "Caio";
		usuario.vip = true;
		CalculadoraBonus bonus = new CalculadoraBonus();
		bonus.bonusDoDia = 2;
		RegistroPontos registroPontos = new RegistroPontos(bonus);
		registroPontos.criarUmTopico(usuario);
		
		assertEquals(50, usuario.pontos);
	}
}
