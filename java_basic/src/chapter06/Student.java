package chapter06;

public class Student {
    public String name;
    public String department;
    public int number;

    public String toString() {
        return "이름 : "+name+"\n"+"학번 : "+number+"\n"+"소속학과 : "+department+"\n";
    }

    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }

    public int getNumber() {
        return number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

