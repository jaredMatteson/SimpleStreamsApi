public class Person {
    public String Name;
    public int age;

    Person(){}

    Person(String Name, int age){
        this.age = age;
        this.Name = Name;
    }

    public String toString() {
        return Name;
    }

    public int retunrAge() {
        return age;
    }
    public String msg(){
        String MSG;
        MSG = Name+" Age: "+ age;
        return MSG;
    }

}
