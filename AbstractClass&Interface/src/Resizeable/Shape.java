package Resizeable;

public abstract class Shape implements Resizeable {
    private String color = "black";
    private boolean filled = true;

    public Shape(){

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public static void printShape(Shape[] shape){
        for (Shape x : shape){
            System.out.println(x.toString());
        }
    }

    abstract double getArea();


    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }


}
