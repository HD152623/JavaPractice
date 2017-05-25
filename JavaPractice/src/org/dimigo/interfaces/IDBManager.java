/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_IDBManager
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author		: USER
 * @version		: 1.0
 */
public interface IDBManager {
	
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	
	
	public static IDBManager getDBObject(String database){
		IDBManager m = null;
		if(ORACLE_DATABASE.equals(database)) {
			m = new OracleDB();
		}
		else if(SYBASE_DATABASE.equals(database)) {
			m =  new SybaseDB();
		}
		return m;
	}
	
}
