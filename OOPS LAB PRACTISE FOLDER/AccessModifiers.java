class AccessExample
{
    public int a = 10;      
    private int b = 20;      
    protected int c = 30;    
    int d = 40;               

    public void showPublic()
    {
        System.out.println("Public variable: " + a);
    }

    private void showPrivate()
    {
        System.out.println("Private variable: " + b);
    }

    protected void showProtected()
    {
        System.out.println("Protected variable: " + c);
    }

    void showDefault()
    {
        System.out.println("Default variable: " + d);
    }

    public void accessPrivate()
    {
        showPrivate();   
    }
}

public class AccessModifiers
{
    public static void main(String[] args)
    {
        AccessExample obj = new AccessExample();

        System.out.println("Public: " + obj.a);
        obj.showPublic();

        obj.accessPrivate();   

        System.out.println("Protected: " + obj.c);
        obj.showProtected();

        System.out.println("Default: " + obj.d);
        obj.showDefault();
    }
}