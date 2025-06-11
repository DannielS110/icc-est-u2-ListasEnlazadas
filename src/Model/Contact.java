package Model;

public class Contact {
    private String name;
    private String phone;
    
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    
    public Contact(String name) {
        this.name = name;
        this.phone = null;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + name + ", Teléfono: " + phone;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        Contact other = (Contact) obj;
        
        if (this.name == null) {
            return other.name == null;
        }
        
        return this.name.equalsIgnoreCase(other.name);
    }
    
    @Override
    public int hashCode() {
        return name == null ? 0 : name.toLowerCase().hashCode();
    }
}