package lab3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
public class Main {
	public static void main(String[] args){
		ApplicationContext Creation = new AnnotationConfigApplicationContext(Creation.class);
		Creature hero1 = Creation.getBean("hero01", Creature.class);
		Creature hero2 = Creation.getBean("hero02", Creature.class);
		Territory territory = Creation.getBean("territory1", Territory.class);
		Time time = Creation.getBean("time1", Time.class);
		Place place = Creation.getBean("place1", Place.class);
		hero1.setLocation(place);
		hero2.setLocation(place);
		territory.describeTerritory(time);
		territory.describeGlow();
		territory.describeTwilight();
		Reflection reflection1 = Creation.getBean("reflection01", Reflection.class);
		Reflection reflection2 = Creation.getBean("reflection02", Reflection.class);
		reflection1.showReflection();
		reflection2.showReflection();
		Celebration birthday = Creation.getBean("birthday1", Celebration.class);
		birthday.celebrateTogether(time);
		hero1.setWantToAdmire(true);
		hero2.setWantToAdmire(false);
		territory.getSky().changeColor();
		birthday.admireTogether(territory.getSky().showChangeColor());
		birthday.sitTogether("на крылечке");
		FoodAndDrinks food1 = Creation.getBean("food01", FoodAndDrinks.class);
		FoodAndDrinks food2 = Creation.getBean("food02", FoodAndDrinks.class);
		FoodAndDrinks drink = Creation.getBean("drink1", FoodAndDrinks.class);
		birthday.eatTogether(food1);
		birthday.drinkTogether(drink);
		hero1.setFact(Day.EVENING.getTimeOfDay(), "другой " + Day.EVENING.getTimeOfDay(), "не похож на");
		hero2.setFact(food1, food2, "не похожи на");
		birthday.realizeTogether();
	}
}
