package com.tarikkamat.userservice.mapper;

import com.tarikkamat.userservice.dto.ReviewDTO;
import com.tarikkamat.userservice.entity.Review;
import com.tarikkamat.userservice.request.ReviewSaveRequest;
import com.tarikkamat.userservice.request.ReviewUpdateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReviewMapper {
    ReviewMapper INSTANCE = Mappers.getMapper(ReviewMapper.class);
    ReviewDTO convertToReviewDTO(Review review);
    Review convertToSaveReview(ReviewSaveRequest request);
    List<ReviewDTO> convertToReviewDTOList(List<Review> reviews);
    Review convertToUpdateReview(ReviewUpdateRequest request);


}
