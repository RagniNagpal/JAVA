package Day2;

public class Anonymous {
  public Anonymous(){
    System.out.println("object created");
  }
  public void show(){
    System.out.println("A show");
  }
  public static void main(String[] args) {
    // int marks;
    // marks=99;

    // Anonymous obj;  //reference 
    // obj = new Anonymous();   // object creted and assigning it to obj
    // obj.show();


    new Anonymous(); // anonymous obj  dont have name have reference object
  }
}
