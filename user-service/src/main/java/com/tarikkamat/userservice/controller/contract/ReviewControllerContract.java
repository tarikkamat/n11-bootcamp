package com.tarikkamat.userservice.controller.contract;

import com.tarikkamat.userservice.dto.ReviewDTO;
import com.tarikkamat.userservice.request.ReviewSaveRequest;
import com.tarikkamat.userservice.request.ReviewUpdateRequest;

import java.util.List;
import java.util.UUID;

public interface ReviewControllerContract {

    ReviewDTO addReview(ReviewSaveRequest request);
    List<ReviewDTO> getAllReviews();
    ReviewDTO getReviewById(UUID id);
    void deleteReviewById(UUID id);
    ReviewDTO updateReviewById(ReviewUpdateRequest request);
    List<ReviewDTO> getReviewsByRestaurantId(String restaurantId);
}
