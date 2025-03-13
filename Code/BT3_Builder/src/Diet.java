import java.util.ArrayList;
import java.util.List;

public class Diet {
    private String protein;
    private String carbonhydrate;
    private final List<String> vegetables;
    private String beverage;

    public Diet(){
        this.vegetables = new ArrayList<>();
    }

    public void setProtein(String protein){
        this.protein = protein;
    }

    public void setCarbonhydrate(String carbonhydrate){
        this.carbonhydrate = carbonhydrate;
    }

    public void addVegetable(String vegetable){
        this.vegetables.add(vegetable);
    }

    public void setBeverage(String beverage){
        this.beverage = beverage;
    }

    public String toString(){
        return "Diet [Protein=" + protein + ", Carbohydrate=" + carbonhydrate + 
               ", Vegetables=" + vegetables + ", Beverage=" + beverage + "]";
    }
}
