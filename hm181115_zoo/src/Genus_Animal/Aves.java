package Genus_Animal;

/**
 * ����
 * @author yunsangil
 *
 */
public class Aves extends Sauropsid { // ����

	public Aves() {

		super.Is_Vertebra();
		tissue();
		gestalt();
		Habitat();
	}

	public String tissue() {
		// TODO Auto-generated method stub
		super.tissue = "����, �θ�, ���� ��";
		return super.tissue;
	}

	@Override
	public String gestalt() {
		// TODO Auto-generated method stub
		super.gestalt = "�׳� ��";
		return super.gestalt;
	}

	@Override
	public String Species(String input) {
		// TODO Auto-generated method stub
		super.Species = input;
		return super.Species;
	}

	public String Habitat() {
		// TODO Auto-generated method stub
		super.Habitat = "�ַ� ������ ��°� ����";
		return super.Habitat;
	}
}
