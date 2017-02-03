package domain;

public class MemberBean {
	protected String uid, name,ssn,email,addr,phone,password,profileImg;
    
    public void setName(String name){
    	this.name=name;
    }
    public String getName(){
    	return name;
    }
    public void setSsn(String ssn){
    	this.ssn=ssn;
    }
    public String getSsn(){
    	return ssn;
    }
    public void setPassword(String password){
    	this.password=password;
    }
    public String getPassword(){
    	return password;
    }
    public void setProfileImg(String profileImg){
    	this.profileImg=profileImg;
    }
    public String getProfileImg(){
    	return profileImg;
    }
    
    public String calcGender(String ssn) {
		char ch = this.ssn.charAt(7);
		String gender = "";
		switch (ch) {
		case '1':
		case '3':
			gender = "남자";
			break;
		case '2':
		case '4':
			gender = "여자";
			break;
		case '5':
		case '6':
			gender = "외국인";
			break;
		}
		return gender;
	}
    public void setEmail(String email){
    	this.email=email;
    }
    public String getEmail(){
    	return email;
    }
    public void setAddr(String addr){
    	this.addr=addr;
    }
    public String getAddr(){
    	return addr;
    }
    public void setPhone(String phone){
    	this.phone=phone;
    }
    public String getPhone(){
    	return phone;
    }
    public void setUid(String uid){
    	this.uid=uid;
    }
    public String getUid(){
    	return uid;
    }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format( "%s(%s)[%s|****|%s|%s|%s]"
				,name,ssn,uid,phone,email,profileImg);
	}

   
    
}
