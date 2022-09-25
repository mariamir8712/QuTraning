package ru.vsegdada;

public class Application {
    public static void main(String[] args) {
        Skynet skynet = new Skynet();
        // Skynet.setTerminatorsCount(19);
        skynet.startRevolution();
        System.out.println(skynet.getTerminatorsCount());
        System.out.println(skynet.isRiseRevolution());

    }

}
