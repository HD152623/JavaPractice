/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_SnackTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 * 
 * @author		: USER
 * @version		: 1.0
 */
public class SnackTest {

	public static void main(String[] args) {
		Snack[] snack = new Snack[3];
		snack[0]= new Snack("새우깡","농심",1100,2);
		snack[1]= new Snack("콘칲","크라운",1200,1);
		snack[2]= new Snack("허니버터칩","해태",1500,4);
		System.out.println(snack[0].toString());	
		System.out.println(snack[1].toString());	
		System.out.println(snack[2].toString());	
		System.out.println();
		System.out.println("총 구매 금액 : "+String.format("%,d", (snack[0].calcPrice()+snack[1].calcPrice()+snack[2].calcPrice()))+"원");
	}
}
