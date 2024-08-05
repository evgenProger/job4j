package ru.job4j.calculate;

import java.util.ArrayList;
import java.util.List;

/**
 *Class Calculate решение задачи части 001. Урок 1.
 *@author eivanov	
 *since 25.02.2019
*/
public class Calculate {
	/**
	* Метод main, вывод строки в консоль
	* @param args - args
	*/
public static void main(String[] args) {
		System.out.println("Hello World");
		List<Integer> pop = new ArrayList<>();
		pop.add(null);
		pop.add(null);
		System.out.println(pop.get(0));
		System.out.println(pop.get(1));
	}

	
/**
* Method echo
* @parm name evgen
* @return Echo plus evgen
*/
public String echo(String name) {
	return "Echo, echo, echo : " + name;
}
}