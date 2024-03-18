package com.tarikkamat.userservice.controller;

import com.tarikkamat.userservice.controller.contract.ReviewControllerContract;
import com.tarikkamat.userservice.dto.ReviewDTO;
import com.tarikkamat.userservice.request.ReviewSaveRequest;
import com.tarikkamat.userservice.request.ReviewUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    private final ReviewControllerContract reviewControllerContract;

    @Autowired
    public ReviewController(ReviewControllerContract reviewControllerContract) {
        this.reviewControllerContract = reviewControllerContract;
    }

    @PostMapping
    public ReviewDTO addUser(@RequestBody ReviewSaveRequest request) {
        ReviewDTO reviewDTO = reviewControllerContract.addReview(request);
        return reviewDTO;
    }

    @GetMapping
    public List<ReviewDTO> getAllUsers() {
        List<ReviewDTO> reviewDTOs = reviewControllerContract.getAllReviews();
        return reviewDTOs;
    }

    @GetMapping("/{reviewId}")
    public ReviewDTO getUserById(@PathVariable("reviewId") UUID reviewId) {
        ReviewDTO reviewDTO = reviewControllerContract.getReviewById(reviewId);
        return reviewDTO;
    }

    @DeleteMapping("/{reviewId}")
    public void deleteUserById(@PathVariable("reviewId") UUID reviewId) {
        reviewControllerContract.deleteReviewById(reviewId);
    }

    @PutMapping("/{debugId}")
    public ReviewDTO updateUserById(@PathVariable("debugId") UUID debugId, @RequestBody ReviewUpdateRequest request) {
        ReviewDTO reviewDTO = reviewControllerContract.updateReviewById(request);
        return reviewDTO;
    }

    @GetMapping("/restaurant/{restaurantId}")
    public List<ReviewDTO> getReviewsByRestaurantId(@PathVariable("restaurantId") String restaurantId) {
        List<ReviewDTO> reviewDTOs = reviewControllerContract.getReviewsByRestaurantId(restaurantId);
        return reviewDTOs;
    }
}
