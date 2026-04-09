class Calculator {

    public int add(int a, int b) {
        System.out.println("Base add()");
        return a + b;
    }

    protected void display() {
        System.out.println("Calculator display()");
    }

    private void show() {
        System.out.println("Private show()");
    }

    public void accessPrivate() {
        show();
    }
}

class AdvancedCalculator extends Calculator {

    @Override
    public int add(int a, int b) {
        System.out.println("Advanced add()");
        return a + b + 10;
    }

    @Override
    protected void display() {
        System.out.println("Advanced display()");
    }

    public void show() {
        System.out.println("New show()");
    }
}

public class polymorphism {

    public static void main(String[] args) {

        Calculator ref = new AdvancedCalculator();

        System.out.println("Result: " + ref.add(5, 5));
        ref.display();
        ref.accessPrivate();
    }
}