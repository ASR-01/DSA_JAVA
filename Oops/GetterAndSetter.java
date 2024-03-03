package Oops;

public class GetterAndSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.SetColor("Blue");
        System.out.println(p1.getColor());
        p1.SetTip(5);
        System.out.println(p1.getTip());
        p1.SetColor("yellow");
        System.out.println(p1.getColor());
    }
}

// this --> this Keyword is used to refer the current Object
class Pen {
    private String color;
    private int tip;

    // Getters
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    // Setters
    public void SetColor(String color) {
        this.color = color;
    }

    public void SetTip(int tip) {
        this.tip = tip;
    }

}