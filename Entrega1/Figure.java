package Entrega1;

public abstract class Figure {
    //de acuerdo al uml son atributos privados
    private double x1;
    private double y1;
    
    //metodos del contrato sin implementar
    public abstract double calculateArea();
    public abstract double getPerimeter();
    //variable adicional para mostrar el nombre de la figura, no se especifica en el contrato pero 
    //queria hacerlo para mostrar el polimorfismo en la clase cliente
    public abstract String getName();

    //constructor clásico
    public Figure(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }
    public void setY1(double y1) {
        this.y1 = y1;
    }
    public double getX1() {
        return x1;
    }
    public double getY1() {
        return y1;
    }
}