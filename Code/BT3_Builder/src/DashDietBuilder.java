public class DashDietBuilder implements DietBuilder {
    private final Diet diet;

    public DashDietBuilder(){
        this.diet = new Diet();
    }

    @Override
    public DietBuilder addProtein(String protein){
        diet.setProtein(protein);
        return this;
    }

    @Override
    public DietBuilder addCarbonhydrate(String cacbonhydrate){
        diet.setCarbonhydrate(cacbonhydrate);
        return this;
    }

    @Override
    public DietBuilder addVegetable(String vegetable){
        diet.addVegetable(vegetable);
        return this;
    }

    @Override
    public DietBuilder addBeverage(String beverage){
        diet.setBeverage(beverage);
        return this;
    }

    @Override
    public Diet build(){
        return diet;
    }
}
