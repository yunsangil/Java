package Genus_Animal;

/**
 * 조류
 * @author yunsangil
 *
 */
public class Aves extends Sauropsid { // 조류

	public Aves() {

		super.Is_Vertebra();
		tissue();
		gestalt();
		Habitat();
	}

	public String tissue() {
		// TODO Auto-generated method stub
		super.tissue = "날개, 부리, 깃털 등";
		return super.tissue;
	}

	@Override
	public String gestalt() {
		// TODO Auto-generated method stub
		super.gestalt = "그냥 새";
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
		super.Habitat = "주로 숲에서 사는거 같음";
		return super.Habitat;
	}
}
