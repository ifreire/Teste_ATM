package com.ifreire.entity;

import java.util.Collections;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class ATM
{
	private String resultado;
	
	public String sacar(double value)
	{
		resultado = "";
		
		Dictionary<Integer, Integer> cedulasSaque = new Hashtable<Integer, Integer>();
		
		cedulasSaque.put(100, 0);
		cedulasSaque.put(50, 0);
		cedulasSaque.put(20, 0);
		cedulasSaque.put(10, 0);
		cedulasSaque.put(5, 0);
		cedulasSaque.put(2, 0);
		cedulasSaque.put(1, 0);
		
		while(value > 0)
		{
			if (value >= 100)
			{
				value -= 100;
				cedulasSaque.put(100, cedulasSaque.get(100) + 1);
			}
			else if (value >= 50)
			{
				value -= 50;
				cedulasSaque.put(50, cedulasSaque.get(50) + 1);
			}
			else if (value >= 20)
			{
				value -= 20;
				cedulasSaque.put(20, cedulasSaque.get(20) + 1);
			}
			else if (value >= 10)
			{
				value -= 10;
				cedulasSaque.put(10, cedulasSaque.get(10) + 1);
			}
			else if (value >= 5)
			{
				value -= 5;
				cedulasSaque.put(5, cedulasSaque.get(5) + 1);
			}
			else if (value >= 2)
			{
				value -= 2;
				cedulasSaque.put(2, cedulasSaque.get(2) + 1);
			}
			else if (value >= 1)
			{
				value -= 1;
				cedulasSaque.put(1, cedulasSaque.get(1) + 1);
			}
		}
		
		Enumeration<Integer> setKeys = cedulasSaque.keys();
        List<Integer> list = Collections.list(setKeys);
        Collections.sort(list);
        
        
        list.forEach(
    		x ->
    		resultado += cedulasSaque.get(x) > 0 ? cedulasSaque.get(x).toString() + " nota(s) de " + x.toString() + ", " : ""
        );
        
        resultado = resultado.substring(0, resultado.length() - 2); 
		System.out.println(resultado);
		return resultado;
	}
}