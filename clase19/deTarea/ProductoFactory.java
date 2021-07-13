package clase19.deTarea;

public class ProductoFactory {
/*
    private static ProductoFactory instance;

    private ProductoFactory(){}

    public static ProductoFactory getInstance() {
        if(instance == null){
            instance = new ProductoFactory();
        }
        return instance;
    }
*/

    public Producto crearProducto(String codigo) {
        switch(codigo.toUpperCase()){
            case "CAJA10X10": return new Caja(10);
            case "PELOTAFUTBOL": return new Pelota(11);
            case "PELOTATENIS": return new Pelota(3.33);
        }
        return null;
    }

}
