public class App {
    public static void main(String[] args) throws Exception {
        DietDirector director = new DietDirector();

        // Chế độ ăn Địa Trung Hải
        DietBuilder diatrunghaiBuilder = new DiaTrungHaiDietBuilder();
        director.setBuilder(diatrunghaiBuilder);
        Diet diatrunghaiDiet = director.constructDiaTrungHaiDiet();
        System.out.println("Chế độ ăn Địa Trung Hải: " + diatrunghaiDiet);

        // Chế độ ăn DASH
        DietBuilder dashBuilder = new DashDietBuilder();
        director.setBuilder(dashBuilder);
        Diet dashDiet = director.constructDashDiet();
        System.out.println("Chế độ ăn Dash: " + dashDiet);

        DietBuilder vegetarianBuilder = new VegetarianDietBuilder();
        director.setBuilder(vegetarianBuilder);
        Diet vegetarianDiet = director.constructVegetarianDiet();
        System.out.println("Chế độ ăn chay: " + vegetarianDiet);
    }
}
