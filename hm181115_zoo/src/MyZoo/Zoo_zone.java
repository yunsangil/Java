package MyZoo;


/**
 * Hashmap���� ���� class, ���� ��ü�� ��, ��� ������ �������ִ��� ���� ������ ������.
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
		return "���� �� : "+count_animals+"���� "+"/ ���� ���� :"+zoo_zone;
	}
}
