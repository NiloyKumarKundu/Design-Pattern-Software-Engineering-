interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle drawn");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square drawn");
    }
}


class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle drawn");
    }
}

class Factory {
    public Shape createShape(String shapeType) {
        return switch (shapeType) {
            case "Circle" -> new Circle();
            case "Square" -> new Square();
            case "Rectangle" -> new Rectangle();
            default -> throw new IllegalArgumentException("Shape type unknown");
        };
    }
}

public class Main {
    public static void main(String[] args) {
        Factory shapeFactory = new Factory();
        shapeFactory.createShape("Circle").draw();
        shapeFactory.createShape("Rectangle").draw();
        shapeFactory.createShape("Square").draw();
        shapeFactory.createShape("Triangle").draw();
    }
}
