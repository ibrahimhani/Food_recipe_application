package com.example.food_recepie_application.Listeners;

import com.example.food_recepie_application.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    void didFetch(RecipeDetailsResponse response, String message);
    void didError(String message);
}
