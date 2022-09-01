package uml_test;

public abstract class Employee {

    public int id;
    public String name;

    public Employee() {
        id = 0;
        name = "";

    }
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
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
String printInfo(){
    return "id: "+id+"  "+"name: " +name;
}    

}
