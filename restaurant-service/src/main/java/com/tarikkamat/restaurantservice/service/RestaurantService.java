package com.tarikkamat.restaurantservice.service;

import com.tarikkamat.restaurantservice.dao.RestaurantRepository;
import com.tarikkamat.restaurantservice.entity.Restaurant;
import com.tarikkamat.restaurantservice.general.BaseEntityService;
import com.tarikkamat.restaurantservice.response.ReviewResponse;
import com.tarikkamat.restaurantservice.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class RestaurantService extends BaseEntityService<Restaurant, RestaurantRepository> {

    private final WebClient webClient;

    @Autowired
    public RestaurantService(RestaurantRepository repository, WebClient webClient) {
        super(repository);
        this.webClient = webClient;
    }

    public Flux<Restaurant> findByRestaurantLocationWithUserId(String userId) {
        return findUserLocationByUserId(userId)
                .flatMapMany(UserResponse -> {
                    double distance = 10.0; // 10 KM
                    List<Restaurant> restaurants = repository.findRestaurantsNearby(UserResponse.getLatitude(), UserResponse.getLongitude(), distance);
                    return Flux.fromIterable(restaurants);
                });
    }

    private Mono<UserResponse> findUserLocationByUserId(String id) {
        return this.webClient.get()
                .uri("/users/{id}", id)
                .retrieve()
                .bodyToMono(UserResponse.class);
    }

    private Mono<ReviewResponse> findReviewsByRestaurantId(String id) {
        return this.webClient.get()
                .uri("/reviews/restaurant/{id}", id)
                .retrieve()
                .bodyToMono(ReviewResponse.class);
    }

}