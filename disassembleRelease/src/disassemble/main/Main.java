package disassemble.main;

import java.util.Scanner;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.RegisterRequest;
import disassemble.Service.ChangePasswordService;
import disassemble.Service.MemberAllService;
import disassemble.Service.MemberDeleteService;
import disassemble.Service.MemberRegisterService;

public class Main {
	private static MemberDAO memberDao = new MemberDAO();
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("명령어를 입력하세요");
			System.out.print("> ");
			String command = sc.nextLine();
			if(command.equalsIgnoreCase("exit")){
				System.out.println("종료합니다.");
				break;
			}
			if(command.startsWith("new")){
				processNewCommand(command.split(" "));
				continue;
			} else if(command.startsWith("change")){
				processChangeCommand(command.split(" "));
				continue;
			} else if(command.startsWith("all")) {
				processAllCommand();
				continue;
			} else if(command.startsWith("delete")) {
				processDeleteCommand(command.split(" "));
				continue;
			}
			printHelp();
		}
	}
	private static void processNewCommand(String[] arg) {
		   if (arg.length != 5) {
	            printHelp();
	            return;
	        }
	        MemberRegisterService regSvc = new MemberRegisterService(memberDao);
	        RegisterRequest req = new RegisterRequest();
	        req.setEmail(arg[1]);
	        req.setName(arg[2]);
	        req.setPassword(arg[3]);
	        req.setConfirmPassword(arg[4]);
	        regSvc.resgist(req);
		// MemberRegisterService 객체 생성
		// RegisterRequest 객체 생성 
		// 데이터는 RegisterRequest 객체에 입력
		// regSvc.regist() 호출
	}
	
	private static void processAllCommand() {
		MemberAllService allSvc = new MemberAllService(memberDao);
		allSvc.selectAll();
		
		// MemberAllService 객체 생성
		// allSvc.selectAll() 호출
	}

	private static void processChangeCommand(String[] arg) {
		 if (arg.length != 4) {
	            printHelp();
	            return;
		 }
	     ChangePasswordService pwdSvc = new ChangePasswordService(memberDao);
	     pwdSvc.changePassword(arg[1], arg[2], arg[3]);
		// ChangePasswordService 객체 생성
		// change.changePassword() 호출
	}
	private static void processDeleteCommand(String[] arg) {
		if(arg.length != 4) {
			printHelp();
			return ;
		}
		MemberDeleteService delete = new MemberDeleteService(memberDao);
		delete.checkPassword(arg[1], arg[2], arg[3]);
		// MemberDeleteService 객체 생성
		// delete.checkPassword() 호출
	}
	private static void printHelp(){
		System.out.println();
		System.out.println("명령어 사용법을 확인하세요.");
		System.out.println("usage : ");
		System.out.println("모든 정보 출력 : all");
		System.out.println("정보 등록 : new [이메일] [이름] [암호] [암호확인]");
		System.out.println("비밀번호 수정 : change [이메일] [현재비밀번호] [변경할비밀번호]");
		System.out.println("정보 삭제 : delete [이메일] [암호] [암호확인]");
		System.out.println("종료 : exit");
		System.out.println();
	}
}
