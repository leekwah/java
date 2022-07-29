package chapter05;

class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

public class InstanceOfEx {
   static void print(Person p) { // Person p = new Student() 업캐스팅
      // Person p = new Person() 업캐스팅
      if (p instanceof Person) { // p가 Person의 객체인지 확인 (boolean)
         System.out.print("Person ");
      }
      // Person p = new Student() 업캐스팅
      if (p instanceof Student) { // p가 Student의 객체인지 확인 (boolean)
         System.out.print("Student ");
      }
      // Person p = new Researcher() 업캐스팅
      if (p instanceof Researcher) { // p가 Researcher의 객체인지 확인 (boolean)
         System.out.print("Researcher ");
      }
      // Person p = new Professor() 업캐스팅
      if (p instanceof Professor) { // p가 Professor의 객체인지 확인 (boolean)
         System.out.print("Professor ");
      }
      System.out.println();
   }
   public static void main(String[] args) {
      System.out.print("new Student() ->\t"); print(new Student()) ;
      System.out.print("new Researcher() ->\t"); print(new Researcher()) ;
      System.out.print("new Professor() ->\t"); print(new Professor()) ;
   }
}