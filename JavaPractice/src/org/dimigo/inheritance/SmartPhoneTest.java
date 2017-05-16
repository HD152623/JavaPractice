/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 * 
 * @author		: USER
 * @version		: 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		IPhone i = new IPhone("iPhone 7","애플",900000);
		Galaxy g = new Galaxy("갤럭시 S8","삼성",800000);
		
		System.out.println(i.toString());
		i.turnOn();
		i.pay();
		i.useSpecialFunction(i);
		i.turnOff();
		
		System.out.println();
		
		System.out.println(g.toString());
		g.turnOn();
		g.pay();
		g.useSpecialFunction(g);
		g.turnOff();
		
		
	}

}
