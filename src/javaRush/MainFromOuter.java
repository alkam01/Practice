package javaRush;

public class MainFromOuter {
    public static void main(String[] args) {
        Outer inn = new Outer();
        Outer.Inner inner = inn.new Inner();
        Outer.Nested nester = new Outer.Nested();
    }
}
