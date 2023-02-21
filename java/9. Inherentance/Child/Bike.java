public class Bike extends AutoMobile {
    // Properties
    // protected String handle;
    // public String handle;
    // String handle;
    private String handle;

    // Default Constructor
    public Bike() {
        super(); 
        this.handle = "short";
    }

    // Parameterized Constructor
    public Bike(String e, int w, int s, int f, String l, String handle) {
        super(e, w, s, f, l); 
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }
}
