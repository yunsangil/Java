package Genus_Animal;

/**
 * �缭��
 * @author yunsangil
 *
 */
public class Amphibian extends Pisces { // �缭��

	public Amphibian() {
		super.Is_Vertebra();
		tissue();
		gestalt();
		Habitat();
	}

	public String tissue() {
		// TODO Auto-generated method stub
		super.tissue = "� ���� �ư���, ����,�ٸ� 4�� ��";
		return super.tissue;
	}

	@Override
	public String gestalt() {
		// TODO Auto-generated method stub
		super.gestalt = "��ǥ������ ������,���洨 ����";
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
		super.Habitat = "���� ��";
		return super.Habitat;
	}
}
