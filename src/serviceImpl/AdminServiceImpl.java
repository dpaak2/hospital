package serviceImpl;

import java.util.Scanner;
import javax.swing.*;
import domain.MemberBean;
import domain.DoctorBean;
import domain.NurseBean;
import domain.PatientBean;
import service.AdminService;

public class AdminServiceImpl implements AdminService {
	private DoctorBean[] doctorlist; //의사정보들 배열로 만든다
	private NurseBean[] nurselist; // 간호사 정보들 배열로 만듬 
	//private int []countArr; // number of members
	private int count=0;
	private int docCount;
	private int nurCount;
	
	public AdminServiceImpl(){
		/*countArr= new int[2]; // 의사 와 간호사만 선택 할수 있기 때문에 이 배열의 크기를 2로 정해준다.
		countArr[0]=countArr[1]=0;*/ //의사, 간호사 의 수  초기화 
		docCount=0;
		nurCount=0;
		doctorlist= new DoctorBean[docCount]; //의사의 정보는 닥터빈에 저장된 의사들 이다.
		nurselist= new NurseBean[nurCount]; //간호사의 정보는 널스빈에 저장된 간호사들 이다.
	}
	
	
	@Override
	public String getBmi(PatientBean pat) {

		String result = "";
		double bmi = 0;
		double height = 0, weight = 0;
		height = Double.parseDouble(pat.getHeight()) / 100;
		weight = Double.parseDouble(pat.getWeight());
		bmi = weight / (height * height);

		if (bmi > 30.0) {
			result = "고도비만";
		} else if (bmi > 25.0) {
			result = "비만";
		} else if (bmi > 23.0) {
			result = "과체중";
		} else if (bmi > 18.5) {
			result = "정상";
		} else {
			result = "저체중";
		}
		return result;
	}

	@Override
	public void regist (MemberBean member) {
		if(member instanceof DoctorBean){
			DoctorBean doctor = (DoctorBean) member;
			if(docCount==doctorlist.length){
				DoctorBean[]temp= new DoctorBean[docCount+10];
				System.arraycopy(doctorlist, 0, temp, 0, docCount);
				/*for(int i=0;i<countArr[0];i++){ //countArr[0]=doctor info 가 들어가는 방의길이 
					temp[i]=doctorlist[i];
				}*/
				doctorlist=temp;
			}
			doctorlist[docCount]=doctor;
			docCount++;
			}else if(member instanceof NurseBean){
				NurseBean nurse= (NurseBean) member;
				if(nurCount==nurselist.length){
					NurseBean[]temp= new NurseBean[nurCount+10];
					System.arraycopy(nurselist, 0, temp, 0,nurCount);
					nurselist=temp;
				}
				 nurselist[nurCount++]= nurse;
			}
		}


	@Override
	public MemberBean[] findByName(MemberBean member) {
		MemberBean[] list=new MemberBean[countByName(member)];
		if(member instanceof DoctorBean){
			if(docCount==doctorlist.length){
				for(int i=0;i<docCount;i++){
					if(member.getName().equals(doctorlist[i].getName())){
						list[i]=doctorlist[i];
					}
				}
			}
		}else if(member instanceof NurseBean){
			if(nurCount==doctorlist.length){
				for(int i=0;i<nurCount;i++){ //nurselist= 배열길이, countArr[1] =진짜회원수 [nurCount ]
				/* if(){}*/
				}
			}
		}
		return list;
	}

	@Override
	public MemberBean findById(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoctorBean[] doctorlist(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NurseBean[] nurselist(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(MemberBean member) {
		return count;
	}

	@Override
	public void change(MemberBean member) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(MemberBean member) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exist(MemberBean member) {
		boolean check=false;
		if(docCount==doctorlist.length){
			DoctorBean[] temp=new DoctorBean[docCount+10];
			doctorlist=temp;
			for(int i=0;i<docCount;i++){
				if(member.getUid().equals(doctorlist[i].getUid())){
					check=true;
					break;
				}
			}
		}else if(nurCount==nurselist.length){
			NurseBean[]temp=new NurseBean[nurCount+10];
			nurselist=temp;
			for(int i=0;i<nurCount;i++){
				if(member.getUid().equals(nurselist[i].getUid())){
					check=true;
					break;
				}
			}
			
		}
		return false;
	}

	@Override
	public int countByName(MemberBean member) {
		// TODO Auto-generated method stub
		return 0;
	}


	

}
