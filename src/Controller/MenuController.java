package Controller;

import Model.Contact;
import View.ConsoleView;

public class MenuController {
    private ContactManager contactManager;
    private ConsoleView consoleView;
    
    public MenuController() {
        this.contactManager = new ContactManager();
        this.consoleView = new ConsoleView();
    }
    
    public void showMenu() {
        boolean running = true;
        
        while (running) {
            consoleView.displayMenu();
            String option = consoleView.getInput("");
            
            switch (option) {
                case "1":
                    addContact();
                    break;
                case "2":
                    findContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    printList();
                    break;
                case "5":
                    running = false;
                    consoleView.showMessage("¡Gracias por usar el sistema!");
                    break;
                default:
                    consoleView.showMessage("Opción no válida. Intente nuevamente.");
            }
        }
        consoleView.close();
    }
    
    private void addContact() {
        consoleView.showMessage("\n=== AGREGAR CONTACTO ===");
        String name = consoleView.getInput("Ingrese el nombre: ");
        String phone = consoleView.getInput("Ingrese el teléfono: ");
        
        if (!name.isEmpty() && !phone.isEmpty()) {
            Contact newContact = new Contact(name, phone);
            contactManager.addContact(newContact);
        } else {
            consoleView.showMessage("Error: El nombre y teléfono no pueden estar vacíos.");
        }
    }
    
    private void findContact() {
        consoleView.showMessage("\n=== BUSCAR CONTACTO ===");
        String name = consoleView.getInput("Ingrese el nombre a buscar: ");
        
        Contact contact = contactManager.findContactByName(name);
        if (contact != null) {
            consoleView.showMessage("Contacto encontrado: " + contact.toString());
        } else {
            consoleView.showMessage("Contacto no encontrado.");
        }
    }
    
    private void deleteContact() {
        consoleView.showMessage("\n=== ELIMINAR CONTACTO ===");
        String name = consoleView.getInput("Ingrese el nombre del contacto a eliminar: ");
        contactManager.deleteContactByName(name);
    }
    
    private void printList() {
        contactManager.printList();
    }
    
    public ContactManager getContactManager() {
        return contactManager;
    }
}
