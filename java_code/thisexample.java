package java_code;

public class thisexample {
    int a;
    int b;

    public void set(int a, int b) {
        b=a;
        this.b = b;
    }

    void display() {
        System.out.println("a: " + a + ", b: " + b);
    }
}

class test {
    public static void main(String[] args) {
        thisexample object = new thisexample();
        object.set(10, 20);
        object.display();
    }
}