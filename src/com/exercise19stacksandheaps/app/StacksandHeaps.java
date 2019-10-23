package com.exercise19stacksandheaps.app;

import java.util.Stack;

public class StacksandHeaps {

	public static void main(String[] args) {
		//String Cad"La casa se quema aqui nadie se salvo a todos se los cargo el payaso"
		//Regresar todas las a en una cadena pero inversas
		//Variable declaration
		String cad = "Crear una pila en Java. Una pilA es una estructura que nos permite apilar elementos y recopilarlos en el orden inverso al cual los apilamos mediante operaciones de desapilar.";
		//La pila es letters entonces en el for each es necesario poner la pila ya con el vector 
		Stack<Character> letters = new Stack<Character>();
		char[] lettersArray = cad.toCharArray();
		for(Character c: lettersArray )
		{
			if(Character.toUpperCase(c)=='A')
			{
				letters.push(c);
			}
		}
		while(!letters.isEmpty())
		{
			System.out.println(letters.pop());
		}
		/*for(Character c: letters)
		{
			System.out.println(letters.pop());*/
		}
	}


