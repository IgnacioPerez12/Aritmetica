package operaciones;

public class Test {
    
    public static void main(String[] args) {
        
        /*
        Aritmetica arit1 = new Aritmetica();
        
        arit1.a = 10;
        arit1.b = 5;
        */
        
        
        Aritmetica arit1 = new Aritmetica(10, 50);
        
        //Caso 1
        arit1.suma();
        //Caso 2
        var resultado = arit1.suma2();
        //Caso 3
        System.out.println("Suma 2: " + resultado);
        //Caso 4
        resultado = arit1.sumaArgs(80, 20);
        System.out.println("SumaArgs: " + resultado);
        
        
        nuevoMetodo();
    }
    
    public static void nuevoMetodo(){
        System.out.println("Nuevo metodo");
    }
    
}
