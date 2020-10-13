import com.company.*;

import java.util.Arrays;

public class GestorClases {

    public static double suma(Figuras[] v){
        double res = 0;
        for (Figuras f : v) {
            res += f.area();
        }
        return res;
    }
    public static void sort(Figuras[] v){
        Arrays.sort(v);
    }

    public static void main(String[] args) {
        Figuras[] v = new Figuras[4];
        v[0] = new Circulo(3);
        v[1] = new Cuadrado(2);
        v[2] = new Rectangulo(2, 4);
        v[3] = new TrianguloEQ(2, 3);

        double r = GestorClases.suma(v);

        System.out.println(r);
        System.out.println(Arrays.asList(v));
        GestorClases.sort(v);
        System.out.println(Arrays.asList(v));
    }
}