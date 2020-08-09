package ORA_Controlador;
/* @author Olivan Rojas Alejandra  */
public class ORA_Paralelepipedo extends ORA_Cubo {
    private double b;
    private double h;

    public ORA_Paralelepipedo(double a, double b, double h) {
        super(a);
        this.b = b;
        this.h = h;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }
    @Override
    public double getVolumen() {
        return getA() * getB() * getH();
    }
    @Override
    public double getArea() {
        return 2*(getA() * getB()+getB()*getH()+getA() *getH());
    }
    public String toString() {
     return String.format("Paralelepipedo " 
                            +"\n\ta.......%.2f"
                            +"\n\tb.......%.2f"
                            +"\n\th.......%.2f"
                            +"\n\tÁrea....%.2f"
                            +"\n\tVolumen....%.2f", 
                            getA(),
                            getB(),
                            getH(),
                            getArea(),
                            getVolumen());
    }
}
