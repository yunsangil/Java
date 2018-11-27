package Genus_Animal;

import Living_Organism.Vertebrata;

/**
 * 어류
 * @author yunsangil
 *
 */
public class Pisces extends Vertebrata { // 어류
	public Pisces() {
		super.Is_Vertebra();
		tissue();
		gestalt();
		Habitat();
	}

	@Override
	public String tissue() {
		// TODO Auto-generated method stub
		super.tissue = "지느러미,아가미,비늘";
		return super.tissue;
	}

	@Override
	public String gestalt() {
		// TODO Auto-generated method stub
		super.gestalt = "흔히 말하는 물고기?";
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
		super.Habitat = "물";
		return super.Habitat;
	}
}
