package controller;

import java.util.Scanner;
import javax.swing.*;

import constants.Hospital;
import domain.*;
import service.AdminService;
import serviceImpl.AdminServiceImpl;
public class PatientsController {

	public void start() {
		AdminService service = new AdminServiceImpl();
		Scanner s = new Scanner(System.in);
		MemberBean member =null;
		DoctorBean doc = null;
		NurseBean nur = null;
		PatientBean pat = null;
			while (true) {
			switch (JOptionPane.showInputDialog(Hospital.EXE_OPTION)) {
			case "0":return;  //0 이 상수로 바뀌거나, hopital.1이런식으로 바뀔수도 있다.
			case "1":/* 의사 */
				doc = new DoctorBean();
				String docInfo = JOptionPane.showInputDialog(Hospital.DOC_SPEC);
				String[] docInfoArr = docInfo.split(",");
				doc.setUid(docInfoArr[0]);
				/*doc.setMajorTreat(docInfoArr[1]);*/
				doc.setName(docInfoArr[2]);
				/*doc.setSsn(docInfoArr[3]);
				doc.setPhone(docInfoArr[4]);
				doc.setEmail(docInfoArr[5]);
				doc.setDocPosition(docInfoArr[6]);*/
				JOptionPane.showMessageDialog(null,doc.getUid());
				break;
			case "2":
				nur = new NurseBean();
				String nurInfo =JOptionPane.showInputDialog(Hospital.NUR_SPEC);
				String[] nurInfoArr= nurInfo.split(",");
				nur.setUid(nurInfoArr[0]);
			/*	nur.setMajorJob(nurInfoArr[1]);*/
				nur.setName(nurInfoArr[2]);
			    /*nur.setSsn(nurInfoArr[3]);
			    nur.setEmail(nurInfoArr[4]);
				nur.setPhone(nurInfoArr[5]);
				nur.setNurPosition(nurInfoArr[6]);*/
				JOptionPane.showMessageDialog(null,nur.getUid());
				break;
			case "3": //환자
				pat = new PatientBean();
				doc.setUid((JOptionPane.showInputDialog("아이디")));
				pat.setUid(JOptionPane.showInputDialog("아이디"));
				pat.setName(JOptionPane.showInputDialog("이름"));
				//아이디,이름
				JOptionPane.showMessageDialog(null,pat.getName()+" 님 진료 접수 되었습니다.");
				break;
			case "4": //BMI
				pat = new PatientBean();
				pat.setHeight(JOptionPane.showInputDialog("키"));
				pat.setWeight (JOptionPane.showInputDialog("몸무게"));
				JOptionPane.showMessageDialog(null,service.getBmi(pat));
				//홍길동 정상			
				break;


			}

		}

	}

}
