package com.ecolavagem.ecolavagem.service;

import java.util.ArrayList;
import java.util.List;

public class DistanceService {

    public static List<String> near(double latitude, double longitude){

        //Lista de quem talvez atenda na distancia do usuário
        /*List<Localization> quemTaPerto = sqlWhoIsNear(); // latituteColuna between latitute-1 and latitute+1
                                                         // longitudeColuna between longitude-1 and longitude+1

        List<String> perto;
        for(quem : quemTaPerto){
            Double kilometros = DistanceService.distance(latitude, longitude, 1,2);
            boolean atende = quem.atendeNessaDistancia(kilometros);
            if (atende) { perto.add(quem) };
        }

        //lista efetiva de quem tá perto e atende
        return perto;*/
        return new ArrayList<>();
    }

    private static double distance(double lat1, double lon1, double lat2, double lon2) {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1))
                * Math.sin(deg2rad(lat2))
                + Math.cos(deg2rad(lat1))
                * Math.cos(deg2rad(lat2))
                * Math.cos(deg2rad(theta));

        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        dist = dist * 1.609344;

        return (dist);
    }

    private static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private static double rad2deg(double rad) {
        return (rad * 180 / Math.PI);
    }

}
