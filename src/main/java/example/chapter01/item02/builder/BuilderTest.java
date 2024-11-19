package example.chapter01.item02.builder;

public class BuilderTest {

    public static void main(String[] args) {
        new NutritionFacts.Builder(10, 10)
                .calories(10)
                .fat(13)
                .build();

        new NutritionFacts2.NutritionFacts2Builder()
                .servingSize(1)
                .carbohydrate(2)
                .build();
    }
}