package lab3;
import java.util.Objects;
public class Place implements Placeable{
	public Place(Territory city) {
		this.city = city;
		this.house = "в незаданном доме";
		this.specificPlace = "в незаданном месте";
	}
	public Place(Territory city, String house) {
		this.city = city;
		this.house = house;
		this.specificPlace = "в незаданном месте";
	}
	public Place(Territory city, String house, String specificPlace) {
		this.city = city;
		this.house = house;
		this.specificPlace = specificPlace;
	}
	private Territory city;
	private String house;
	private String specificPlace;
	public void setCity(Territory city) {
		this.city = city;
	}
	public Territory getCity() {
		return city;
	}
	public void setHouse(String house){
		this.house = house;
	}
	public String getHouse() {
		return house;
	}
	public void setSpecificPlace(String specificPlace){
		this.specificPlace = specificPlace;
	}
	public String getSpecificPlace() {
		return specificPlace;
	}
	public String getFullAdress() {
		return city.getName() + " " + house + " " + specificPlace;
	}
	public int hashCode() {
		int r = Objects.hashCode(this.getFullAdress());
		return r;
	}
	public boolean equals(Object place1) {
		if (place1 == this) {
			return true;
		}
		if (place1 == null || getClass() != place1.getClass()) {
			return false;
		}
		Place place2 = (Place) place1;
		
		return getFullAdress() == place2.getFullAdress();
	}
	public String toString() {
		return getFullAdress();
	}
}