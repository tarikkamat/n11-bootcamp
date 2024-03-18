package com.tarikkamat.userservice.entity;

import com.tarikkamat.userservice.general.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "REVIEW")
public class Review extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "RESTAURANT_ID")
    private String restaurantId;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "RATING")
    private Integer rating;

}
