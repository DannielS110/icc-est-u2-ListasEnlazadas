import Controller.MenuController;
import Controller.ContactManager;
import Model.Contact;

public class App {
    public static void main(String[] args) throws Exception {
        
        ContactManager cm = new ContactManager();
        
        Contact c1 = new Contact("Juan", "123456");
        Contact c2 = new Contact("Ana", "789012"); 
        Contact c3 = new Contact("Pedro", "345678");
        
        cm.addContact(c1);
        cm.addContact(c2);
        cm.addContact(c3);
        
        System.out.println("Sistema iniciado con contactos de ejemplo:");
        cm.printList();
        
        System.out.println("\n=== Probando búsqueda ===");
        Contact found = cm.findContactByName("juan"); 
        if (found != null) {
            System.out.println("✓ Encontrado: " + found);
        } else {
            System.out.println("✗ No encontrado");
        }
        
        System.out.println("\n=== Probando eliminación ===");
        cm.deleteContactByName("ANA");
        cm.printList();
        
        System.out.println("\n" + "=".repeat(40));
        System.out.println("Iniciando menú interactivo...");
        System.out.println("=".repeat(40));
        
        MenuController menu = new MenuController();
        
        menu.getContactManager().addContact(new Contact("Juan", "123456"));
        menu.getContactManager().addContact(new Contact("Pedro", "345678"));
        
        menu.showMenu();
    }
}