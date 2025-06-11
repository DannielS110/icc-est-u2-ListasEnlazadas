package View;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;
    
    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }
    
    public void displayMenu() {
        System.out.println("\n=== SISTEMA DE GESTIÓN DE CONTACTOS ===");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Mostrar todos los contactos");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }
    
    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
    
    public void showMessage(String message) {
        System.out.println(message);
    }
    
    public void close() {
        scanner.close();
    }
}