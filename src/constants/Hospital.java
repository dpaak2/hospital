package constants;

public class Hospital {
	public final static String HOSPITAL_NAME="한빛병원";
	public final static String EXE_OPTION = "0.EXIT" + "1.REG-DOCTOR\n" + "2.REG-NURSE\n" + "3.REG-PATIENT\n"
			+ "4.CHECK BMI\n";

	public final static String DOC_SPEC = "의사ID,담당 진료과목,성명,주민번호,전화번호,이메일,직급";
	public final static String NUR_SPEC = "간호사ID,담당 진료과목,성명,주민번호,전화번호,이메일,직급";
	public final static String PAT_SPEC = "환자ID,간호사ID,의사ID,환자 성명,주민번호,전화번호,주소,이메일,직업";
	public final static String BMI_SPEC = "";
	String ssn;
	public final static String ADMIN_MENU="0.종료 1.의사등록 11.간호사등록";
}
