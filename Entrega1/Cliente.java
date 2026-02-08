package Entrega1;
import java.util.ArrayList;
import java.util.List;



public class Cliente {
    public static void main(String[] args) {
        Figure fig1 = new Circle(1.0); // radio
        Figure fig2 = new Square(2.3); // lado
        Figure fig3 = new Triangle(4.2, 4.5); // base y altura
        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);
        for (Figure fig : figures) {
            System.out.println("Area " + fig.getName() + " " + fig.calculateArea());
            System.out.println("Perimeter: " + fig.getPerimeter());
            System.out.println("-----------------------------");
        }
    }

}
