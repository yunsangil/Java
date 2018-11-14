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
		System.out.println("ȸ�� ����Դϴ�.");
		System.out.println("ȸ���� ID�� �Է����ּ���.");
		String input_id = in.nextLine();
		for (int i = 0; i < customer.size(); i++) {
			if (input_id.equals(customer.get(i).getID())) {
				System.out.println("�ߺ��� ���̵� �Դϴ�.");
				Customer_add();
			}
		}
		System.out.println("ȸ���� �̸��� �Է����ּ���.");
		String input_name = in.nextLine();
		Customer input_customer = new Customer();
		input_customer.setID(input_id);
		input_customer.setName(input_name);

		customer.add(input_customer);
		System.out.println(input_name + " ȸ���� ������ ȯ���մϴ�!");
	}

	void Customer_del() {

		System.out.println("ȸ�� �����Դϴ�.");
		System.out.println("������ ȸ���� ID�� �Է����ּ���.");
		String del_id = in.nextLine();

		for (int i = 0; i < customer.size(); i++) {
			if (del_id.equals(customer.get(i).getID())) {
				System.out.println("�Է��Ͻ� ���̵�� " + customer.get(i).getID() + "�Դϴ�.");
				System.out.println("�����͸� ���� ��Ȯ�� Ȯ���ϱ� ���� �̸��� üũ�մϴ�.");
				System.out.println("�̸��� �Է����ּ���.");
				String del_name = in.nextLine();
				if (del_name.equals(customer.get(i).getName())) {
					System.out.println(customer.get(i) + "�� �����˴ϴ�.");
					customer.remove(i);
				} else {
					System.out.println("�̸��� �ٽ� �ѹ� Ȯ�����ּ���.");
					i--;
				}
			}
		}
	}

	void Customer_mod() {
		modcheck = false;
		System.out.println("ȸ�� �����Դϴ�.");
		System.out.println("������ ȸ���� ID�� �Է����ּ���.");
		String mod_id = in.nextLine();

		try {
		for (int i = 0; i < customer.size(); i++) {

				if (mod_id.equals(customer.get(i).getID())) {
					System.out.println("�Է��Ͻ� ���̵�� " + customer.get(i).getID() + "�Դϴ�.");
					System.out.println("�����͸� ���� ��Ȯ�� Ȯ���ϱ� ���� �̸��� üũ�մϴ�.");
					System.out.println("�̸��� �Է����ּ���.");
					String mod_name = in.nextLine();
					if (mod_name.equals(customer.get(i).getName())) {
						System.out.println("� ���� �����Ͻðڽ��ϱ�?");
						System.out.println("1.ID / 2.�̸�");
						int select = in.nextInt();
						in.nextLine();
						if (select == 1) {
							System.out.println("���̵� �����մϴ�.");
							System.out.println("���ο� ID�� �Է����ּ���.");
							newcontents = in.nextLine();
							oldcontents = customer.get(i).getID();
							System.out.println("������ ID " + customer.get(i).getID() + "�� " + newcontents + "�� �����˴ϴ�!");
							customer.get(i).setID(newcontents);
							selectnameID = "ID";
							today = new GregorianCalendar();
							modcheck = true;
						} else if (select == 2) {
							System.out.println("�̸��� �����մϴ�.");
							System.out.println("���ο� �̸��� �Է����ּ���.");
							newcontents = in.nextLine();
							oldcontents = customer.get(i).getName();
							System.out.println("������ �̸� " + customer.get(i).getName() + "�� " + newcontents + "�� �����˴ϴ�!");
							customer.get(i).setName(newcontents);
							selectnameID = "�̸�";
							today = new GregorianCalendar();
							modcheck = true;
						} else {
							System.out.println("1,2�߿����� �Է����ּ���!");
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
			System.out.println("���̵�/�̸��� Ȯ�����ּ���.");
		}
		try {
			fo = new FileOutputStream(logfile, true);
			String input_contents = year + "�� " + month + "�� " + date + "�� " + hour + "�� " + minute + "�� " + second
					+ "��  " + selectnameID + " " + oldcontents + "�� " + newcontents + "�� �����õ��� �־���";
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
				fo.write("---���� �ݿ���---\r\n".getBytes());
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
