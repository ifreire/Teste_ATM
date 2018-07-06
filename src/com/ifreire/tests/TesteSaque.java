package com.ifreire.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.ifreire.entity.ATM;

public class TesteSaque
{
	@Test
	public void testar_quantidade_de_notas_serao_sacadas()
	{
		ATM atm = new ATM();
		
		assertEquals("2 nota(s) de 100", atm.sacar(200));
		assertEquals("1 nota(s) de 100, 1 nota(s) de 50", atm.sacar(150));
	}
}