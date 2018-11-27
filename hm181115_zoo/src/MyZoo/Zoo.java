package MyZoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Genus_Animal.Amphibian;
import Genus_Animal.Aves;
import Genus_Animal.Mammalia;
import Genus_Animal.Pisces;
import Genus_Animal.Sauropsid;
import Living_Organism.Animal;

/**
 * ������ Ŭ�������� ���� ��κ��� �޼ҵ带 ������
 * @author Yunsangil
 *
 */
public class Zoo {
	Scanner in = new Scanner(System.in);
	ArrayList<Animal> list = new ArrayList<>();
	ArrayList<Zoo_zone> zone_list = new ArrayList<>();
	HashMap<String, Zoo_zone> dic = new HashMap<>();
	Animal add = null;
	int find;

	Zoo() {
		init();
	}
	/**
	 * �޴� �ݺ�
	 */
	void init() {
		while (true) {
			menu();
			try {
				int userselect = in.nextInt();
				in.nextLine();
				switch (userselect) {
				case 1:
					add();
					break;
				case 2:
					list();
					break;
				case 3:
					mod_zone();
					break;
				case 4:
					mod_count();
					break;
				case 5:
					save();
					return;
				default:
					System.out.println("1~5������ �Է����ּ���!");
					init();
				}
			} catch (Exception e) {
				System.out.println("���ڸ� �Է����ּ���!");
				in.nextLine();
			}
		}
	}
	
	/**
	 * �ܼ� �޴�
	 */
	void menu() {
		System.out.println("������������MyZoo������������");
		System.out.println("����������������������������������");
		System.out.println("1. ���� �߰�");
		System.out.println("2. ���� ����Ʈ");
		System.out.println("3. ���� �����̵�");
		System.out.println("4. ���� ����������");
		System.out.println("5. ���� �� ����");
		System.out.println("����������������������������������");
	}
	/**
	 * ���� �߰� �޼ҵ�
	 * ���� ô�ߵ�������? ��ô�ߵ��������� ����ߵ����� ô�ߵ����� ��������
	 * ������,������ �������ٶ��� ���ŷӰԵ� HashMap�� �������.(��� ǰ���� ��ӹ����� �ᱹ Animal���� �޴µ� 
	 * �������� �������� �Է��ϴ°� ���� �ʴٰ� �Ǵ��ؼ�)
	 * 
	 */
	void add() {
		String Genus = null;
		System.out.println("� ������ �߰��Ͻ� �ǰ���?"); // ���⼭ ô�ߵ�������? ��ô�� ���������� ����� ������ ���� �̱����̹Ƿ� �̷��� «
		System.out.println("1.��� /2.�缭��/3.������/4.�����/5.����");
		try {
			int userinput = in.nextInt();
			in.nextLine();
			switch (userinput) {
			case 1:
				add = new Pisces();
				Genus = "���";
				break;
			case 2:
				add = new Amphibian();
				Genus = "�缭��";
				break;
			case 3:
				add = new Mammalia();
				Genus = "������";
				break;
			case 4:
				add = new Sauropsid();
				Genus = "�����";
				break;
			case 5:
				add = new Aves();
				Genus = "����";
				break;
			default:
				System.out.println("1~5������ �Է����ּ���!");
				add();
			}
			System.out.println(Genus + "�� �����ϼ̽��ϴ�!");
			System.out.println("ǰ���� �Է����ּ���.");
			String user_input = in.nextLine();
			add.Species(user_input);
			list.add(add);
			System.out.println("��� ������ ������Ű�ðڽ��ϱ�?");
			String input_zone = in.nextLine();
			System.out.println("�̵��� �� ����Դϱ�?(���ڸ� �Է�)");
			int input_count = in.nextInt();
			in.nextLine();
			Zoo_zone input = new Zoo_zone(input_count,input_zone);
			zone_list.add(input);
			dic.put(user_input, zone_list.get(zone_list.size()-1));
			zone_list.get(zone_list.size()-1).setSpecies(user_input);
			System.out.println(list.get(list.size() - 1) + "�� ���� ��� �Ǿ����ϴ�!");

		} catch (Exception e) {
			System.out.println("���ڸ� �Է����ּ���!");
			in.nextLine();
			add();
		}

	}
	
	/**
	 * ��� ���.
	 * ������ ����,�������� ��ȸ�� ���� ���� HashMap�� �����ؾ���.
	 * �� �������� Zoo_zone�� ���� Species�� Getter, Setter�� �������� Zoo_zone �� ��ü�� �ĺ��� �ʿ��ؼ� �߰�����
	 */
	void list() {
		System.out.println("���� MyZoo �������� ���� ���� ��Ȳ�� ������ �����ϴ�.");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("������ ����, ���� ���� ��ȸ�Ͻðڽ��ϱ�?");
		System.out.println("1. ��   /2. �ƴϿ�");
		try {
			int userinput = in.nextInt();
			in.nextLine();
			if (userinput == 1) {
				System.out.println("ǰ���� �Է����ּ���.");
				String user_input = in.nextLine();
				System.out.println(dic.get(user_input));
			} else if (userinput == 2) {
				System.out.println("���� �޴��� ���ư��ϴ�.");
				return;
			}

		} catch (Exception e) {
			System.out.println("���ڸ� �Է����ּ���!");
			list();
		}
	}
	/**
	 * ����
	 */
	void mod_zone() {
		System.out.println("���� �̵��� ������ ǰ���� �Է����ּ���");
		String input_species = in.nextLine();
		for(int i=0;i<zone_list.size();i++)
		{
			if(input_species.equals(zone_list.get(i).getSpecies()))
			{
				find = i;
				break;
			}
		}
		System.out.println("��� �������� �̵���ų�ǰ���?");
		String input_zone = in.nextLine();
		System.out.println(input_species+"��"+zone_list.get(find).getZoo_zone()+"����" +input_zone+"���� �̵��մϴ�!");
		zone_list.get(find).setZoo_zone(input_zone);
	}
	/**
	 * ����
	 */
	void mod_count() {
		System.out.println("���� ���� ������ ������ ǰ���� �Է����ּ���");
		String input_species = in.nextLine();
		for(int i=0;i<zone_list.size();i++)
		{
			if(input_species.equals(zone_list.get(i).getSpecies()))
			{
				find = i;
				break;
			}
		}
		System.out.println("�� ������ �����Ͻðڽ��ϱ�?");
		int input_count = in.nextInt();
		in.nextLine();
		System.out.println(input_species+"��"+zone_list.get(find).getCount_animals()+"����" +input_count+"���� �����˴ϴ�!");
		zone_list.get(find).setCount_animals(input_count);
	}
	
	/**
	 * �̰� DB�� �����ϴ� ������ �ǾߵǴµ�... DB ���� �ص� �ʹ� �����ɸ���.. �ָ��� ����..
	 */
	void save() {

	}
}
