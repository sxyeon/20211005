package co.soyeon.prj;

import java.sql.Date;

public class SqlDateTest {
	private Date date; // java.sql.Date 객체는 년-월-일만 처리한다.
	
	void sqlDate() {
		date = Date.valueOf("2021-10-05");
		System.out.println(date);
	}

}
