public class Division extends OperacionMatematica {
    @Override
    public double realizarOperacion(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return Double.NaN; // Indica error
        }
        return a / b;
    }
}
