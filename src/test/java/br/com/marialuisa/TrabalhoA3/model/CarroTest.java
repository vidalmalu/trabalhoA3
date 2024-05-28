package br.com.marialuisa.TrabalhoA3.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
	        
	        assertEquals(expected1, carro1.ligarMotor());
	        assertEquals(expected2, carro2.ligarMotor());
	        assertEquals(expected3, carro3.ligarMotor());
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
	        
	        assertEquals(expected1, carro1.desligarMotor());
	        assertEquals(expected2, carro2.desligarMotor());
	        assertEquals(expected3, carro3.desligarMotor());
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
	        
	        assertEquals(expected1, carro1.acelerar(20));
	        assertEquals(expected2, carro2.acelerar(20));
	        assertEquals(expected3, carro3.acelerar(20));
	    }

	    @Test
	    public void testFrear() {
	    	// Cenário
	        String modelo1 = "Uno Mille";
	        String modelo2 = "Gol Turbo";
	        String modelo3 = "Ka Sedan";
	        String modelo4 = "Palio Weekend";

	        Carro carro1 = new Carro("Fiat", modelo1, 2015);
	        Carro carro2 = new Carro("VW", modelo2, 2020, true, 0);
	        Carro carro3 = new Carro("Ford", modelo3, 2019, true, 60);
	        Carro carro4 = new Carro("Fiat", modelo4, 2018, true, 30);

	        // Ação
	        System.out.println("\n--- Teste Frear ---\n");
	        System.out.println(carro1.situacaoMotor());
	        System.out.println(carro2.situacaoMotor());
	        System.out.println(carro3.situacaoMotor());
	        System.out.println(carro4.situacaoMotor());

	        // Verificação
	        String expected1 = modelo1 + " --> ATENÇÃO: O motor está desligado! O carro já está parado!";
	        String expected2 = modelo2 + " --> ATENÇÃO: O carro já está parado!";
	        String expected3 = modelo3 + " --> FREOU!!! O carro está PARADO!";
	        String expected4 = modelo4 + " --> FREOU!!! Velocidade atual: 0 km/h.";

	        
	        assertEquals(expected1, carro1.frear(40));
	        assertEquals(expected2, carro2.frear(40));
	        assertEquals(expected3, carro3.frear(40));
	        assertEquals(expected4, carro4.frear(40));

	    }	
	}

