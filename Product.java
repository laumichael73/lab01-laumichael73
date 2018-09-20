public class Product
{
  //Fields
  private String name;
  private float unitPrice;
  
  //Names
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  //Unit Prices
  public float getUnitPrice()
  {
    return this.unitPrice;
  }
  
  public void setUnitPrice(float unitPrice)
  {
    this.unitPrice = unitPrice;
  }
  
  //Constructors
  public Product()
  {
    name = null;
    unitPrice = 0;
  }
  
  public Product(String name)
  {
    this.name = name;
    unitPrice = 0;
  }
  
  public Product(float unitPrice)
  {
    name = null;
    this.unitPrice = unitPrice;
  }
  
  public Product(String name, float unitPrice)
  {
    this.name = name;
    this.unitPrice = unitPrice;
  }
  
  //Methods
  //toString
  //name: unitPrice
  public String toString()
  {
    return (name + ": " + unitPrice);
  }
  
  //equals
  public static boolean equals(Product a, Product b)
  {
    if (a.getName().equals(b.getName()))
      if (a.getUnitPrice() == b.getUnitPrice())
      return true;
    else return false;
    else return false;
  }
}
