class Human {
  private int age;      // private field
  String name;          // default access

  // Setter for age
  public void setAge(int age) {
    this.age = age;
  }

  // Getter for age
  public int getAge() {
    return age;
  }
}

public class Encapsulation {
  public static void main(String[] args) {
    Human obj = new Human();
    obj.setAge(20);          
    obj.name = "R";          

    System.out.println("Name: " + obj.name);
    System.out.println("Age: " + obj.getAge());  
  }
}
