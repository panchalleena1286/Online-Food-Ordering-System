package com.zosh.service;

import com.zosh.model.Restaurant;
import com.zosh.model.User;
import com.zosh.request.CreateRestaurantRequest;

public interface RestaurantService {

    public Restaurant cretaeRestaurant(CreateRestaurantRequest req, User user);
}
