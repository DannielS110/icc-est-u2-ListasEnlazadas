import Controller.MenuController;
import Model.Contact;

public class App {
    public static void main(String[] args) {
        MenuController menu = new MenuController();
        
        menu.getContactManager().addContact(new Contact("Juan Perez", "123-456-7890"));
        menu.getContactManager().addContact(new Contact("Maria Garcia", "098-765-4321"));
        menu.getContactManager().addContact(new Contact("Carlos Lopez", "555-123-4567"));
        
        System.out.println("Sistema iniciado con contactos de ejemplo:");
        menu.getContactManager().printList();
        
        menu.showMenu();
    }
}
