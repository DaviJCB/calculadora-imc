package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import control.Calculadora;

public class Tests {

	Calculadora calc;

	@Before
	public void setup() {
		calc = new Calculadora();
	}

	@Test
	public void AdultoHeM_BPMG_S() {
		Assert.assertEquals(calc.CalculaImcAdulto(47.3f, 1.72f), "Baixo peso muito grave");
	}

	@Test
	public void AdultoHeM_BPG_I() {
		Assert.assertEquals(calc.CalculaImcAdulto(45.2f, 1.68f), "Baixo peso grave");
	}

	@Test
	public void AdultoHeM_BPG_S() {
		Assert.assertEquals(calc.CalculaImcAdulto(46.8f, 1.66f), "Baixo peso grave");
	}

	@Test
	public void AdultoHeM_BP_I() {
		Assert.assertEquals(calc.CalculaImcAdulto(45.8f, 1.64f), "Baixo peso");
	}

	@Test
	public void AdultoHeM_BP_S() {
		Assert.assertEquals(calc.CalculaImcAdulto(46.1f, 1.58f), "Baixo peso");
	}

	@Test
	public void AdultoHeM_PN_I() {
		Assert.assertEquals(calc.CalculaImcAdulto(45.1f, 1.56f), "Peso normal");
	}

	@Test
	public void AdultoHeM_PN_S() {
		Assert.assertEquals(calc.CalculaImcAdulto(59.2f, 1.54f), "Peso normal");
	}

	@Test
	public void AdultoHeM_Sob_I() {
		Assert.assertEquals(calc.CalculaImcAdulto(65.7f, 1.62f), "Sobrepeso");
	}

	@Test
	public void AdultoHeM_Sob_S() {
		Assert.assertEquals(calc.CalculaImcAdulto(69.2f, 1.52f), "Sobrepeso");
	}

	@Test
	public void AdultoHeM_Ob1_I() {
		Assert.assertEquals(calc.CalculaImcAdulto(93.0f, 1.76f), "Obesidade grau I");
	}

	@Test
	public void AdultoHeM_Ob1_S() {
		Assert.assertEquals(calc.CalculaImcAdulto(94.1f, 1.64f), "Obesidade grau I");
	}

	@Test
	public void AdultoHeM_Ob2_I() {
		Assert.assertEquals(calc.CalculaImcAdulto(101.2f, 1.70f), "Obesidade grau II");
	}

	@Test
	public void AdultoHeM_Ob2_S() {
		Assert.assertEquals(calc.CalculaImcAdulto(102.3f, 1.60f), "Obesidade grau II");
	}

	@Test
	public void AdultoHeM_Ob3_I() {
		Assert.assertEquals(calc.CalculaImcAdulto(107.6f, 1.64f), "Obesidade grau III (obesidade mórbida)");
	}

	@Test
	public void idosO_BP_S() {
		Assert.assertEquals(calc.CalculaImcIdoso(67f, 1.75f), "Baixo peso");
	}

	@Test
	public void idosO_PN_I() {
		Assert.assertEquals(calc.CalculaImcIdoso(67.4f, 1.75f), "Peso normal");
	}

	@Test
	public void idosO_PN_S() {
		Assert.assertEquals(calc.CalculaImcIdoso(82.6f, 1.75f), "Peso normal");
	}

	@Test
	public void idosO_Sob_I() {
		Assert.assertEquals(calc.CalculaImcIdoso(83f, 1.75f), "Sobrepeso");
	}

	@Test
	public void idosO_Sob_S() {
		Assert.assertEquals(calc.CalculaImcIdoso(91.8f, 1.75f), "Sobrepeso");
	}

	@Test
	public void idosO_Ob1_I() {
		Assert.assertEquals(calc.CalculaImcIdoso(92.2f, 1.75f), "Obesidade grau I");
	}

	@Test
	public void idosO_Ob1_S() {
		Assert.assertEquals(calc.CalculaImcIdoso(107.1f, 1.75f), "Obesidade grau I");
	}

	@Test
	public void idosO_Ob2_I() {
		Assert.assertEquals(calc.CalculaImcIdoso(107.5f, 1.75f), "Obesidade grau II");
	}

	@Test
	public void idosO_Ob2_S() {
		Assert.assertEquals(calc.CalculaImcIdoso(122.1f, 1.75f), "Obesidade grau II");
	}

	@Test
	public void idosO_Ob3_I() {
		Assert.assertEquals(calc.CalculaImcIdoso(122.5f, 1.75f), "Obesidade grau III (obesidade mórbida)");
	}

	@Test
	public void idosA_BP_S() {
		Assert.assertEquals(calc.CalculaImcIdosa(67f, 1.75f), "Baixo peso");
	}

	@Test public void idosA_PN_I() {
	Assert.assertEquals(calc.CalculaImcIdosa(67.4f, 1.75f), "Peso normal");
	}
	
	@Test public void idosA_PN_S() {
	Assert.assertEquals(calc.CalculaImcIdosa(82.6f, 1.75f), "Peso normal");
	}
	
	@Test public void idosA_Sob_I() {
	Assert.assertEquals(calc.CalculaImcIdosa(83f, 1.75f), "Sobrepeso");
	}
	
	@Test public void idosA_Sob_S() {
	Assert.assertEquals(calc.CalculaImcIdosa(98f, 1.75f), "Sobrepeso");
	}
	
	@Test public void idosA_Ob1_I() {
	Assert.assertEquals(calc.CalculaImcIdosa(98.4f, 1.75f), "Obesidade grau I");
	}
	
	@Test public void idosA_Ob1_S() {
	Assert.assertEquals(calc.CalculaImcIdosa(113.3f, 1.75f), "Obesidade grau I");
	}
	
	@Test public void idosA_Ob2_I() {
	Assert.assertEquals(calc.CalculaImcIdosa(113.7f, 1.75f), "Obesidade grau II");
	}
	
	@Test public void idosA_Ob2_S() {
	Assert.assertEquals(calc.CalculaImcIdosa(128.3f, 1.75f), "Obesidade grau II");
	}
	
	@Test public void idosA_Ob3_I() {
	Assert.assertEquals(calc.CalculaImcIdosa(128.7f, 1.75f),"Obesidade grau III (obesidade mórbida)");
	}
	
}