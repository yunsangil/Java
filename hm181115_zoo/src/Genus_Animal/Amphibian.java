package Genus_Animal;

/**
 * 양서류
 * @author yunsangil
 *
 */
public class Amphibian extends Pisces { // 양서류

	public Amphibian() {
		super.Is_Vertebra();
		tissue();
		gestalt();
		Habitat();
	}

	public String tissue() {
		// TODO Auto-generated method stub
		super.tissue = "어릴 때는 아가미, 꼬리,다리 4개 등";
		return super.tissue;
	}

	@Override
	public String gestalt() {
		// TODO Auto-generated method stub
		super.gestalt = "대표적으로 개구리,도룡뇽 같은";
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
		super.Habitat = "물과 뭍";
		return super.Habitat;
	}
}
