package eq;



public class Member {
	String id = "user1";
	int regNum = 123;
	@Override
	public boolean equals(Object obj) {
		return this.regNum == ((Student)obj).regNum;
	}
}
