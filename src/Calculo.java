public class Calculo {
    public static void area(double lado) {
        System.out.println("Área do quadrado é:" + lado * lado);
    }
    public static void area(double lado1, double lado2){
        System.out.println("Area do Retangulo é:" + lado1 * lado2);
    }
    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio" + ((baseMaior*baseMenor)*altura)/2);
    }
    public static void area(float diagonal1, Float diagonal2){
        System.out.println("Área do trapézio" + (diagonal1*diagonal2)/2);
    }

}
