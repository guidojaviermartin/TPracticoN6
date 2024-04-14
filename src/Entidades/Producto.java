
package Entidades;


public class Producto implements Comparable<Producto>{
    private Integer codigo;
    private String descripcion;
    private Double precio;
    private Rubro rubro;
    private Integer stock;

    public Producto() {
    }

    public Producto(Integer codigo, String descripcion, Double precio, Rubro rubro, Integer stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rubro = rubro;
        this.stock = stock;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
   public String toString(){
   
       return codigo+" "+descripcion;
   }

    @Override
    public int compareTo(Producto otroProducto) {

        return Integer.compare(this.codigo, otroProducto.getCodigo());
    }
}
