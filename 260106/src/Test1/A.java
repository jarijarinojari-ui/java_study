package Test1;

class A extends Object{
	
	public boolean equals(MemberID m) {
		return (StudentsID.regnum == m);
		
	}
	
	static void main(String[] args) {
		A a = new A();
		
		MemberID m = new MemberID();
		StudentsID s = new StudentsID();
		m.regnum = 10;
		s.regnum = 10;
		
		
		boolean b = a.equals();
		
			
	
		
	}
}


