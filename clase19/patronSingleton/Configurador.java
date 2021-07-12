package clase19.patronSingleton;

public class Configurador {

    private String url;
    private String baseDatos;
    private static final Configurador instance = new Configurador();

    public static Configurador getInstance() {
        if(instance == null) {
            return new Configurador();
        }
        return instance;
    }

    public static Configurador getInstance(String url, String baseDatos) {
        if(instance == null) {
            return new Configurador(url, baseDatos);
        }
        instance.setUrl(url);
        instance.setBaseDatos(baseDatos);
        return instance;
    }

    private Configurador(){}

    private Configurador(String url, String baseDatos){
        this.url = url;
        this.baseDatos = baseDatos;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }

}
