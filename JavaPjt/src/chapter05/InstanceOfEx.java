package chapter05;

class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

public class InstanceOfEx {
   static void print(Person p) { // Person p = new Student() ��ĳ����
      // Person p = new Person() ��ĳ����
      if (p instanceof Person) { // p�� Person�� ��ü���� Ȯ�� (boolean)
         System.out.print("Person ");
      }
      // Person p = new Student() ��ĳ����
      if (p instanceof Student) { // p�� Student�� ��ü���� Ȯ�� (boolean)
         System.out.print("Student ");
      }
      // Person p = new Researcher() ��ĳ����
      if (p instanceof Researcher) { // p�� Researcher�� ��ü���� Ȯ�� (boolean)
         System.out.print("Researcher ");
      }
      // Person p = new Professor() ��ĳ����
      if (p instanceof Professor) { // p�� Professor�� ��ü���� Ȯ�� (boolean)
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