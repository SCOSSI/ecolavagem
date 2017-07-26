package com.ecolavagem.ecolavagem.service;

import com.ecolavagem.ecolavagem.model.entity.Localization;
import com.ecolavagem.ecolavagem.model.entity.Washer;
import com.ecolavagem.ecolavagem.repository.WasherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DistanceService {

    @Autowired
    private WasherRepository washerRepository;

    /**
     * This method search who is near based on latitude and longitude.
     * @param latitude - indicated by GeoLocalization on mobile app.
     * @param longitude - indicated by GeoLocalization on mobile app.
     * @return A list that contains only workers available to accept the request.
     */
    public List<Washer> requestWasher(Double latitude, Double longitude){
        Localization userLocalization = new Localization(latitude, longitude);

        List<Washer> washerEntities = listWashersNear(userLocalization);

        /*
        washerEntities.forEach(washerEntity ->
            //send a notification request for these washers
            //the first who accept, we need to send back to client
        );


        */

        return washerEntities;
    }

    private List<Washer> listWashersNear(Localization userLocalization) {
        return washerRepository.findAll()
                .stream()
                .filter(washer -> isAcceptableDistanceBetween(washer.getLocalization(), userLocalization))
                .collect(Collectors.toList());
    }

    /**
     * Define if its acceptable distance to be available for the user's request.
     * @param carWasherLocalization
     * @param userLocalization
     * @return boolean value indicates if its acceptable
     */
    private boolean isAcceptableDistanceBetween(Localization carWasherLocalization, Localization userLocalization) {
        Double distanceKilometers = distance(carWasherLocalization, userLocalization);
        return (distanceKilometers < 100); //Todo: what is an acceptable distance to go? 1km? 2km? 100km?
    }

    /**
     * Calculate and return the distance between two localizations - composed by latitude and longitude.
     * @param localization1
     * @param localization2
     * @return distance in Kilometers
     */
    public static Double distance(Localization localization1, Localization localization2) {

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
