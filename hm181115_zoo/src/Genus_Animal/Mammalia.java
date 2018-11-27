package Genus_Animal;

/**
 * 포유류
 * @author yunsangil
 *
 */
public class Mammalia extends Amphibian { // 포유류

	public Mammalia() {
		super.Is_Vertebra();
		tissue();
		gestalt();
		Habitat();
	}

	public String tissue() {
		// TODO Auto-generated method stub
		super.tissue = "젖을 먹이는 동물";
		return super.tissue;
	}

	@Override
	public String gestalt() {
		// TODO Auto-generated method stub
		super.gestalt = "젖을 먹이는 동물의 분류라서 생김새가 다양함";
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
		super.Habitat = "육지";
		return super.Habitat;
	}
}
