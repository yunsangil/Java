package Living_Organism;

/**
 * 척추동물. 기본적인 특성은 동물 클래스에서 따왔으나, 척추의 존재 여부를 표시함.
 * @author yunsangil
 *
 */
abstract public class Vertebrata extends Animal {
	

	/** 
	 * @Override
	 * @see Living_Organism.Animal#Is_Vertebra();
	 */
	public boolean Is_Vertebra() {
		// TODO Auto-generated method stub
		super.Vertebra=true;
		return super.Vertebra;
	}
	
	@Override
	abstract public String tissue();
	@Override
	abstract public String gestalt();
	@Override
	abstract public String Species(String input);

	abstract public String Habitat();



}
