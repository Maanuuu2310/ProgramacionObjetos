public class Cat {
    public int numPatas;
    public String name;
    private float peso;
    private int edad;
    private int numPasos;

    public Cat(int numPatas, String name, float peso, int edad) { // aca definimos el constructor
        this.numPatas = numPatas;
        this.name = name;
        this.peso = peso;
        this.edad = edad;
        this.numPasos = 0;
    }


    private float digerir(float cantidadComida) { // esto lo que hace es que cada vez que coma el gato suba de peso
        /* float nuevoPeso;

        nuevoPeso = peso + (cantidadComida /1000 );
        return nuevoPeso;*/

        return peso + (cantidadComida / 1000);
    }

    public void mostrarFoto(){ // en este apartado no lo ponemos dentro del () ya que es un atrb que no cambia nunca
        System.out.println("  /\\_/\\ ");
        System.out.println(" ( o.o ) ");
        System.out.println("  > ^ < ");
        System.out.println("  " + name);
    }

    public void comer(float cantidadComida) { // en este apartado lo ponemos dentro del () porque es un dato que cambia
        System.out.println("Meeeow! uwu" + " he comido " + cantidadComida + " gramos de comida ");

        peso = digerir(cantidadComida);
        System.out.println("ahora peso " + peso);

    }

    public void presentarse(){ // aca definimos un atrb para que el gato se presente
        System.out.println("Me llamo " + name + " tengo " + numPatas + " patas" + " y tengo " + edad + " Años");
    }

    public void caminar(float numMetros){ // aca lo que hacemos es calcular cuantos pasos camina el gato
        int pasosPorMetros = (int) numMetros*6;
        numPasos += pasosPorMetros;
        System.out.println("He caminado " + numPasos);
    }
}
