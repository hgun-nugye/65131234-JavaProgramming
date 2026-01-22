import java.util.ArrayList;
import java.util.List;

public class Student {
    String id;
    String name;
    int age;
    String address;
    float dtb;

    public Student(String id, String name, int age, String address, float dtb) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.dtb = dtb;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    public void PrintInfo() {
        System.out.println("ID: " + id + "\t Name: " + name + "\t Age: " + age + "\t Address: " + address + "\t DTB: " + dtb);
    }

    public Student CompareTo(Student other) {
        if (this.dtb > other.dtb) {
            return this;
        } else {
            return other;
        }
    }

    public void Add(List<Student> list, Student other) {
        list.add(other);
    }

    public void Delete(List<Student> list, Student other) {
        list.remove(other);
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> dsStudent = new ArrayList<>();

        Student student1 = new Student("S001", "Alice", 20, "123 Main St", 8.5f);
        Student student2 = new Student("S002", "Bob", 22, "456 Elm St", 9.0f);

        System.out.print("Student 1 Info: ");
        student1.PrintInfo();

        System.out.print("Student 2 Info: ");
        student2.PrintInfo();

        student1.Add(dsStudent, student1);
        student1.Add(dsStudent, student2);
        student1.Add(dsStudent, new Student("S003", "Charlie", 21, "789 Oak St", 7.5f));

        System.out.println("\nStudent in List: ");
        for(Student i: dsStudent) {
            i.PrintInfo();
        }

        Student topStudent;
        topStudent = dsStudent.getFirst();
        for (Student s : dsStudent) {
            topStudent = topStudent.CompareTo(s);
        }
        System.out.println("\nTop Student Info: ");
        topStudent.PrintInfo();

        student1.Delete(dsStudent, student1);
        System.out.println("\nAfter Deletion:");
        for(Student i: dsStudent) {
            i.PrintInfo();
        }
    }
}
