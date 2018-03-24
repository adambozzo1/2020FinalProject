
//Reservation Class containing information on reservation

public class Reservation {
    private String name;
    private int numberOfPeople;
    private int time;
    private String reservationFormat;
    public Reservation(String name, int numberOfPeople, int time){
        this.time = time;
        this.name = name;
        this.numberOfPeople = numberOfPeople;
        reservationFormat = name + ": Number of People:" + numberOfPeople + " Time:";
        //implement a file output to set contents of reservation file with these values
    }

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
