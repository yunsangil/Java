package Genus_Animal;

import Living_Organism.Vertebrata;

/**
 * ���
 * @author yunsangil
 *
 */
public class Pisces extends Vertebrata { // ���
	public Pisces() {
		super.Is_Vertebra();
		tissue();
		gestalt();
		Habitat();
	}

	@Override
	public String tissue() {
		// TODO Auto-generated method stub
		super.tissue = "��������,�ư���,���";
		return super.tissue;
	}

	@Override
	public String gestalt() {
		// TODO Auto-generated method stub
		super.gestalt = "���� ���ϴ� �����?";
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
		super.Habitat = "��";
		return super.Habitat;
	}
}
