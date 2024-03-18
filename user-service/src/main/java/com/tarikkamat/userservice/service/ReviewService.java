package com.tarikkamat.userservice.service;

import com.tarikkamat.userservice.dao.ReviewRepository;
import com.tarikkamat.userservice.entity.Review;
import com.tarikkamat.userservice.general.BaseEntityService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ReviewService extends BaseEntityService<Review, ReviewRepository> {
    protected ReviewService(ReviewRepository repository) {
        super(repository);
    }

    public List<Review> findByRestaurantId(String restaurantId) {
        return repository.findByRestaurantId(restaurantId);
    }
}
