package service;

import domain.MemberBean;
import domain.DoctorBean;
import domain.NurseBean;
import domain.PatientBean;

public interface AdminService {
	public abstract String getBmi(PatientBean pat);
	//create
		 public void regist(MemberBean member);
		 //read
		 public MemberBean[]/*객체를 여러개 받는 방법*/ findByName(MemberBean member);
		 public MemberBean findById(MemberBean member);
		
		 public DoctorBean[] doctorlist(MemberBean member);
		 public NurseBean[] nurselist(MemberBean member);
		 
		 public int count(MemberBean member);
		 //update
		 public void change(MemberBean member);
		 //delete
		 public void remove(MemberBean member);
		 //util
		 //validation
		 public boolean exist(MemberBean member);
		 public int countByName(MemberBean member);
}
