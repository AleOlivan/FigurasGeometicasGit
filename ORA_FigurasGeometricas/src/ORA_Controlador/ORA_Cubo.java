package ORA_Controlador;
/* @author Olivan Rojas Alejandra*/
public class ORA_Cubo implements ORA_Figura {
    private double a;
    
    public ORA_Cubo(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    @Override
    public double getArea() {
        return 6 * Math.pow(getA(), 2);
    }
    @Override
    public double getVolumen() {
       return Math.pow(getA(), 3);
    }
    @Override
    public String toString() {
        return String.format("Cubo \n\ta.......%.2f"+"\n\tÁrea....%.2f"+"\n\tVolumen....%.2f", getA(), getArea(),getVolumen());  
    }
}
