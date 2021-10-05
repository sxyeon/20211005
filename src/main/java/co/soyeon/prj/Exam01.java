package co.soyeon.prj;

public class Exam01 {
	private String str = "20001004"; // yyyymmdd
	private String nstr = "1234";
	private String mstr = "3456";
	private String cstr = " akcdfg.jsp.old";
	
	void stringTest() {
		System.out.println(str.toString());
		System.out.println(nstr.toString());
		System.out.println(nstr+mstr);
		
		int n = Integer.valueOf(nstr); // 객체화시키는 것(클래스로 만듦)
		int m = Integer.valueOf(mstr);
		System.out.println(n+m);
		
//		if(nstr.equals(cstr)) System.out.println(cstr); // nstr과 cstr이 동일하면 cstr을 출력해라
//		if(str.equals(cstr)) System.out.println(cstr);
		    // str == cstr 이렇게 써도 똑같음
		
		String mm = str.substring(4, 6); // 4번째부터 6 전까지
		String dd = str.substring(6); // 6번째부터 끝까지
		System.out.println("귀하의 생일은 " + mm + "월" + dd + "일입니다.");

		System.out.println(cstr.substring(0, 7));
		
		int l = cstr.indexOf(".");
		System.out.println(cstr.substring(0, 1));
		System.out.println(cstr.replace("k", "B"));
		System.out.println(cstr.concat("xyz")); // 기존 문자에 xyz를 더해줌
		System.out.println(cstr.toUpperCase());
		System.out.println(cstr.getBytes());
		System.out.println(cstr.trim()); // 좌우 공백만 제거
		
		char c = 'a';
		String cs = cs.valueOf(c); // char type을 String type 으로
		String s = "a";
		if(s == cs) System.out.println(c);
	}

}
