package Person;
public class Person {
    //FIELDS
    String name;
    int age;


    //METHODS/FUNCTIONS/etc.
    public void say_name() {
        System.out.println("My name is " + name + " and I'm "+ age + " years old.");
    }

    public void have_birthday() {
        age++;
    }
}
