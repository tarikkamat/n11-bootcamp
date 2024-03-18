
# @patikadev & n11 Spring Boot Bootcamp Final Assignment

This project provides a service where users can review restaurants and receive recommendations. It also includes a service for managing restaurant data. The project enables management of user and restaurant information, allows for reviews to be added, updated, and deleted, and offers restaurant recommendations based on user location and restaurant ratings.

# Features

## User and Review Service
* Users can be registered with their name, surname, latitude, and longitude values.
* Users can be deleted and their information updated.
* Reviews can be added with a score between 1 to 5.
* Reviews can be deleted, and their text and score updated.
* An API offers 3 restaurant recommendations based on user location and restaurant ratings. Recommended restaurants should not be more than 10 km away from the user.

## Restaurant Service
* Restaurants can be added with required information along with latitude and longitude values.
* Restaurants can be deleted and their information updated.
* All restaurants can be listed.
* Restaurant data is stored and queried using Apache Solr.

## Technologies
* Spring Framework
* Hibernate
* Apache Solr
* Swagger OpenAPI (for documentation)
* Standard Java logging mechanisms for logging
* Modern Java design patterns for exception handling


![Scheme](https://i.hizliresim.com/reg8514.png)