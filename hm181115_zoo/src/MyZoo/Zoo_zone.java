package MyZoo;


/**
 * Hashmap으로 쓰일 class, 동물 개체의 수, 어디 구역에 배정되있는지 등의 내용을 내포함.
 * @author Yunsangil
 *
 */
public class Zoo_zone{
	
	int count_animals=0;
	String zoo_zone;
	String Species;
	
	public String getSpecies() {
		return Species;
	}
	public void setSpecies(String species) {
		Species = species;
	}
	Zoo_zone(int count_animal,String zone){
		this.count_animals = count_animal;
		this.zoo_zone = zone;
	}
	public int getCount_animals() {
		return count_animals;
	}
	public void setCount_animals(int count_animals) {
		this.count_animals = count_animals;
	}
	public String getZoo_zone() {
		return zoo_zone;
	}
	public void setZoo_zone(String zoo_zone) {
		this.zoo_zone = zoo_zone;
	}
	public String toString() {
		return "분포 수 : "+count_animals+"마리 "+"/ 배정 구역 :"+zoo_zone;
	}
}
