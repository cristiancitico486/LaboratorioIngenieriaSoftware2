package Entrega1;

public class Circle extends Figure {
    private double radio;

    private String name = "Circle";

    public Circle(double radio) {
        //necesario para los atributos heredados super(x1,y1);
        // pero como circle no usa ninguno , usemos 0 y dejamos solo el double que se pide en el codigo inicial
        //Figure fig1 = new Circle(1.0); 
        //De esta forma no metemos las variables de la clase padre en el parametro del constructor
        super(0.0, 0.0);
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        return 3.1415 * radio * radio;
    }
    //acá el uml dice getPerimeter pero en el contrato es calculatePerimeter , la cambie a getPerimeter para ajustar al codigo que se nos dió
    @Override
    public double getPerimeter() {
        return 2 * 3.1415 * radio;
    }

    public String getName() {
        return name;
    }
}
