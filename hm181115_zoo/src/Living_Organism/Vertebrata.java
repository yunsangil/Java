package Living_Organism;

/**
 * ô�ߵ���. �⺻���� Ư���� ���� Ŭ�������� ��������, ô���� ���� ���θ� ǥ����.
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
