package Living_Organism;

/**
 * ��ô�ߵ���. �⺻���� Ư���� ���� Ŭ�������� ��������, ô�߰� �������� ������ ǥ����.
 * �ϴ��� �з��� �س��� ������ �ð� ���´�� ����.
 * @author yunsangil
 *
 */
abstract public class Invertebrate extends Animal {

	@Override
	public boolean Is_Vertebra() {
		// TODO Auto-generated method stub
		super.Vertebra=false;
		return super.Vertebra;
	}

	@Override
	abstract public String tissue();
	@Override
	abstract public String gestalt();
	@Override
	abstract public String Species(String input);


}
