package Living_Organism;

/**
 * 동물을 표현하는데에 있어서의 조상 객체
 * @author yunsangil
 *
 */
abstract public class Animal {
	public boolean Vertebra; //척추 유무
	public String Species; //종명
	public String gestalt; //형태
	public String tissue; //조직의 의미를 갖지만 조직보다는 특징으로 기술했음
	public String Evolved; //진화의 갈래
	public String Habitat; //서식지
	public String Vertebra_print;
	
	/**
	 * 척추가 있는지? 없는지?
	 * @return true : 척추 있음, false : 척추 없음
	 */
	abstract public boolean Is_Vertebra(); 
	
	/**
	 * 무슨 종인지? 강아지? 고양이? 같은 류의. 그러니까 name.
	 * @param input
	 * @return name, 그러니까 종 명
	 */
	abstract public String Species(String input);
	
	/**
	 * 어떤 조직으로 이루어져 있는가? <--이거는 내가 생물학자는 아니니까 대충 적음.....
	 * 이었지만 특징으로 기술함.
	 * @param input
	 * @return 그 종의 특징
	 */
	abstract public String tissue();
	
	/**
	 * 생김새는 어떠한가?
	 * @param input
	 * @return 그 종의 생김새
	 */
	abstract public String gestalt();
	
	/**
	 * 서식지는 어디인가?
	 * 수정이 필요할거 같음. 각 종마다 서식지가 다를테니.
	 * @return 서식지
	 */
	abstract public String Habitat();
	/**
	 * 종은 무엇인지?/척추동물인지,연체동물인지? /생김새는 어떠한지?/조직은 어느식으로 구성되있는지?/서식지는 어디인지?
	 * @return 위의 내용을 그대로 반환.
	 */
	public String toString() {
		if(Vertebra==true)
		{
			Vertebra_print="척추동물";
		}
		else {
			Vertebra_print="무척추동물";
		}

		return Species+"/"+Vertebra_print +"/"+ gestalt +"/" +tissue + "/"+Habitat;
	}
}
