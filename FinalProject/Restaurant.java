public class Restaurant {
  private String restaurantName; //Bob's Restaurant
  private int numberOfSeats; //50
  private String restaurantAddress; //1001 UOIT Drive, Oshawa, Ontario, L1R1Q1
  private String restaurantType; //chinese, american, italian

  public Restaurant(String restaurantName,
                    int numberOfSeats,
                    String restaurantAddress,
                    String restaurantType) {
    this.restaurantName = restaurantName;
    this.numberOfSeats = numberOfSeats;
    this.restaurantAddress = restaurantAddress;
    this.restaurantType = restaurantType;
  }

  public String getRestaurantName() { return restaurantName; }
  public void setRestaurantName(String resName) { restaurantName = resName; }

  public int getNumberOfSeats() { return numberOfSeats; }
  public void setNumberOfSeats(int numSeats) { numberOfSeats = numSeats; }

  public String getRestaurantAddress() { return restaurantAddress; }
  public void setRestaurantAddress(String resAddy) { restaurantAddress = resAddy; }

  public String getRestaurantType() { return restaurantType; }
  public void setRestaurantType(String resType) { restaurantType = resType; }

}
