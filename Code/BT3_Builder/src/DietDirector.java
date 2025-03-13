public class DietDirector {
    private DietBuilder builder;

    public void setBuilder(DietBuilder builder){
        this.builder = builder;
    }

    public Diet constructDiaTrungHaiDiet(){
        return builder.addProtein("Thịt cá")
        .addCarbonhydrate("Dầu ô liu")
        .addVegetable("Rau quả tươi")
        .addBeverage("Nước cam")
        .build();
    }

    public Diet constructDashDiet(){
        return builder.addProtein("Thịt gà")
        .addCarbonhydrate("Gạo lứt")
        .addVegetable("Rau xanh")
        .addBeverage("Nước ép trái cây")
        .build();
    }

    public Diet constructVegetarianDiet(){
        return builder.addProtein("Đậu hũ")
        .addCarbonhydrate("Khoai tây")
        .addVegetable("Rau củ hỗn hợp")
        .addBeverage("Nước lọc")
        .build();
    }
}
