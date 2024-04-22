package com.zosh.service;

import com.zosh.dto.RestaurantDto;
import com.zosh.model.Restaurant;
import com.zosh.model.User;
import com.zosh.request.CreateRestaurantRequest;

import java.util.Arrays;
import java.util.*;


public class RestaurantServiceImpl implements RestaurantService{

    @Override
    public Restaurant cretaeRestaurant(CreateRestaurantRequest req, User user) {
        return null;
    }

    @Override
    public Restaurant updateRestaurant(Long restaurantId, CreateRestaurantRequest updatedRestaurant) throws Exception {
        return null;
    }

    @Override
    public Restaurant deleteRestaurant(Long restaurantId) throws Exception {
        return null;
    }

    @Override
    public List<Restaurant> getAllRestaurant() {
        return null;
    }

    @Override
    public List<Restaurant> searchRestaurant() {
        return null;
    }

    @Override
    public Restaurant findRestaurantById(Long id) throws Exception {
        return null;
    }

    @Override
    public Restaurant getRestaurantByUserId(Long userId) throws Exception {
        return null;
    }

    @Override
    public RestaurantDto addToFavorites(Long restaurantId, User user) throws Exception {
        return null;
    }

    @Override
    public Restaurant updateRestaurantStatus(Long id) throws Exception {
        return null;
    }
}
