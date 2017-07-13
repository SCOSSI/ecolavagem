package com.ecolavagem.ecolavagem.service;

import com.ecolavagem.ecolavagem.model.entity.CarWasher;
import com.ecolavagem.ecolavagem.model.entity.Localization;
import com.ecolavagem.ecolavagem.repository.CarWasherRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class DistanceService {

    @Autowired
    private CarWasherRepository carWasherRepository;

    /**
     * This method search who is near based on latitude and longitude.
     * @param latitude - indicated by GeoLocalization on mobile app.
     * @param longitude - indicated by GeoLocalization on mobile app.
     * @return A list that contains only workers available to accept the request.
     */
    public List<CarWasher> near(Double latitude, Double longitude){
        Localization userLocalization = new Localization(latitude, longitude);
        return carWasherRepository.findAll()
                .stream()
                .filter(carWasher -> isAcceptableDistanceBetween(carWasher.getLocalization(), userLocalization))
                .collect(Collectors.toList());
    }

    /**
     * Define if its acceptable distance to be available for the user's request.
     * @param carWasherLocalization
     * @param userLocalization
     * @return boolean value indicates if its acceptable
     */
    private boolean isAcceptableDistanceBetween(Localization carWasherLocalization, Localization userLocalization) {
        double distanceKilometers = distance(carWasherLocalization, userLocalization);
        return (distanceKilometers < 100); //Todo: what is an acceptable distance to go? 1km? 2km? 100km?
    }

    /**
     * Calculate and return the distance between two localizations - composed by latitude and longitude.
     * @param localization1
     * @param localization2
     * @return distance in Kilometers
     */
    private static double distance(Localization localization1, Localization localization2) {

        double theta = localization1.getLongitude() - localization2.getLongitude();
        double dist = Math.sin(deg2rad(localization1.getLatitude()))
                * Math.sin(deg2rad(localization2.getLatitude()))
                + Math.cos(deg2rad(localization1.getLatitude()))
                * Math.cos(deg2rad(localization2.getLatitude()))
                * Math.cos(deg2rad(theta));

        return rad2deg(Math.acos(dist)) * 60 * 1.1515 * 1.609344;
    }

    private static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private static double rad2deg(double rad) {
        return (rad * 180 / Math.PI);
    }

}
