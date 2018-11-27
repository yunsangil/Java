package Genus_Animal;

/**
 * 파충류
 * @author yunsangil
 *
 */
public class Sauropsid extends Amphibian { // 파충류
	public Sauropsid() {
		super.Is_Vertebra();
		tissue();
		gestalt();
		Habitat();
	}

	public String tissue() {
		// TODO Auto-generated method stub
		super.tissue = "각질의 표피, 수분이 쉽게 몸밖으로 빠져나가지 않음";
		return super.tissue;
	}

	@Override
	public String gestalt() {
		// TODO Auto-generated method stub
		super.gestalt = "대표적으로 악어,뱀";
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
		super.Habitat = "기온 높은 지역";
		return super.Habitat;
	}
}
