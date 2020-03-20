public class Employee {

    private int id;
    private String name;

    public Employee ( Integer id, String name){
        this.id= id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }


}
