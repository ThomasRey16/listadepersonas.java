package listadepersonas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//creamo la clase
class ListaPersonas {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //  se utiliza un while
        while (true) {
            System.out.print("Ingrese el nombre de la persona o '0' para finalizar: ");
            String nombre = scanner.nextLine();

            // para poner fin al programa
            if (nombre.equalsIgnoreCase("0")) {
                break;
            }

            System.out.print("Ingrese la edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el DNI: ");
            String dni = scanner.nextLine();

            // Crear una instancia de la clase Persona y agregarla a la lista
            Persona persona = new Persona(nombre, edad, dni);
            listaPersonas.add(persona);

            System.out.println("Persona agregada a la lista.");
            System.out.println();
        }

        // Imprimir la lista
        System.out.println("Lista de personas:");
        for (Persona persona : listaPersonas) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("DNI: " + persona.getDni());
            System.out.println();
        }

    }
}

class Persona {
    private String nombre;
    private int edad;
    private String dni;

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }
}
