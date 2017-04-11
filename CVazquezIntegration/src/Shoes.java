public class Shoes {

  // Declaring the fields
  private String brand;
  private String color;
  private double shoeSize;

  // Method Definitions (will be set by user)
  public Shoes(String brandName, String colorOfShoe, double myShoeSize) {
    brand = brandName;
    color = colorOfShoe;
    shoeSize = myShoeSize;
  }

  public Shoes() {
    brand = "Not Set";
    color = "Not Set";
    shoeSize = 0;
  }

  public void setBrand(String brandName) {
    brand = brandName;
  }

  public void setColor(String colorOfShoe) {
    color = colorOfShoe;
  }

  public void setShoeSize(double myShoeSize) {
    shoeSize = myShoeSize;
  }

  public String getBrand() {
    return brand;
  }

  public String getShoeColor() {
    return color;
  }

  public double getShoeSize() {
    return shoeSize;
  }
}
