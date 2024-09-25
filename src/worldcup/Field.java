package worldcup;

public class Field {
    // Attribute for the size of the field
    private int size;

    // Constructor to initialize the size of the field
    public Field(int size) {
        this.size = size;
    }

    // Method to turn the lights on the field on or off
    public void turnLight(boolean on) {
        if (on) {
            System.out.println("The field lights are ON.");
        } else {
            System.out.println("The field lights are OFF.");
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
