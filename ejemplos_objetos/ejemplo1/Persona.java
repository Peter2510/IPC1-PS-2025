package ejemplo1;

public class Persona {

    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int telefono;
    private char genero;

    //constructor por defecto, si no se declara, este se crea implicitamente
    public Persona(){

    }

    //constructor con los atributos
    public Persona(String nombre, String apellido, String direccion, int telefono, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = direccion;
        this.telefono = telefono;
        this.genero = genero;
    }

    public String saludar(){
        return "Hola, soy " + this.getNombre() + ", y soy " + this.getNacionalidad();
    }


    /*
    
    getters -> Para obtener el valor del atributo
        Por comomidad, el getter comienza con la palabra “get” seguida del nombre de la variable.
    
    setters -> Para establecer o actualizar el atributo 
        Por comodidad, el setter comienza con la palabra “set” seguida del nombre de la variable.

    */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String direccion) {
        this.nacionalidad = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    

}