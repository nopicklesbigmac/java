package sceneBuilderEvent6.reg;

import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import sceneBuilderEvent6.common.CommonService;
import sceneBuilderEvent6.login.LoginDTO;

public class RegService {

	public void regProc(Parent regForm) {
		TextField idField = (TextField)regForm.lookup("#id");
		TextField nameField = (TextField)regForm.lookup("#name");
		PasswordField pwField = (PasswordField)regForm.lookup("#pw");
		PasswordField confirmField = (PasswordField)regForm.lookup("#confirm");
		
		String id = idField.getText();
		String name = nameField.getText();
		String pw = pwField.getText();
		String confirm = confirmField.getText();
		
		RadioButton manRadio = (RadioButton)regForm.lookup("#manRadio");
		RadioButton womanRadio = (RadioButton)regForm.lookup("#womanRadio");
		
		String gender = "";
		if(manRadio.isSelected())
			gender += "남";
		else if(womanRadio.isSelected())
			gender += "여";
		
		ComboBox<String> combo = (ComboBox<String>)regForm.lookup("#ageCombo");
		String age = combo.getValue();
	
		CheckBox musicCheck = (CheckBox)regForm.lookup("#musicCheck");
		CheckBox sportCheck = (CheckBox)regForm.lookup("#sportCheck");
		CheckBox movieCheck = (CheckBox)regForm.lookup("#movieCheck");
		
		String hobbys = "";
		if(musicCheck.isSelected()) {
			hobbys += "음악 ";
		}
		if(sportCheck.isSelected()) {
			hobbys += "스포츠 ";
		}
		if(movieCheck.isSelected()) {
			hobbys += "영화";
		}
		
//		System.out.println("이름 : " + name);
//		System.out.println("아이디 : " + id);
//		System.out.println("비밀번호 : " + pw);
//		System.out.println("비밀번호 확인 : " + confirm);
//		System.out.println("성별 : " + gender);
//		System.out.println("연령대 : " + age);
//		System.out.println("취미 : " + hobbys);
		
		if (id.isEmpty() ||pw.isEmpty()||name.isEmpty()) {
			CommonService.msg("필수정보입니다.");
		}
		if(pw.equals(confirm)) {
			RegDAO regDao = new RegDAO();
			LoginDTO login = regDao.selectId(id);
			if(login == null) {
				RegDTO regDto = new RegDTO();
				regDto.setName(name);
				regDto.setId(id);
				regDto.setPw(pw);
				regDto.setGender(gender);
				regDto.setAge(age);
				regDto.setHobbys(hobbys);
				
				regDao.insert(regDto);
				
				CommonService.msg(id + ", 계정 등록완료");
				CommonService.windowClose(regForm);
			}else {
				CommonService.msg(id + ", 등록된계정");
			}
		}else {
			CommonService.msg("두패스워드 붏일치");
		}
	
	}
}






