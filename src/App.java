import Controller.MenuController;
import Controller.ContactManager;
import Model.Contact;

public class App {
    public static void main(String[] args) throws Exception {
        
        ContactManager cm = new ContactManager();
        
        Contact c1 = new Contact("Juan", "123");
        Contact c2 = new Contact("Ana", "456"); 
        Contact c3 = new Contact("Pedro", "789");
        
        cm.addContact(c1);
        cm.addContact(c2);
        cm.addContact(c3);
        
        System.out.println("=== Lista inicial ===");
        cm.printList();
        
        System.out.println("\n=== Probando búsqueda ===");
        Contact found = cm.findContactByName("juan"); 
        
        if (found != null) {
            System.out.println("Encontrado: " + found);
        } else {
            System.out.println("No encontrado");
        }
        
        System.out.println("\n=== Probando eliminación ===");
        cm.deleteContactByName("ANA"); 
        
        System.out.println("\n=== Lista después de eliminar ===");
        cm.printList();
        
        MenuController menu = new MenuController();
        menu.showMenu();
    }
}
