interface Workable {
    void work();
}
abstract class Human implements Workable{

    private String name;
    private int age;
    private String hometown;
    private String currentPlace;

    // Constructor
    public Human(String name, int age, String hometown, String currentPlace) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.currentPlace = currentPlace;
    }

    // Getter & Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getHometown() { return hometown; }
    public void setHometown(String hometown) { this.hometown = hometown; }

    public String getCurrentPlace() { return currentPlace; }
    public void setCurrentPlace(String currentPlace) { this.currentPlace = currentPlace; }

    public void introduce() {
        System.out.println("My name is " + name + ", I'm " + age + " years old.");
        System.out.println("I'm from " + hometown + " and now I live in " + currentPlace + ".");
    }

    public abstract void work();
}

class Student extends Human {

    private String schoolName;

    public Student(String name, int age, String hometown, String currentPlace, String schoolName) {
        super(name, age, hometown, currentPlace);
        this.schoolName = schoolName;
    }
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    @Override
    public void work() {
        // Polymorphism
        System.out.println(getName() + " is studying at " + schoolName + ".");
    }
}
class Worker extends Human {

    private String job;

    public Worker(String name, int age, String hometown, String currentPlace, String job) {
        super(name, age, hometown, currentPlace);
        this.job = job;
    }
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    @Override
    public void work() {
        // Đa hình (Polymorphism)
        System.out.println(getName() + " is working as a " + job + ".");
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student("N_Khang", 18, "An Giang", "TP.Cần Thơ", "FPT University");      //S là tên lớp s là tên biến
        Worker worker = new Worker("Sếp", 26, "An Giang", "TP.HCM", "Software Engineer");
        student.introduce();
        student.work();

        System.out.println("-----------------------------------");

        worker.introduce();
        worker.work();


        // đổi thông tin
        student.setCurrentPlace("TP.HCM");
        worker.setJob("Intern tại công ty ODK");
        worker.setName("N_Khang");


        System.out.println(student.getName() + " has moved to " + student.getCurrentPlace() + ".");
        System.out.println(worker.getName() + " is now " + worker.getJob() + ".");

    }

}
