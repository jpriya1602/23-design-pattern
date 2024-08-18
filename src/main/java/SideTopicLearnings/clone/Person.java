package SideTopicLearnings.clone;

public class Person implements Cloneable {

    int age;
    String person;
    String[] subjects = {"tamil", "english", "maths"};

    Person(int age, String person) {
        this.age = age;
        this.person = person;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main(String[] args) {
        Person person1 = new Person(20, "John");
        Person person2 = null;
        try {
            person2 = (Person) person1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(person1.age + " " + person1.person + " " + person1.subjects);
        System.out.println(person2.age + " " + person2.person + " " + person2.subjects);
    }


//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        // Perform shallow copy first
//        Person cloned = (Person) super.clone();
//        // Deep copy the subjects array
//        cloned.subjects = subjects.clone();
//        return cloned;
//    }
    /***
     * 1. Perform shallow copy first
     * 2. Deep Copy Mutable Reference Fields
     * 3. Return the cloned object
     * Handle Non-Cloneable Fields:
     *
     * If there are fields that cannot be cloned (such as open file handles or database connections),
     * set these fields to null or initialize them appropriately.
     * cloneObject.connection = null;
     */
}

