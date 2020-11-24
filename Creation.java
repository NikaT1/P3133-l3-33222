package lab3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Creation {
	@Bean
	public Creature hero01() {
		return new Creature("Малыш", 10);
	}
	@Bean
	public Creature hero02() {
		return new Creature("Карлсон", 34);
	}
	@Bean
	public Celebration birthday1() {
		return new Celebration(hero01(), hero02(), "в домике на крыше");
	}
	@Bean
	public Territory territory1() {
		Territory territory = new Territory(Area.CITY, "Стокгольм", hero01(), hero02());
		territory.addWaterObject(TypeOfWaterObject.BAY);
		territory.getTwilight().startTwilight();
		territory.getSky().glow();
		return territory;
	}
	@Bean
	public Time time1() {
		return new Time(Months.JUNE, Day.EVENING);
	}
	@Bean
	public Place place1() {
		return new Place(territory1());
	}
	@Bean
	public FoodAndDrinks food01() {
		return new FoodAndDrinks (Meal.FOOD.getMeal(), "не мама человека по имени " + hero01().getName());
	}
	@Bean
	public Reflection reflection01() {
		return new Reflection(territory1().getInformation(), territory1().getWaterObject(0), territory1().getTwilight());
	}
	@Bean
	public Reflection reflection02() {
		return new Reflection(territory1().getSky().getInformation(), territory1().getWaterObject(0), territory1().getTwilight());
	}
	@Bean
	public FoodAndDrinks food02() {
		return new FoodAndDrinks (Meal.FOOD.getMeal(), "мама человека по имени " + hero01().getName());
	}
	@Bean
	public FoodAndDrinks drink1() {
		return new FoodAndDrinks (Meal.DRINKS.getMeal());
	}
}