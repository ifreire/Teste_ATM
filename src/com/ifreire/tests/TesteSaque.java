package com.ifreire.tests;

import org.junit.Test;
import com.ifreire.entity.ATM;
import junit.framework.Assert;

public class TesteSaque
{
	@Test
	public void testar_quantidade_de_notas_serao_sacadas()
	{
		ATM atm = new ATM();
		
		Assert.assertEquals("2 nota(s) de 100", atm.sacar(200));
		Assert.assertEquals("1 nota(s) de 50, 1 nota(s) de 100", atm.sacar(150));
	}
}