
public class encapsulation1{
    private String name;
    private int age;
    public encapsulation1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    public int getAge() {
        return age;
    }

   
    public void setAge(int age) {
        if (age > 0) { // Simple validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        encapsulation1 person = new encapsulation1("John Doe", 25);
        person.displayInfo();
        person.setName("Jane Doe");
        person.setAge(30);
        person.displayInfo();
        person.setAge(-5);
    }
}
