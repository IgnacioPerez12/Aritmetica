package operaciones;

public class Aritmetica {
    
    int a;
    int b;
    
    //CONSTRUCTOR
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    //METODOS
    public void suma(){
        System.out.println("El total de la suma es: " + (a + b));
    }
    
    public int suma2(){
        return a + b;
    }
    
    public int sumaArgs(int a, int b){
        this.a = a;
        this.b = b;
        return this.a + this.b;
    }
}
