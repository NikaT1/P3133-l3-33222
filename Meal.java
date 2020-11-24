package lab3;
enum Meal {
    FOOD("булочки"),
    DRINKS("сок");
    private String meal;
    Meal(String meal){
        this.meal = meal;
    }
    public String getMeal(){ 
		return meal;
	}
}