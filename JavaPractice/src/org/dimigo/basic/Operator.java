/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Operator
 *
 * 1. 개요 :	디미베네
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 * 
 * @author		: USER
 * @version		: 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long money = 1700000L;
		int clark = 3;
		int shop = 1500;
		long aaa= money * 12L * clark * shop;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "+String.format("%,d", money)+"원");
		System.out.println("점포 내 직원 수 : "+String.format("%,d", clark)+"명");
		System.out.println("점포 수 : "+String.format("%,d", shop) +"개");
		System.out.println();
		System.out.println("연간 인건비 : "+String.format("%,d", aaa) +"원");
		

	}

}
