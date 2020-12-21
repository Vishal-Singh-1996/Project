package com.company;
class Base{
    int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base class");
        this.x = x;
    }
    Base()
    {
        System.out.println("I am a constructor");
    }

}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
//        Base b=new Base();
        Derived b=new Derived();
        b.setX(5);
        System.out.println(b.getX());
    }

}
