import com.company.*;

public class Main {


    public static void main(String[] args) {
        Figuras[] v = new Figuras[4];
        v[0] = new Circulo(3);
        v[1] = new Cuadrado(2);
        v[2] = new Rectangulo(2, 4);
        v[3] = new TrianguloEQ(2, 3);
    }
}