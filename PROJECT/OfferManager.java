package PROJECT;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OfferManager {
    private static List<Offer> offers = new ArrayList<>();

    public static void addOffer(Offer offer) {
        offers.add(offer);
        System.out.println("Offer added: " + offer.getCarType() + " in " + offer.getLocation());
    }

    public static List<Offer> getOffersByLocation(String location) {
        System.out.println("Searching for offers in: " + location);
        List<Offer> result = offers.stream()
                                   .filter(offer -> offer.getLocation().equalsIgnoreCase(location))
                                   .collect(Collectors.toList());
        System.out.println("Found offers: " + result.size());
        return result;
    }

}
