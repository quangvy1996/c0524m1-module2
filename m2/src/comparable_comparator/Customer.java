package comparable_comparator;

public class Customer implements Comparable<Customer> {
    private int id;
    private String name;
    private int age;

    public Customer() {
    }

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        if (this.getAge()-o.getAge()==0){
            return this.getName().compareTo(o.getName());
        }
        return this.getAge()-o.getAge();
    }
}
