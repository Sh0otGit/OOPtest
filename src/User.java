public class User {
    private String name;
    private int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String n){
        this.name = n;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int n){
        this.age = n;
    }
}

