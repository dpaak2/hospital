package controller;
import javax.swing.JOptionPane;

import constants.Hospital;
import domain.DoctorBean;
import domain.MemberBean;
import domain.NurseBean;
import domain.PatientBean;
import enums.AdminButt;
import service.AdminService;
import serviceImpl.AdminServiceImpl;
public class AdminController {
	
	public void start(){
		AdminService service = new AdminServiceImpl();
        DoctorBean doc =null;
        NurseBean nur=null;
        PatientBean pat=null;
                
        AdminButt[] buttons={AdminButt.EXIT,
        		AdminButt.DOC_ADD,AdminButt.DOC_FIND_BY_ID,AdminButt.DOC_FIND_BY_NAME,
        		AdminButt.DOC_LIST,AdminButt.DOC_UPDATE,AdminButt.DOC_DELETE,
        		AdminButt.NUR_ADD,AdminButt.NUR_FIND_BY_ID,AdminButt.NUR_FIND_BY_NAME,
        		AdminButt.NUR_LIST,AdminButt.NUR_UPDATE,AdminButt.NUR_DELETE};
				
		while(true){
			AdminButt select=(AdminButt)JOptionPane.showInputDialog(
					null,//frame
					"ADMIN PAGE",
					"SELCET ADMIN MENU",
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons,
					buttons[1]
					);
			switch(select){  //class variable
			case EXIT: return;
			case DOC_ADD: 
				//의사 등록
				doc =new DoctorBean();
				String[] docArr=JOptionPane.showInputDialog("ID,NAME").split(",");
				doc.setUid(docArr[0]);
				doc.setName(docArr[1]);
				service.regist(doc);
				JOptionPane.showMessageDialog(null,service.count(doc)+"명 등록되었습니다.");
				break;
			case DOC_FIND_BY_ID:break;
			case DOC_FIND_BY_NAME:break;
			case DOC_LIST:break;
			case DOC_UPDATE:break;
			case DOC_DELETE:break;
			case NUR_ADD:break;
			case NUR_FIND_BY_ID:break;
			case NUR_FIND_BY_NAME:break;
			case NUR_LIST:break;
			case NUR_UPDATE:break;
			case NUR_DELETE:break;
			}
		}
	}
}
