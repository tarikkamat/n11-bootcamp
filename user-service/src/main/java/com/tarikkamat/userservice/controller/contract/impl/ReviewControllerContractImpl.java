package com.tarikkamat.userservice.controller.contract.impl;

import com.tarikkamat.userservice.controller.contract.ReviewControllerContract;
import com.tarikkamat.userservice.dto.ReviewDTO;
import com.tarikkamat.userservice.entity.Review;
import com.tarikkamat.userservice.mapper.ReviewMapper;
import com.tarikkamat.userservice.request.ReviewSaveRequest;
import com.tarikkamat.userservice.request.ReviewUpdateRequest;
import com.tarikkamat.userservice.service.ReviewService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
@Slf4j
public class ReviewControllerContractImpl implements ReviewControllerContract {

    private final ReviewService reviewService;

    @Override
    public ReviewDTO addReview(ReviewSaveRequest request) {
        Review review = ReviewMapper.INSTANCE.convertToSaveReview(request);
        review = reviewService.save(review);
        return ReviewMapper.INSTANCE.convertToReviewDTO(review);
    }

    @Override
    public List<ReviewDTO> getAllReviews() {
        List<Review> reviews = reviewService.findAll();
        return ReviewMapper.INSTANCE.convertToReviewDTOList(reviews);
    }

    @Override
    public ReviewDTO getReviewById(UUID id) {
        Review review = reviewService.findById(id);
        return ReviewMapper.INSTANCE.convertToReviewDTO(review);
    }

    @Override
    public void deleteReviewById(UUID id) {
        reviewService.deleteById(id);
    }

    @Override
    public ReviewDTO updateReviewById(ReviewUpdateRequest request) {
        Review review = ReviewMapper.INSTANCE.convertToUpdateReview(request);
        review = reviewService.save(review);
        return ReviewMapper.INSTANCE.convertToReviewDTO(review);
    }

    @Override
    public List<ReviewDTO> getReviewsByRestaurantId(String restaurantId) {
        List<Review> reviews = reviewService.findByRestaurantId(restaurantId);
        return ReviewMapper.INSTANCE.convertToReviewDTOList(reviews);
    }

}
