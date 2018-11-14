package customer_management;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;

class Admin {
	Admin() {
		loadFile();
	}

	boolean modcheck = false;
	GregorianCalendar today = null;
	String filename = "member.txt";
	String logfile = "log.txt";
	ArrayList<Customer> customer = new ArrayList<>();
	FileOutputStream fo = null;
	FileReader fi = null;
	BufferedReader br = null;
	int ampm, year, month, date, hour, minute, second;
	Scanner in = new Scanner(System.in);
	String oldcontents, newcontents, selectnameID;

	void Customer_add() {
		System.out.println("회원 등록입니다.");
		System.out.println("회원의 ID를 입력해주세요.");
		String input_id = in.nextLine();
		for (int i = 0; i < customer.size(); i++) {
			if (input_id.equals(customer.get(i).getID())) {
				System.out.println("중복된 아이디 입니다.");
				Customer_add();
			}
		}
		System.out.println("회원의 이름을 입력해주세요.");
		String input_name = in.nextLine();
		Customer input_customer = new Customer();
		input_customer.setID(input_id);
		input_customer.setName(input_name);

		customer.add(input_customer);
		System.out.println(input_name + " 회원님 가입을 환영합니다!");
	}

	void Customer_del() {

		System.out.println("회원 삭제입니다.");
		System.out.println("삭제할 회원의 ID를 입력해주세요.");
		String del_id = in.nextLine();

		for (int i = 0; i < customer.size(); i++) {
			if (del_id.equals(customer.get(i).getID())) {
				System.out.println("입력하신 아이디는 " + customer.get(i).getID() + "입니다.");
				System.out.println("데이터를 보다 정확히 확인하기 위해 이름을 체크합니다.");
				System.out.println("이름을 입력해주세요.");
				String del_name = in.nextLine();
				if (del_name.equals(customer.get(i).getName())) {
					System.out.println(customer.get(i) + "가 삭제됩니다.");
					customer.remove(i);
				} else {
					System.out.println("이름을 다시 한번 확인해주세요.");
					i--;
				}
			}
		}
	}

	void Customer_mod() {
		modcheck = false;
		System.out.println("회원 수정입니다.");
		System.out.println("수정할 회원의 ID를 입력해주세요.");
		String mod_id = in.nextLine();

		try {
		for (int i = 0; i < customer.size(); i++) {

				if (mod_id.equals(customer.get(i).getID())) {
					System.out.println("입력하신 아이디는 " + customer.get(i).getID() + "입니다.");
					System.out.println("데이터를 보다 정확히 확인하기 위해 이름을 체크합니다.");
					System.out.println("이름을 입력해주세요.");
					String mod_name = in.nextLine();
					if (mod_name.equals(customer.get(i).getName())) {
						System.out.println("어떤 것을 수정하시겠습니까?");
						System.out.println("1.ID / 2.이름");
						int select = in.nextInt();
						in.nextLine();
						if (select == 1) {
							System.out.println("아이디를 수정합니다.");
							System.out.println("새로운 ID를 입력해주세요.");
							newcontents = in.nextLine();
							oldcontents = customer.get(i).getID();
							System.out.println("기존의 ID " + customer.get(i).getID() + "가 " + newcontents + "로 수정됩니다!");
							customer.get(i).setID(newcontents);
							selectnameID = "ID";
							today = new GregorianCalendar();
							modcheck = true;
						} else if (select == 2) {
							System.out.println("이름을 수정합니다.");
							System.out.println("새로운 이름을 입력해주세요.");
							newcontents = in.nextLine();
							oldcontents = customer.get(i).getName();
							System.out.println("기존의 이름 " + customer.get(i).getName() + "가 " + newcontents + "로 수정됩니다!");
							customer.get(i).setName(newcontents);
							selectnameID = "이름";
							today = new GregorianCalendar();
							modcheck = true;
						} else {
							System.out.println("1,2중에서만 입력해주세요!");
							i--;
						}
					}
				}
			}

		ampm = (today.get(today.AM_PM));
		year = (today.get(today.YEAR) - 2000);
		month = (today.get(today.MONTH) + 1);
		date = (today.get(today.DATE));
		hour = (today.get(today.HOUR_OF_DAY));
		minute = (today.get(today.MINUTE));
		second = (today.get(today.SECOND));
		} catch (Exception e) {
			System.out.println("아이디/이름을 확인해주세요.");
		}
		try {
			fo = new FileOutputStream(logfile, true);
			String input_contents = year + "년 " + month + "월 " + date + "일 " + hour + "시 " + minute + "분 " + second
					+ "초  " + selectnameID + " " + oldcontents + "가 " + newcontents + "로 수정시도가 있었음";
			input_contents += "\r\n";
			fo.write(input_contents.getBytes());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void CustomerList() {
		for (int i = 0; i < customer.size(); i++) {
			System.out.println(customer.get(i));
		}
	}

	void savetoFile() {
		try {
			fo = new FileOutputStream(filename);
			for (int i = 0; i < customer.size(); i++) {
				String customer_info = customer.get(i).toString();
				customer_info += "\r\n";
				fo.write(customer_info.getBytes());
			}
			fo = new FileOutputStream(logfile, true);
			if (modcheck == true) {
				fo.write("---수정 반영됨---\r\n".getBytes());
			} else {
				return;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void loadFile() {
		try {
			fi = new FileReader(filename);
			br = new BufferedReader(fi);
			String capture;
			while ((capture = br.readLine()) != null) {
				StringTokenizer tk = new StringTokenizer(capture, "/");
				Customer load = new Customer();
				load.setID(tk.nextToken());
				load.setName(tk.nextToken());
				customer.add(load);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
