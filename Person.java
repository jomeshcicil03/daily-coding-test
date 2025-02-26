import java.util.*;

public class Person{
    String name;
    int age;
    
    public void introduce(String name,int age) {
      this.name=name;
      this.age=age;
      
      System.out.println(name);
      System.out.println(age);
  }
  public static void main(String[]arg) {
    Person a =new Person();
    a.introduce("Tharkuri",17);
  }
}
