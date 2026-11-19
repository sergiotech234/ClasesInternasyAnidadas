public class Main {
    public static void main(String[] args) {

        // Crear una casa
        Casa casa = new Casa("Calle Mayor 25");

        // Crear una habitación utilizando la casa
        Casa.Habitacion habitacion =
                casa.new Habitacion("Salon");


        // Mostrar información de la habitación
        habitacion.imprimir();

        System.out.println();

        // Crear una constructora SIN crear una casa
        Casa.Constructora constructora =
                new Casa.Constructora("Obras Sur");

        // Mostrar información de la constructora
        constructora.imprimir();
    }
}