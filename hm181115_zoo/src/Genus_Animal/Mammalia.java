package Genus_Animal;

/**
 * ������
 * @author yunsangil
 *
 */
public class Mammalia extends Amphibian { // ������

	public Mammalia() {
		super.Is_Vertebra();
		tissue();
		gestalt();
		Habitat();
	}

	public String tissue() {
		// TODO Auto-generated method stub
		super.tissue = "���� ���̴� ����";
		return super.tissue;
	}

	@Override
	public String gestalt() {
		// TODO Auto-generated method stub
		super.gestalt = "���� ���̴� ������ �з��� ������� �پ���";
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
		super.Habitat = "����";
		return super.Habitat;
	}
}
