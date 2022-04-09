package singleton;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Si ve el mismo valor, entonces se reutilizo singleton (¡Siiii!)" +
                "\nsi ves valores diferentes entonces se crearon 2 singleton (¡Noooo!");

        PatronSingleton singleton = PatronSingleton.getInstancia("FOO");
        PatronSingleton singleton2 = PatronSingleton.getInstancia("BAR");

        System.out.println(singleton.valor);
        System.out.println(singleton2.valor);
    }
}
