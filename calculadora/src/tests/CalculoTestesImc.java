package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import control.CalculadoraImc;

public class CalculoTestesImc {

	CalculadoraImc cal;

	@Before
	public void setup() {

		cal = new CalculadoraImc();
	}

	// IMC ADULTO MASCULINO E FEMININO

	// Teste com Valor imc Limite Maximo para Peso Muito Grave

	// idade 65
	@Test
	public void testeAdultoBaixoPesoMuitoGraveLimiteMaximo() {
		Assert.assertEquals("Baixo peso muito grave",

				cal.calcularImc(70.49, 2.1, 65, "masculino"));

	}

	// Teste com Valor imc Limite Maximo para Adulto Peso Muito Grave

	// idade 20
	@Test
	public void testeAdultoBaixoPesoMuitoGraveLimiteMaximoIdade() {
		Assert.assertEquals("Baixo peso muito grave", cal.calcularImc(2.10, 70.49, 20, "masculino"));

	}

	// Teste com Valor imc Limite Minimo para Adulto Peso Grave

	// idade 20
	@Test
	public void testeAdultoBaixoPesoGraveLimiteMinimo() {
		Assert.assertEquals("Baixo peso grave", cal.calcularImc(2.10, 71, 20, "feminino"));

	}

	// Teste com Valor imc Limite Maximo para Adulto Peso Grave

	// idade 65

	@Test
	public void testeAdultoBaixoPesoGraveLimiteMaximoIdade() {
		Assert.assertEquals("Baixo peso grave", cal.calcularImc(2.05, 71.39, 65, "feminino"));

	}

	// Teste com Valor imc Limite Minimo para Adulto Baixo Peso

	// idade 20

	@Test
	public void testeAdultoBaixoPesoMinimoIdadeLimiteMinimo() {
		Assert.assertEquals("Baixo peso", cal.calcularImc(1.58, 42.44, 20, "feminino"));

	}

	// Teste com Valor imc Limite Maximo para Adulto Baixo Peso

	// idade 65

	@Test
	public void testeAdultoBaixoPesoMaximoLimiteMaximo() {
		Assert.assertEquals("Baixo peso", cal.calcularImc(1.58, 46, 65, "masculino"));

	}

	// Teste com Valor imc Limite Minimo para Adulto Peso Normal

	// idade 20

	@Test
	public void testeAdultoPesoNormalLimiteMinimo() {
		Assert.assertEquals("Peso normal", cal.calcularImc(2.03, 76.6, 20, "masculino"));

	}

	// Teste com Valor imc Limite Maximo para Adulto Peso Normal

	// idade 65

	@Test
	public void testeAdultoPesoNormalLimiteMaximo() {
		Assert.assertEquals("Peso normal", cal.calcularImc(2.10, 108, 65, "feminino"));

	}

	// Teste com Valor imc Limite Minimo para Adulto Sobrepeso

	// idade 20

	@Test
	public void testeAdultoSobrePesoLimiteMinimo() {
		Assert.assertEquals("Sobrepeso", cal.calcularImc(1.46, 54, 20, "feminino"));

	}

	// Teste com Valor imc Limite Maximo para Adulto Sobrepeso

	// idade 65

	@Test
			public void testeAdultoSobrePesoLimiteMaximoIdade() {
				Assert.assertEquals("Sobrepeso",
						cal.calcularImc(1.46, 63.9, 65, "masculino"));

			}

	// Teste com Valor imc Limite Minimo para Adulto Obesidade I

	// idade 65

	@Test
	public void testeAdultoObesidadeILimiteMinimo() {
		Assert.assertEquals("Obesidade grau I", cal.calcularImc(1.90, 109, 65, "feminino"));

	}

	// Teste com Valor imc Limite Maximo para Adulto Obesidade I

	// idade 65
	@Test
	public void testeAdultoObesidadeILimiteMaximo() {
		Assert.assertEquals("Obesidade grau I", cal.calcularImc(1.90, 126.28, 21, "feminino"));

	}

	// Teste com Valor imc Limite Minimo para Adulto Obesidade II

	// idade 65

	@Test
	public void testeAdultoObesidadeIILimiteMinimo() {
		Assert.assertEquals("Obesidade grau II", cal.calcularImc(1.46, 75, 65, "masculino"));

	}

	// Teste com Valor imc Limite Maximo para Adulto Obesidade I

	// idade 20
	@Test
	public void testeAdultoObesidadeIIMaximoLimite() {
		Assert.assertEquals("Obesidade grau II", cal.calcularImc(1.46, 85.2, 20, "masculino"));

	}

	// Teste com Valor imc Limite Minimo para Adulto Obesidade III

	// idade 65
	@Test
	public void testeAdultoObesidadeIIIMinimoIdade() {
		Assert.assertEquals("Obesidade grau III", cal.calcularImc(1.64, 108, 21, "masculino"));

	}

	@Test
	public void testeAdultoObesidadeIIIMaximoIdade() {
		Assert.assertEquals("Obesidade grau III", cal.calcularImc(1.64, 110, 21, "feminino"));

	}

	// IMC IDOSOS FEMININO

	// Teste com Valor imc Limite Minimo para Baixo Peso em Idosos sexo Feminino
	@Test
	public void testeIdosoFemininoBaixoPesoLimiteMaximo() {
		Assert.assertEquals("Baixo peso", cal.calcularImc(1.79, 68, 66, "feminino"));

	}

	// Teste com Valor imc Limite Minimo para Peso Normal em Idosos sexo
	// Feminino
	@Test
	public void testeIdosoFemininoPesoNormalLimiteMinimo() {
		Assert.assertEquals("Peso normal", cal.calcularImc(1.55, 53, 66, "feminino"));

	}

	// Teste com Valor imc Limite Maximo para Peso Normal em Idosos sexo
	// Feminino
	@Test
	public void testeIdosoFemininoPesoNormalLimiteMaximo() {
		Assert.assertEquals("Peso normal", cal.calcularImc(1.56, 65.5, 66, "feminino"));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso em Idosos sexo Feminino
	@Test
	public void testeIdosoFemininoSobrePesoLimiteMinimo() {
		Assert.assertEquals("Sobrepeso", cal.calcularImc(1.80, 88, 66, "feminino"));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso em Idosos sexo Feminino
	@Test
	public void testeIdosoFemininoSobrePesoLimiteMaximo() {
		Assert.assertEquals("Sobrepeso", cal.calcularImc(1.80, 103.61, 66, "feminino"));

	}

	// Teste com imc Valor Limite Minimo para Obesidade I em Idosos sexo
	// Feminino
	@Test
	public void testeIdosoFemininoObesidadeILimiteMinimo() {
		Assert.assertEquals("Obesidade grau I", cal.calcularImc(1.65, 88, 66, "feminino"));

	}

	// Teste com imc Valor Limite Maximo para Obesidade em Idosos sexo Feminino
	@Test
	public void testeIdosoFemininoObesidadeILimiteMaximo() {
		Assert.assertEquals("Obesidade grau I", cal.calcularImc(1.77, 100.7, 66, "feminino"));

	}

	// Teste com imc Valor Limite Minimo para Obesidade II em Idosos sexo
	// Feminino
	@Test
	public void testeIdosoFemininoObesidadeIILimiteMinimo() {
		Assert.assertEquals("Obesidade grau II", cal.calcularImc(1.88, 132, 66, "feminino"));

	}

	// Teste com imc Valor Limite Maximo para Obesidade II em Idosos sexo
	// Feminino
	@Test
	public void testeIdosoFemininoObesidadeIILimiteMaximo() {
		Assert.assertEquals("Obesidade grau II", cal.calcularImc(1.58, 104.5, 66, "feminino"));

	}

	// Teste com imc Valor Limite Minimo para Obesidade grau III em Idosos sexo
	// Feminino
	@Test
	public void testeIdosoFemininoObesidadeIIILimiteMenor() {
		Assert.assertEquals("Obesidade grau III", cal.calcularImc(1.60, 108, 66, "feminino"));

	}

	// IMC IDOSOS MASCULINO

	// Teste com imc Valor Maximo para Baixo Peso em Idosos sexo Masculino
	@Test
	public void testeIdosoMasculinoBaixoPeso() {
		Assert.assertEquals("Baixo peso", cal.calcularImc(1.64, 58.9, 66, "masculino"));

	}

	// Teste com imc Valor Minimo para Peso Normal em Idosos sexo Masculino
	@Test
	public void testeIdosoMasculinoPesoNormalLimiteMinimo() {
		Assert.assertEquals("Peso normal", cal.calcularImc(1.46, 47, 66, "masculino"));

	}

	// Teste com imc Valor Maximo para Peso Normal em Idosos sexo Masculino
	@Test
	public void testeIdosoMasculinoPesoNormalLimiteMaximo() {
		Assert.assertEquals("Peso normal", cal.calcularImc(1.46, 57.5, 66, "masculino"));

	}

	// Teste com imc Valor Minimo para Sobrepeso em Idosos sexo Masculino
	@Test
	public void testeIdosoMasculinoSobrePesoLimiteMinimo() {
		Assert.assertEquals("Sobrepeso", cal.calcularImc(1.65, 74, 66, "masculino"));

	}

	// Teste com imc Valor Maximo para Sobrepeso em Idosos sexo Masculino
	@Test
	public void testeIdosoMasculinoSobrePesoLimiteMaximo() {
		Assert.assertEquals("Sobrepeso", cal.calcularImc(1.65, 81.67, 66, "masculino"));

	}

	// Teste com imc Valor Minimo para Obesidade grau I em Idosos sexo Masculino
	@Test
	public void testeIdosoMasculinoObesidadeILimiteMinimo() {
		Assert.assertEquals("Obesidade grau I", cal.calcularImc(1.90, 109, 66, "masculino"));

	}

	// Teste com imc Valor Maximo para Obesidade grau I em Idosos sexo Masculino
	@Test
	public void testeIdosoMasculinoObesidadeILimiteMaximo() {
		Assert.assertEquals("Obesidade grau I", cal.calcularImc(1.90, 126.35, 66, "masculino"));

	}

	// Teste com imc Valor Minimo para Obesidade grau II em Idosos sexo
	// Masculino
	@Test
	public void testeIdosoMasculinoObesidadeIILimiteMinimo() {
		Assert.assertEquals("Obesidade grau II", cal.calcularImc(1.46, 75, 66, "masculino"));

	}

	// Teste com imc Valor Maximo para Obesidade grau II em Idosos sexo
	// Masculino
	@Test
	public void testeIdosoMasculinoObesidadeIILimiteMaximo() {
		Assert.assertEquals("Obesidade grau II", cal.calcularImc(1.46, 85.05, 66, "masculino"));

	}

	// Teste com imc Valor Minimo para Obesidade grau III em Idosos sexo
	// Masculino
	@Test
	public void testeIdosoMasculinoObesidadeIII() {
		Assert.assertEquals("Obesidade grau III", cal.calcularImc(1.80, 130, 66, "masculino"));

	}

}
