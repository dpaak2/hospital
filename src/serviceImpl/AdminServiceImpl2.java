package serviceImpl;

import java.util.Scanner;
import javax.swing.*;
import domain.MemberBean;
import domain.DoctorBean;
import domain.NurseBean;
import domain.PatientBean;
import service.AdminService;

public class AdminServiceImpl2 implements AdminService {
	
	
	private DoctorBean[] doctorlist;
	private NurseBean[] nurselist;
	private int[] countArr; //0=doclist ,1=nurlist

	public AdminServiceImpl2() {
		countArr =new int[2]; //의사와 간호사만 선택하니깐 이 배열의 크기는 2이다 
		/*countArr[0]= countArr[1]=0;*/
		doctorlist = new DoctorBean[countArr[0]];
		nurselist = new NurseBean[countArr[1]];
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

		if (member instanceof DoctorBean) {
			DoctorBean doctor = (DoctorBean) member; // member 에 type을 Doctors의
														// 타입으로 변환.
			if (countArr[0] == doctorlist.length) {
				DoctorBean[] temp = new DoctorBean[countArr[0]+10];
				System.arraycopy(doctorlist, 0, temp, 0, countArr[0]);//닥터에 있는 배열의0번째부터, 카운트 어레이 갯수만큼 템프에 0번째 인덱스에 넣겠다.
				doctorlist= temp;
			}
			doctorlist[countArr[0]++]= doctor;
		} else if (member instanceof NurseBean) { // 닥터랑 널스랑 구분할 무언가가 필요해 보임.
			NurseBean nurse = (NurseBean) member;
			if (countArr[1] == nurselist.length) {
				NurseBean[] temp = new NurseBean[countArr[1]+10];
				System.arraycopy(nurselist, 0, temp, 0, countArr[1]);
				nurselist = temp;
			}
			nurselist[countArr[1]++] = nurse;
		}
	}

	@Override
	public MemberBean[] findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean findById(String id) {
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
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void change(MemberBean member) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exist (MemberBean member) { //boolean type은 무조건 branch를 준다
		boolean check=false;
		if(countArr[0]==doctorlist.length){
			DoctorBean[] temp = new DoctorBean[countArr[0]+10];
			System.arraycopy(doctorlist, 0, temp, 0, countArr[0]);
			doctorlist= temp;
			for(int i=0;i<countArr[0];i++){
				if(member.getUid().equals(doctorlist[i].getUid())){
					check=true;
					break;
				}
			}
			return false;
		}else{
			if(countArr[1]==nurselist.length){
				NurseBean[]temp= new NurseBean[countArr[1]];
				System.arraycopy(nurselist, 0, temp, 0, countArr[1]);
				nurselist=temp; //nurselist 원래값(간호사 정보)을 유지하면서  크기를 늘려주기위해서, 위에서 0으로 정해줬던 크기임
				for(int i=0;i<countArr[1];i++){
					if(member.getUid().equals(nurselist[i].getUid())){
						check=true;
						break;
					}
				}
			}
		}
		return check;
	}


	@Override
	public int countByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}


	

}
