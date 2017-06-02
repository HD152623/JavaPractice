/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_Movie
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 * 
 * @author		: USER
 * @version		: 1.0
 */
public class Movie {

	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge){
		super();
		this.title = title;
		this.limitAge = limitAge;
	}

	public String getTitle() {
		return title;
	}

	public int getLimitAge() {
		return limitAge;
	}

	public void buyTicket(int age) throws Exception{
		if(age < limitAge){
			throw new Exception(String.format("%s은/는 %d세 이상 관람가입니다.",title,limitAge));
		}
		System.out.println(String.format("%s 즐감하세요.",title));	
	}
}
