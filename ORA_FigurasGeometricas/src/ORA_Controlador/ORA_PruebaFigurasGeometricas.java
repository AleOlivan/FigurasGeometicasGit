package ORA_Controlador;
/* @author Olivan ROjas Alejandra  */
public class ORA_PruebaFigurasGeometricas {

    public static void main(String[] args) {
       
        ORA_Cubo rubick = new ORA_Cubo(5);
        System.out.println(rubick);
        
        ORA_Paralelepipedo tabique = new ORA_Paralelepipedo(15, 25, 10);
        System.out.println(tabique);
        
        ORA_Esfera pelota = new ORA_Esfera(2);
        System.out.println(pelota);
        
        ORA_Cilindro rotoplas = new ORA_Cilindro(.80, 1.5);
        System.out.println(rotoplas);
        
        ORA_Cono barquillo = new ORA_Cono(3, 7, 2);
        System.out.println(barquillo);
    }
}
