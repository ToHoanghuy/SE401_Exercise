public interface DietBuilder {
    DietBuilder addProtein(String protein);
    DietBuilder addCarbonhydrate(String cacbonhydrate);
    DietBuilder addVegetable(String vegetable);
    DietBuilder addBeverage(String beverage);
    Diet build();
}
