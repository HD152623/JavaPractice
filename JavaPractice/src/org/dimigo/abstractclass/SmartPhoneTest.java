/**
 * 
 */
package org.dimigo.abstractclass;

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
		SmartPhone[] pp = {
				new IPhone("iPhone 7","애플",900000),
				new Galaxy("갤럭시 S8","삼성",800000)
		};
		
		for(SmartPhone p : pp){
			System.out.println(p.toString());
			p.turnOn();
			p.pay();
			p.useSpecialFunction();
			p.turnOff();
			System.out.println();
		}
		
	}

}
