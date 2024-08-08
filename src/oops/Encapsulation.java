package oops;

class human
{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        human obj = new human();
        obj.setAge(21);
        obj.setName("mourya");

        System.out.println(obj.getAge()+" : "+ obj.getName());
    }
}
