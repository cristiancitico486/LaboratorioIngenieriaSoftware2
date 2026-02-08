package Entrega1;

public class Square extends Figure{
    private String name = "Square";

    public Square(double x1) {
        //aca lo mismo , solo necesitamos un parametro , para no extender esto usemos uno de los otorgados
        // por el constructor de la clase padre y dejamos el otro en 0
        super(x1, 0.0);
    }

    @Override
    public double calculateArea() {  
        return getX1() * getX1();
    }

    @Override
    public double getPerimeter() {
        return getX1()*4;
    }

    public String getName() {
        return name;
    }
}
