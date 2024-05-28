package br.com.marialuisa.TrabalhoA3.model;

import org.junit.*;

public class CarroTest {

	@Test
	public void testLigarMotor() {
		// Cenário
		String modelo1 = "Uno Mille";
		String modelo2 = "Gol Turbo";
		String modelo3 = "Ka Sedan";

		Carro carro1 = new Carro("Fiat", modelo1, 2015);
		Carro carro2 = new Carro("VW", modelo2, 2020, true, 0);
		Carro carro3 = new Carro("Ford", modelo3, 2019, true, 60);

		// Ação
		System.out.println("\n--- Teste Ligar Motor ---\n");
		System.out.println(carro1.situacaoMotor());
		System.out.println(carro2.situacaoMotor());
		System.out.println(carro3.situacaoMotor());

		// Verificação
		String expected1 = "O motor do " + modelo1 + " foi ligado agora.";
		String expected2 = "O motor do " + modelo2 + " já estava ligado.";
		String expected3 = "O motor do " + modelo3 + " já estava ligado.";

		Assert.assertEquals(expected1, carro1.ligarMotor());
		Assert.assertEquals(expected2, carro2.ligarMotor());
		Assert.assertEquals(expected3, carro3.ligarMotor());
	}

	@Test
	public void testdesLigarMotor() {
		// Cenário
		String modelo1 = "Uno Mille";
		String modelo2 = "Gol Turbo";
		String modelo3 = "Ka Sedan";

		Carro carro1 = new Carro("Fiat", modelo1, 2015);
		Carro carro2 = new Carro("VW", modelo2, 2020, true, 0);
		Carro carro3 = new Carro("Ford", modelo3, 2019, true, 60);

		// Ação
		System.out.println("\n--- Teste Desligar Motor ---\n");
		System.out.println(carro1.situacaoMotor());
		System.out.println(carro2.situacaoMotor());
		System.out.println(carro3.situacaoMotor());

		// Verificação
		String expected1 = "O motor do " + modelo1 + " já estava desligado.";
		String expected2 = "O motor do " + modelo2 + " foi desligado agora.";
		String expected3 = "ATENÇÃO: O motor do " + modelo3 + " não foi desligado pois o carro está em movimento.";

		Assert.assertEquals(expected1, carro1.desligarMotor());
		Assert.assertEquals(expected2, carro2.desligarMotor());
		Assert.assertEquals(expected3, carro3.desligarMotor());
	}

	@Test
	public void testAcelerar() {
		// Cenário
		String modelo1 = "Uno Mille";
		String modelo2 = "Gol Turbo";
		String modelo3 = "Ka Sedan";

		Carro carro1 = new Carro("Fiat", modelo1, 2015);
		Carro carro2 = new Carro("VW", modelo2, 2020, true, 0);
		Carro carro3 = new Carro("Ford", modelo3, 2019, true, 60);

		// Ação
		System.out.println("\n--- Teste Acelerar ---\n");
		System.out.println(carro1.situacaoMotor());
		System.out.println(carro2.situacaoMotor());
		System.out.println(carro3.situacaoMotor());

		// Verificação
		String expected1 = modelo1 + " --> ATENÇÃO: Não é possível acelerar com o motor desligado!";
		String expected2 = modelo2 + " --> ACELEROU!!! Velocidade atual: 20 Km/h.";
		String expected3 = modelo3 + " --> ACELEROU!!! Velocidade atual: 80 Km/h.";

		Assert.assertEquals(expected1, carro1.acelerar(20));
		Assert.assertEquals(expected2, carro2.acelerar(20));
		Assert.assertEquals(expected3, carro3.acelerar(20));
	}

	@Test
	public void testFrear() {
		// Cenário

		Carro uno = new Carro("Fiat", "Uno Mille", 2015);
		Carro gol = new Carro("VW", "Gol Turbo", 2020, true, 0);
		Carro sedan = new Carro("Ford", "Ka Sedan", 2019, true, 60);
		Carro onyx = new Carro("Fiat", "Onyx", 2018, true, 30);

		// Ação
		System.out.println("\n--- Teste Frear ---\n");
		System.out.println(uno.situacaoMotor());
		System.out.println(gol.situacaoMotor());
		System.out.println(sedan.situacaoMotor());
		System.out.println(onyx.situacaoMotor());

		// Verificação
		String expected1 = uno.getModelo() + " --> ATENÇÃO: O motor está desligado! O carro já está parado!";
		String expected2 = gol.getModelo()+ " --> ATENÇÃO: O carro já está parado!";
		String expected3 = sedan.getModelo()+ " --> FREOU!!! O carro está PARADO!";
		String expected4 = onyx.getModelo()+ " --> FREOU!!! O carro está PARADO!";

		Assert.assertEquals(expected1, uno.frear(40));
		Assert.assertEquals(expected2, gol.frear(40));
		Assert.assertEquals(expected3, sedan.frear(60));
		Assert.assertEquals(expected4, onyx.frear(40));

	}
}