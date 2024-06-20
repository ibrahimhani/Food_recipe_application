package com.example.food_recepie_application.Listeners;

import com.example.food_recepie_application.Models.RandomRecipeApiResponse;

public interface RandomRecipeResponseListener {
    void didFetch(RandomRecipeApiResponse response, String message);

    void didError(String message);
}