package Entrega1;

//la idea es probar cada metodo individualmente y evaluar el éxito de cada método a traves de una prueba con valores 
// y esperando el resultado correcto , si el resultado es correcto se muestra un mensaje de éxito 
// y si no, se muestra un mensaje de error con el resultado obtenido y el esperado
public class Test {
    
    private static int testsPassed = 0;
    private static int testsFailed = 0;
    
    public static void main(String[] args) {
        // circulo
        testCircleArea();
        testCirclePerimeter();
        
        // ciuadrado
        testSquareArea();
        testSquarePerimeter();
        
        //trigangulo
        testTriangleArea();
        testTrianglePerimeter();
        
        // Resumen
        printSummary();
    }
    
    // ========== CÍRCULO ==========
    private static void testCircleArea() {
        try {
            Circle circle = new Circle(5.0);
            double expected = 3.1415 * 5.0 * 5.0; // 78.5375
            double actual = circle.calculateArea();
            
            // Permitimos pequeño margen de error por decimales
            if (Math.abs(actual - expected) < 0.01) {
                println(" Circle.calculateArea() con radio=5", true);
            } else {
                println(" Circle.calculateArea() esperaba " + expected + " pero obtuvo " + actual, false);
            }
        } catch (Exception e) {
            println(" Circle.calculateArea() lanzó excepción: " + e.getMessage(), false);
        }
    }
    
    private static void testCirclePerimeter() {
        try {
            Circle circle = new Circle(3.0);
            double expected = 2 * 3.1415 * 3.0; // 18.849
            double actual = circle.getPerimeter();
            
            if (Math.abs(actual - expected) < 0.01) {
                println(" Circle.getPerimeter() con radio=3", true);
            } else {
                println(" Circle.getPerimeter() esperaba " + expected + " pero obtuvo " + actual, false);
            }
        } catch (Exception e) {
            println(" Circle.getPerimeter() lanzó excepción: " + e.getMessage(), false);
        }
    }
    
    // ========== CUADRADO ==========
    private static void testSquareArea() {
        try {
            Square square = new Square(4.0);
            double expected = 16.0;
            double actual = square.calculateArea();
            
            if (actual == expected) {
                println("Square.calculateArea() con lado=4", true);
            } else {
                println(" Square.calculateArea() esperaba " + expected + " pero obtuvo " + actual, false);
            }
        } catch (Exception e) {
            println(" Square.calculateArea() lanzó excepción: " + e.getMessage(), false);
        }
    }
    
    private static void testSquarePerimeter() {
        try {
            Square square = new Square(5.0);
            double expected = 20.0;
            double actual = square.getPerimeter();
            
            if (actual == expected) {
                println(" Square.getPerimeter() con lado=5", true);
            } else {
                println(" Square.getPerimeter() esperaba " + expected + " pero obtuvo " + actual, false);
            }
        } catch (Exception e) {
            println(" Square.getPerimeter() lanzó excepción: " + e.getMessage(), false);
        }
    }
    
    // ========== TRIÁNGULO ==========
    private static void testTriangleArea() {
        try {
            Triangle triangle = new Triangle(6.0, 4.0);
            double expected = (6.0 * 4.0) / 2; // 12.0
            double actual = triangle.calculateArea();
            
            if (actual == expected) {
                println(" Triangle.calculateArea() con base=6, altura=4", true);
            } else {
                println("✗ Triangle.calculateArea() esperaba " + expected + " pero obtuvo " + actual, false);
            }
        } catch (Exception e) {
            println("✗ Triangle.calculateArea() lanzó excepción: " + e.getMessage(), false);
        }
    }
    
    private static void testTrianglePerimeter() {
        try {
            Triangle triangle = new Triangle(3.0, 4.0);
            // Para triángulo rectángulo: 3 + 4 + 5 = 12
            double expected = 3.0 + 4.0 + Math.sqrt(3.0*3.0 + 4.0*4.0);
            double actual = triangle.getPerimeter();
            
            if (Math.abs(actual - expected) < 0.01) {
                println(" Triangle.getPerimeter() con base=3, altura=4", true);
            } else {
                println(" Triangle.getPerimeter() esperaba " + expected + " pero obtuvo " + actual, false);
            }
        } catch (Exception e) {
            println(" Triangle.getPerimeter() lanzó excepción: " + e.getMessage(), false);
        }
    }
    
    // ========== UTILIDADES ==========
    private static void println(String message, boolean passed) {
        System.out.println(message);
        if (passed) {
            testsPassed++;
        } else {
            testsFailed++;
        }
    }
    
    private static void printSummary() {
        System.out.println("\n=== RESUMEN ===");
        System.out.println("Pruebas pasadas: " + testsPassed);
        System.out.println("Pruebas fallidas: " + testsFailed);
        System.out.println("Total: " + (testsPassed + testsFailed));
        
        if (testsFailed == 0) {
            System.out.println("\n Todas las pruebas pasaron!");
        } else {
            System.out.println("\n Algunas pruebas fallaron");
        }
    }
}
