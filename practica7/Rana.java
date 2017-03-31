
package practica7;

/**
 *
 * @authors Fabian Camp Mussa A01378565
 *          Jose Javier Rodriguez Mota A01372812
 *          Lenin Silva Gutierrez A01373214
 */
public class Rana extends Animal{
    
    private String nombre;
    private String veneno_mata;
    private String familia;
    private String comida;

    public Rana(String nombre, String veneno_mata, String familia, String comida) {
        super("rana");
        this.nombre = nombre;
        this.veneno_mata = veneno_mata;
        this.familia = familia;
        this.comida = comida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getVeneno_mata() {
        return veneno_mata;
    }
    
    public void setComida(String comida){
        this.comida = comida;
    }

    @Override
    public String sonido() {
        return "croak, croak";
    }

    @Override
    public String actitud() {
        return "saltar y lanzar su estomago";
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.nombre + " el " + this.familia + " la comida que come es " + this.comida;
    }
    
    
}
