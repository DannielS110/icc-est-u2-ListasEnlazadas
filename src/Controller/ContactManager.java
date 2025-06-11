package Controller;

import Model.*;

public class ContactManager {
    private LinkedList<Contact> contacts;
    
    public ContactManager() {
        this.contacts = new LinkedList<>();
    }
    
    public void addContact(Contact contact) {
        if (findContactByName(contact.getName()) != null) {
            System.out.println("El contacto ya existe.");
            return;
        }
        contacts.appendToTail(contact);
        System.out.println("Contacto agregado exitosamente.");
    }
    
    public Contact findContactByName(String name) {
        Node<Contact> current = contacts.getHead();
        while (current != null) {
            if (current.getValue().getName().equalsIgnoreCase(name)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }
    
    public void deleteContactByName(String name) {
        Contact contactToDelete = findContactByName(name);
        if (contactToDelete != null) {
            contacts.deleteByValue(contactToDelete);
            System.out.println("Contacto eliminado exitosamente.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }
    
    public void printList() {
        if (contacts.isEmpty()) {
            System.out.println("No hay contactos en la lista.");
        } else {
            System.out.println("\n=== LISTA DE CONTACTOS ===");
            contacts.print();
            System.out.println("Total de contactos: " + contacts.getSize());
        }
    }
    
    public LinkedList<Contact> getContacts() {
        return contacts;
    }
}
