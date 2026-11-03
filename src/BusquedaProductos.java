import java.util.ArrayList;
import java.util.List;

public class BusquedaProductos {
    private List<Producto> productos = new ArrayList<>();

    public void agregar(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarPorCodigo(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    public List<Producto> buscarPorNombre(String texto) {
        List<Producto> resultados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getNombre().toLowerCase().contains(texto.toLowerCase())) {
                resultados.add(p);
            }
        }
        return resultados;
    }

    public static void main(String[] args) {
        BusquedaProductos inventario = new BusquedaProductos();
        inventario.agregar(new Producto("P001", "Teclado", 350.0, 20));
        inventario.agregar(new Producto("P002", "Mouse", 180.0, 35));

        Producto encontrado = inventario.buscarPorCodigo("P002");
        if (encontrado != null) {
            encontrado.mostrarInformacion();
        } else {
            System.out.println("Producto no encontrado");
        }
    }
}
