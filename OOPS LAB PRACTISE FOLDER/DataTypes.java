class Student
{
    int id;
    String name;

    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    void display()
    {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}

public class DataTypes
{
    public static void main(String[] args)
    {

        
        byte b = 10;
        short s = 200;
        int i = 5000;
        long l = 15000000000L;

        float f = 5.75f;
        double d = 19.999;

        char c = 'A';
        boolean flag = true;

        

        
        String str = "Hello Java";

        
        int arr[] = {10, 20, 30};

        
        Student st = new Student(101, "Avanthi");

        
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Char value: " + c);
        System.out.println("Boolean value: " + flag);

        
        System.out.println("String value: " + str);

        System.out.println("Array elements:");
        for(int x : arr)
        {
            System.out.println(x);
        }

        System.out.println("Object details:");
        st.display();
    }
}