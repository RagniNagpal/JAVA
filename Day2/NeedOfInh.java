package Day2;

class Calc{
  public int add(int n1, int n2){
    return n1+n2;
  }

  public int sub(int n1, int n2){
    return n1-n2;
  }

}

public class NeedOfInh {
  public static void main(String[] args) {
    Calc obj=new Calc();
    int r1=obj.add(4,5);
    int r2=obj.sub(7,3);
    System.out.println(r1 + " " + r2);
  }
}
