package sample;

public class Reservation {

    // instance variables
    private String name;
    private int numberOfPeople, time;
    private String reservationFormat;

    // Constructors
    public Reservation(String name, int numberOfPeople, int time){
        this.time = time;
        this.name = name;
        this.numberOfPeople = numberOfPeople;
        reservationFormat = name + ": Number of People:" + numberOfPeople + " Time:";
        //implement a file output to set contents of reservation file with these values
    }

    // setters & getters
    public String getName(){
        return name;
    }
    public int getNumberPeople(){
        return numberOfPeople;
    }
    public int getTime(){
        return time;
    }
    public String getReservationFormat(){
        return reservationFormat;
    }

}
