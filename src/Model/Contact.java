package Model;

public class Contact {
    private String name;
    private String phone;
    
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
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
        if (obj == null) return false;
        if (!(obj instanceof Contact)) return false;
        
        Contact other = (Contact) obj;
        
        if (this.name == null && other.name == null) return true;
        if (this.name == null || other.name == null) return false;
        
        return this.name.equals(other.name); 
    }
}