public class Main {

    public static void main(String[] args) {
        Cat myCat = new Cat(4,"Misifu",3.0f,5);
        Cat myCat2 = new Cat(4, "Garfield", 80.0f, 8);

        // Presentamos el gato con los atributos
        System.out.println("mi gato se llama " + myCat.name);
        System.out.println("Tiene " + myCat.numPatas + " patas");
        // No se puede acceder directamente a los atributos privados.
        // System.out.println("Su edad es de: " + myCat.edad);
        System.out.println("\n");

        System.out.println("Hola soy " + myCat2.name);
        System.out.println("Tengo " + myCat2.numPatas + " patas");
        System.out.println("\n");

        // aca definimos el gato de otra manera automatica para no estar haciendolo manual cada vez que agreguemos
        // un gato

        myCat2.presentarse();
        myCat.mostrarFoto();
        myCat2.comer(30.0f);
        myCat2.comer(80.0f);
        myCat2.caminar(30000f);
        System.out.println("\n");

        // myCat.presentarse();

    }
}
