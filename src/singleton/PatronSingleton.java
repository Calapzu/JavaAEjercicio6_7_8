package singleton;

public class PatronSingleton {
    private static PatronSingleton instancia;
    public String valor;

    public PatronSingleton(String valor) {
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.valor = valor;
    }
    public static PatronSingleton getInstancia(String valor){
        if (instancia == null){
            instancia = new PatronSingleton(valor);
        }
        return instancia;
    }
}
