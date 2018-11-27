package Living_Organism;

/**
 * ������ ǥ���ϴµ��� �־�� ���� ��ü
 * @author yunsangil
 *
 */
abstract public class Animal {
	public boolean Vertebra; //ô�� ����
	public String Species; //����
	public String gestalt; //����
	public String tissue; //������ �ǹ̸� ������ �������ٴ� Ư¡���� �������
	public String Evolved; //��ȭ�� ����
	public String Habitat; //������
	public String Vertebra_print;
	
	/**
	 * ô�߰� �ִ���? ������?
	 * @return true : ô�� ����, false : ô�� ����
	 */
	abstract public boolean Is_Vertebra(); 
	
	/**
	 * ���� ������? ������? �����? ���� ����. �׷��ϱ� name.
	 * @param input
	 * @return name, �׷��ϱ� �� ��
	 */
	abstract public String Species(String input);
	
	/**
	 * � �������� �̷���� �ִ°�? <--�̰Ŵ� ���� �������ڴ� �ƴϴϱ� ���� ����.....
	 * �̾����� Ư¡���� �����.
	 * @param input
	 * @return �� ���� Ư¡
	 */
	abstract public String tissue();
	
	/**
	 * ������� ��Ѱ�?
	 * @param input
	 * @return �� ���� �����
	 */
	abstract public String gestalt();
	
	/**
	 * �������� ����ΰ�?
	 * ������ �ʿ��Ұ� ����. �� ������ �������� �ٸ��״�.
	 * @return ������
	 */
	abstract public String Habitat();
	/**
	 * ���� ��������?/ô�ߵ�������,��ü��������? /������� �����?/������ ��������� �������ִ���?/�������� �������?
	 * @return ���� ������ �״�� ��ȯ.
	 */
	public String toString() {
		if(Vertebra==true)
		{
			Vertebra_print="ô�ߵ���";
		}
		else {
			Vertebra_print="��ô�ߵ���";
		}

		return Species+"/"+Vertebra_print +"/"+ gestalt +"/" +tissue + "/"+Habitat;
	}
}
