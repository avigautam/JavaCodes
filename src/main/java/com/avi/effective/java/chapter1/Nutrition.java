/*
 * This code is developed by Avinash Gautam.
 *
 * While preparing for Java 11 certification on Oracle University online platform.
 *
 * For more information connect me on avigautam.knit@gmail.com
 *
 * @author  Avinash Gautam
 * @version 1.0
 *
 *
 */

package com.avi.effective.java.chapter1;

import com.avi.effective.java.chapter1.NutritionFacts.Builder;

public class Nutrition {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new Builder(1, 2)
                .setCalories(3).setFat(4).setSodium(5).setCarbohydrate(6).build();

        System.out.println("Serving Size : " + nutritionFacts.getServingSize());
        System.out.println("Servings : " + nutritionFacts.getServings());
        System.out.println("Calories : " + nutritionFacts.getCalories());
        System.out.println("Fat : " + nutritionFacts.getFat());
        System.out.println("Carbohydrate : " + nutritionFacts.getCarbohydrate());
        System.out.println("Sodium : " + nutritionFacts.getSodium());
    }
}
