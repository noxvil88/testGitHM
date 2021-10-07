public class Personal {


    private  String name;
    private  String position;
    private  String email;
    private  String phone;
    private  int salary;
    private  int age;


    public Personal(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    int getSalary() {
        return salary;
    }

    String getName() {
        return name;
    }

    String getPosition() {
        return position;
    }
    String getEmail() {
        return email;
    }

    String getPhone() {
        return phone;
    }
    String allInformation() {
        return this.name + this.position + this.email + this.phone + this.salary + " " + this.age;
    }
}
