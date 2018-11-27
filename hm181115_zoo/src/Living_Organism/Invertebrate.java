package Living_Organism;

/**
 * 무척추동물. 기본적인 특성은 동물 클래스에서 따왔으나, 척추가 존재하지 않음을 표시함.
 * 일단은 분류만 해놓고 구현은 시간 나는대로 하자.
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
