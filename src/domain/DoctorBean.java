package domain;

public class DoctorBean extends MemberBean {
	private String docPosition, majorTreat,profileImg;// database 의 schema

	public void setDocPosition(String docPosition) {
		this.docPosition = docPosition;
	}

	public String getDocPosition() {
		return docPosition;
	}

	public void setMajorTreat(String majorTreat) {
		this.majorTreat = majorTreat;
	}

	public String getMajorTreat() {
		return majorTreat;
	}
	public void setProfileImg(String profileImg){
		this.profileImg=profileImg;
	}
	
	public String getProfileImg(){
		return profileImg;
	}
	@Override
	public String toString() {
		
		return String.format("의사Id: %s\n" + "담당 진료과목: %s\n" + "성명: %s\n" + "성별: %s\n" + "전화번호: %s\n" + "이메일:%s\n" + "직급:%s\n",
				uid, majorTreat, name,super.calcGender(ssn), phone, email,docPosition);
	}
}
