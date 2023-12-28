public class Person implements Comparable<Person> {

    private int age;

    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    // if i am bigger than other return positive integer (i.e 1)
    // if i am smaller than other return negative integer (i.e -1)
    // if i am equal to other return 0
    @Override
    public int compareTo(Person other) {

//        Below code to compare by age
//        if (this.age > other.age) {
//            return 1;
//        } else if (this.age < other.age) {
//            return -1;
//        }
//
//        return 0;

        // Below code to compare by name
        return this.name.compareTo(other.name);
    }
}
