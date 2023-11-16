package lk.ijse.designpattern.structural.decorator_design_pattern;

public class Circle implements Shape {

    public Circle(){
        System.out.println("It's Circle");
    }

    @Override
    public void draw() {
        System.out.println("Circle Drawed");
    }
}
