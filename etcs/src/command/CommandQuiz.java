package command;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class CommandQuiz {
	private HashMap<String, String>map;
	Scanner sc = new Scanner(System.in);
	String cn, command;
	
	public void start() throws IOException {
		while(true) {
			System.out.println("1. 명령어 등록");
			System.out.println("2. 명령어 해제");
			System.out.println("3. 명령어 실행");
			System.out.println("4. 프로그램 종료");
			System.out.print(">>");
			cn =sc.next();
			switch (cn) {
			case "1":
				commandRegist();
				break;
			case "2":
				commandRelase();
				break;
			case "3":
				commandeExcute();
				break;
			case "4":
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	private void commandRegist() {
		String []arg;
		map = new HashMap<String, String>();
		System.out.print("명령어 입력 :");
		arg =sc.next().split(":");
		arg[0] = arg[0].trim();
		arg[1] = arg[1].trim();
		map.put(arg[0],arg[1]);
	}
	private void commandRelase() {
		System.out.print("명령어 이름 :");
		cn =sc.next();
		if(map.containsKey(cn)) {
			map.remove(cn);
		}else {
			System.out.println("없는 명령어입니다.");
		}

	}
	private void commandeExcute() throws IOException{
		System.out.println("명령어 : ");
		cn =sc.next();
		if(map.containsKey(cn)) {
			ProcessBuilder pb = new ProcessBuilder(map.get(cn));
			pb.start();
		}else {
			System.out.println("없는 명령어입니다.");
		}
	}
}
