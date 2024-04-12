package Entidades;

import java.util.Comparator;

public class Comparar {
    public static Comparator<Producto> porCodigo = new Comparator<Producto>() {
        @Override
        public int compare(Producto t, Producto t1) {            
            return t.getCodigo().compareTo(t1.getCodigo());
        }
    };
    
    public static Comparator<Producto> porPrecio = new Comparator<Producto>() {
        @Override
        public int compare(Producto t, Producto t1) {            
            return t.getPrecio().compareTo(t1.getPrecio());
        }
    };

    public static Comparator<Producto> porStock = new Comparator<Producto>() {
        @Override
        public int compare(Producto t, Producto t1) {            
            return t.getStock().compareTo(t1.getStock());
        }
    };
    
    public static Comparator<Producto> porCategoria = new Comparator<Producto>() {
        @Override
        public int compare(Producto t, Producto t1) {            
            return t.getRubro().getNombre().compareTo(t1.getRubro().getNombre());
        }
    };
}
