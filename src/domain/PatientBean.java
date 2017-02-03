package domain;

public class PatientBean extends MemberBean{
	private String patJob, height, weight;
	
	
	public void setHeight(String height){
		this.height=height;
	}
	public String getHeight(){
		return height;
	}
	public void setWeight(String weight){
		this.weight=weight;
	}
	public String getWeight(){
		return weight;
	}
	public void setPatJob(String patJob) {
		this.patJob = patJob;
	}
	public String getPatJob(){
		return patJob;}
	
}

/*	@Override 
	public String toString() {
		return String.format(
				"환자Id: %s\n"
				+ "간호사Id: %s\n"
				+ "의사Id: %s\n"
				+ "환자 성명: %s\n"
				+ "주민번호 %s\n"
				+ "전화번호: %s\n"
				+ "주소:%s\n"
				+ "이메일: %s\n"
				+ "직업:%s\n"
				,uid
				,uid
				,uid
				,name
				,super.calcGender(ssn)
				,phone
				,addr
				,email
				,patJob							
				);
	}
	}*/

