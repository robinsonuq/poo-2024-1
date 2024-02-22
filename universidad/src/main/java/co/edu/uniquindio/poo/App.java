package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
       Perro miPerrito = new Perro("Anyelo", "pitbull");

       for (int i = 0; i <=3; i++) {
        miPerrito.caminar(30);
       }

    }
}
