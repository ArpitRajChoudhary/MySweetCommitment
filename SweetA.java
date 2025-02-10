class Sweet {
    private String _name;
    private String _membership;

    public void set_name(String name) {
        _name = name;
    }
    
    public String get_name() {
        return _name;
    }

    public void set_membership(String membership) {
        _membership = membership;
    }
    
    public String get_membership() {
        return _membership;
    }
}

public class SweetA {
    public static void main(String[] args) {
        Sweet obj = new Sweet();
        obj.set_membership("gold");
        System.out.println(obj.get_membership());
        obj.set_name("Arpit");
        System.out.println(obj.get_name());
    }
}