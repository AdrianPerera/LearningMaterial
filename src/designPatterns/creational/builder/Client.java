package src.designPatterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        ApartmentBuilder builder = new ApartmentBuilder();

        Apartment ap1 = builder.setSqm(25).setRooms(2).setCity("London").setArea("Kensington").setKitchen(true).build();

        ap1.display();
    }
}
