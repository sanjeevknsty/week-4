
interface MealPlan{
    void getMealDetails(String meal);
};
class VegetarianMeal implements MealPlan {
    @Override
    public void getMealDetails(String meal) {
        System.out.println("Veg Meal Details " + meal);
    }
}

class NonVegetarianMeal implements MealPlan {
    @Override
    public void getMealDetails(String meal) {
        System.out.println("Non Veg Meal Details " + meal);
    }

}


class Meal <T extends MealPlan>{
    private String name;
    private T mealPlan;

    public Meal(String name, T mealPlan){

        this.name = name;
        this.mealPlan = mealPlan;
    }
//    public void getMealDetails(){
//        mealPlan.getMealDetails(name);
//    }
    public void getMealDetails(){
        mealPlan.getMealDetails(name);
    }

}

public class Q4 {
    public static void main(String[] args) {

        Meal<NonVegetarianMeal> NonVeg = new Meal<>("Chicken", new NonVegetarianMeal());
        Meal<VegetarianMeal> Veg = new Meal<>("LEaf", new VegetarianMeal());

        NonVeg.getMealDetails();
        Veg.getMealDetails();

    }
}
