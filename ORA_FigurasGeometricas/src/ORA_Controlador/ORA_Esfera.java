package ORA_Controlador;
/* @author Olivan Rojas Alejandra */
public class ORA_Esfera  implements ORA_Figura{
    private double r;

    public ORA_Esfera(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    @Override
    public double getArea() {
        return 4*Math.PI*Math.pow(getR(), 2);
    }
    @Override
    public double getVolumen() {
        return (4*Math.PI*Math.pow(getR(), 3))/3;
    }
    @Override
    public String toString() {
        return String.format("Esfera \n\tr.......%.2f"
                            +"\n\tÁrea....%.2f"
                            +"\n\tVolumen....%.2f", 
                            getR(), 
                            getArea(),
                            getVolumen());
    }
}
