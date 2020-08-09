package ORA_Controlador;
/* @author Olivan Rojas Alejandra */
public class ORA_Cono extends ORA_Cilindro{
    private double g;    
    public ORA_Cono(double r, double h, double g) {
        super(r, h);
        this.g = g;
    }
    public double getG() {
        return g;
    }
    public void setG(double g) {
        this.g = g;
    }
    @Override
    public double getArea() {
        return (Math.PI*getR()*getG())*(Math.PI*Math.pow(getR(), 2));
    }
    @Override
    public double getVolumen() {
        return ((Math.PI*Math.pow(getR(), 2))*getH())/3;
    }
    @Override
    public String toString() {
    return String.format("Cono \n\tr.......%.2f"
                            +"\n\th.......%.2f"
                            +"\n\tg.......%.2f"
                            +"\n\tÁrea....%.2f"
                            +"\n\tVolumen....%.2f", 
                            getR(), 
                            getH(),
                            getG(),
                            getArea(),
                            getVolumen());
    }   
}