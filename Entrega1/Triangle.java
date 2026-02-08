package Entrega1;

public class Triangle extends Figure {
    private String name = "Triangle"; 

    public Triangle(double x1, double y1) {
        super(x1, y1);
    }
    
    @Override
    public double calculateArea() {
        return (getX1() * getY1()) / 2;
    }

    @Override
    public double getPerimeter() {
        //esto funciona si asumimos que es un triangulo rectangulo , caso contrario no funciona
       return getX1() + getY1() + Math.sqrt(getX1()*getX1() + getY1()*getY1());
       //acá se puede mejorar y especificar con otras clases de triangulo
       //y sus variantes con sus calculos de perimetro 
    }
    
    public String getName() {
        return name;
    }
}
