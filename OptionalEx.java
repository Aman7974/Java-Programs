import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Student {
    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name; 
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    

    

}

public class OptionalEx {
    public static void main(String[] args){

        List<String> names =  Arrays.asList("Aman","Nishant","Parteek","Satyam","Ankit");


        // String name = names.stream()
        //                   .filter(str -> str.contains("ee"))
        //                   .findAny()
        //                   .orElse("Not Found");

        //                   System.out.println(name);


        //Method Referance 

        // List<String> uNames = names.stream()
        //                     .map(String::toUpperCase) //Method Referance
        //                     .toList();

        // uNames.forEach(System.out::println); //Method Referance

        //Constructor Referance

        List<Student> students = new ArrayList<>();
        students = names.stream()
                        .map(Student::new) //Constructor Referance
                        .toList();

        System.out.println(students);



    }  
}
    
