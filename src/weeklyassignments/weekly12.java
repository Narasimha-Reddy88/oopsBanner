public class weekly12 {
    public static void main(String[] args) {
        // Define city names and traveler name
        String fromCity = "Chennai";
        String viaCity = "Bangalore";
        String toCity = "Hyderabad";
        String name = "Veera";

        // Distance from fromCity to viaCity (in km)
        double distanceFromToVia = 350.5;

        // Time taken from fromCity to viaCity (in minutes)
        int timeFromToVia = 4 * 60 + 4; // 4 hours 4 minutes

        // Distance from viaCity to toCity (in km)
        double distanceViaToFinalCity = 211.8;

        // Time taken from viaCity to toCity (in minutes)
        int timeViaToFinalCity = 4 * 60 + 25; // 4 hours 25 minutes

        // Calculate total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print travel details
        System.out.println("Traveler: " + name);
        System.out.println("Route: " + fromCity + " → " + viaCity + " → " + toCity);
        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Time: " + totalTime + " minutes");
    }
}