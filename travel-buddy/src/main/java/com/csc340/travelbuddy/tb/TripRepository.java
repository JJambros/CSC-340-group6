package com.csc340.travelbuddy.tb;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TripRepository extends JpaRepository<Trip, Integer> {
    List<Trip> findByDestinationContaining(String country);
    int countByProviderid(int providerid);
    List<Trip> findByProviderid(int id);
}
