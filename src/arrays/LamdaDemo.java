package arrays;

interface Adder
{
    public int add(int a , int b);

}

class Myadder implements Adder
{
    @Override
    public int add(int a, int b)
    {
        return a+b;
    }
}
public class LamdaDemo
{
    public static void main(String[] args)
    {
        Adder adder = new Myadder();
        System.out.println(adder.getClass());
        System.out.println(adder.add(4, 5));


        Adder adder2 = new Adder()
        {

            public int add(int a ,int b)
            {
                return a+b;
            }
        };

        adder2.add(4, 8);
        adder2.add(9, 9);

    }

}
