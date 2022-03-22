enum MySingleton {
    INSTANCE;
    int value;
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        MySingleton singleton = MySingleton.INSTANCE;
        singleton.setValue(4);
        System.out.println(singleton.getValue());

        MySingleton singleton1 = MySingleton.INSTANCE;
        singleton1.setValue(8);
        System.out.println(singleton1.getValue());

        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());
    }
}
