package ejemplo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Persona 1

        System.out.println("Objeto persona con constructor vacio");
        //instanciar una persona con constructor vacio
        Persona persona1 = new Persona();
        
        //Utilizacion de setters
        persona1.setNombre("Fernanda");
        persona1.setApellido("Galicia");
        persona1.setNacionalidad("Alemana");
        persona1.setTelefono(41259687);
        persona1.setGenero('F');

        //uso de metodo saludar definido en la clase
        System.out.println(persona1.saludar());

        //mostrar apellido y telefono
        System.out.println("Mi apellido es " +persona1.getApellido());
        System.out.println("Mi telefono es " + persona1.getTelefono());

        //Persona 2
        System.out.println("---------------------");
        
        //Instanciar una persona haciendo uso de contructor con parametros
        System.out.println("Objeto persona utilizando constructor con parametros");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la persona");
        String nombrePersona = sc.nextLine();
        System.out.println("Ingresa el apellido de la persona");
        String apellidoPersona = sc.nextLine();
        System.out.println("Ingresa la nacionalidad de la persona");
        String nacionalidadPersona = sc.nextLine();
        System.out.println("Ingresa el telefono de la persona");
        int telefonoPersona = sc.nextInt();
        System.out.println("Ingresa la inicial del genero de la persona, F para femenino y M para masculino");
        char generoPersona = sc.next().charAt(0);

        Persona persona2 = new Persona(nombrePersona, apellidoPersona, nacionalidadPersona, telefonoPersona, generoPersona);

        //uso de metodo saludar definido en la clase
        System.out.println(persona2.saludar());

        //mostrar apellido y telefono
        System.out.println("Mi apellido es " +persona2.getApellido());
        System.out.println("Mi telefono es " + persona2.getTelefono());
        System.out.println("Mi inicial del genero es " + persona2.getGenero());

        sc.close();



        
    }
}
