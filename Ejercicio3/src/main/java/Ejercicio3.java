public class Ejercicio3 {
    public static void main (String args[])
    {
        System.out.println("Inicio");

        int doble = 0;

        doble = RetornaDoble(4);
        System.out.println("El valor de doble es: " + doble  );
    }

    public static int RetornaDoble (int num)
    {
        return num * 2;
    }

}
