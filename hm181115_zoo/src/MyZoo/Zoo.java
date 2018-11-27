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
 * 동물원 클래스에서 거의 대부분의 메소드를 정의함
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
	 * 메뉴 반복
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
					System.out.println("1~5까지만 입력해주세요!");
					init();
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요!");
				in.nextLine();
			}
		}
	}
	
	/**
	 * 단순 메뉴
	 */
	void menu() {
		System.out.println("──────MyZoo──────");
		System.out.println("────────────────┐");
		System.out.println("1. 동물 추가");
		System.out.println("2. 동물 리스트");
		System.out.println("3. 동물 구역이동");
		System.out.println("4. 동물 마리수수정");
		System.out.println("5. 저장 및 종료");
		System.out.println("└────────────────");
	}
	/**
	 * 동물 추가 메소드
	 * 현재 척추동물인지? 무척추동물인지를 물어야되지만 척추동물만 구현했음
	 * 마리수,구역을 지정해줄때는 번거롭게도 HashMap을 사용했음.(모든 품종은 상속받을때 결국 Animal에서 받는데 
	 * 쓸데없이 마리수를 입력하는게 맞지 않다고 판단해서)
	 * 
	 */
	void add() {
		String Genus = null;
		System.out.println("어떤 동물을 추가하실 건가요?"); // 여기서 척추동물인지? 무척추 동물인지를 물어야 맞지만 현재 미구현이므로 이렇게 짬
		System.out.println("1.어류 /2.양서류/3.포유류/4.파충류/5.조류");
		try {
			int userinput = in.nextInt();
			in.nextLine();
			switch (userinput) {
			case 1:
				add = new Pisces();
				Genus = "어류";
				break;
			case 2:
				add = new Amphibian();
				Genus = "양서류";
				break;
			case 3:
				add = new Mammalia();
				Genus = "포유류";
				break;
			case 4:
				add = new Sauropsid();
				Genus = "파충류";
				break;
			case 5:
				add = new Aves();
				Genus = "조류";
				break;
			default:
				System.out.println("1~5까지만 입력해주세요!");
				add();
			}
			System.out.println(Genus + "를 선택하셨습니다!");
			System.out.println("품종을 입력해주세요.");
			String user_input = in.nextLine();
			add.Species(user_input);
			list.add(add);
			System.out.println("어느 구역에 배정시키시겠습니까?");
			String input_zone = in.nextLine();
			System.out.println("이들은 총 몇마리입니까?(숫자만 입력)");
			int input_count = in.nextInt();
			in.nextLine();
			Zoo_zone input = new Zoo_zone(input_count,input_zone);
			zone_list.add(input);
			dic.put(user_input, zone_list.get(zone_list.size()-1));
			zone_list.get(zone_list.size()-1).setSpecies(user_input);
			System.out.println(list.get(list.size() - 1) + "이 정상 등록 되었습니다!");

		} catch (Exception e) {
			System.out.println("숫자만 입력해주세요!");
			in.nextLine();
			add();
		}

	}
	
	/**
	 * 목록 출력.
	 * 배정된 구역,분포수를 조회할 때도 역시 HashMap을 참조해야함.
	 * 이 과정에서 Zoo_zone에 본디 Species의 Getter, Setter가 없었으나 Zoo_zone 각 객체에 식별이 필요해서 추가했음
	 */
	void list() {
		System.out.println("현재 MyZoo 동물원의 동물 분포 현황은 다음과 같습니다.");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("배정된 구역, 분포 수를 조회하시겠습니까?");
		System.out.println("1. 예   /2. 아니오");
		try {
			int userinput = in.nextInt();
			in.nextLine();
			if (userinput == 1) {
				System.out.println("품종을 입력해주세요.");
				String user_input = in.nextLine();
				System.out.println(dic.get(user_input));
			} else if (userinput == 2) {
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;
			}

		} catch (Exception e) {
			System.out.println("숫자만 입력해주세요!");
			list();
		}
	}
	/**
	 * 수정
	 */
	void mod_zone() {
		System.out.println("구역 이동할 동물의 품종을 입력해주세요");
		String input_species = in.nextLine();
		for(int i=0;i<zone_list.size();i++)
		{
			if(input_species.equals(zone_list.get(i).getSpecies()))
			{
				find = i;
				break;
			}
		}
		System.out.println("어디 구역으로 이동시킬건가요?");
		String input_zone = in.nextLine();
		System.out.println(input_species+"가"+zone_list.get(find).getZoo_zone()+"에서" +input_zone+"으로 이동합니다!");
		zone_list.get(find).setZoo_zone(input_zone);
	}
	/**
	 * 수정
	 */
	void mod_count() {
		System.out.println("마리 수를 수정할 동물의 품종을 입력해주세요");
		String input_species = in.nextLine();
		for(int i=0;i<zone_list.size();i++)
		{
			if(input_species.equals(zone_list.get(i).getSpecies()))
			{
				find = i;
				break;
			}
		}
		System.out.println("몇 마리로 수정하시겠습니까?");
		int input_count = in.nextInt();
		in.nextLine();
		System.out.println(input_species+"가"+zone_list.get(find).getCount_animals()+"에서" +input_count+"으로 수정됩니다!");
		zone_list.get(find).setCount_animals(input_count);
	}
	
	/**
	 * 이게 DB에 저장하는 내용이 되야되는데... DB 구상만 해도 너무 오래걸린다.. 주말에 하자..
	 */
	void save() {

	}
}
