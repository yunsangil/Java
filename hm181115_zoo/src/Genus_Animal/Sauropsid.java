package Genus_Animal;

/**
 * �����
 * @author yunsangil
 *
 */
public class Sauropsid extends Amphibian { // �����
	public Sauropsid() {
		super.Is_Vertebra();
		tissue();
		gestalt();
		Habitat();
	}

	public String tissue() {
		// TODO Auto-generated method stub
		super.tissue = "������ ǥ��, ������ ���� �������� ���������� ����";
		return super.tissue;
	}

	@Override
	public String gestalt() {
		// TODO Auto-generated method stub
		super.gestalt = "��ǥ������ �Ǿ�,��";
		return super.gestalt;
	}

	@Override
	public String Species(String input) {
		// TODO Auto-generated method stub
		super.Species = input;
		return super.Species;
	}

	@Override
	public String Habitat() {
		// TODO Auto-generated method stub
		super.Habitat = "��� ���� ����";
		return super.Habitat;
	}
}
