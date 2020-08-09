package ORA_Controlador;
/* @author Olivan Rojas Alejandra */
public class ORA_Cilindro extends ORA_Esfera {
    private double h;
    
    public ORA_Cilindro( double r, double h) {
        super(r);
        this.h = h;
    }
    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }
    @Override
    public double getVolumen() {
        return Math.PI*Math.pow(getR(), 2)*getH();
    }
    @Override
    public double getArea() {
        return (2*Math.PI*getR()*getH())+(2*Math.PI*Math.pow(getR(), 2));
    }
    @Override
    public String toString() {
        return String.format("Cilindro \n\tr.......%.2f"
                            +"\n\th.......%.2f"
                            +"\n\tÁrea....%.2f"
                            +"\n\tVolumen....%.2f", 
                            getR(),
                            getH(),
                            getArea(),
                            getVolumen());   
    }    
}
