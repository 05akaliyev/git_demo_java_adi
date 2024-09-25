package worldcup;

public class Coach extends Person {  // Now extends Perso

    private boolean active;
    private String style;

    // Constructor
    public Coach(int age, boolean active, String style) {
        this.age = age;
        this.active = active;
        this.style = style;
    }

    public void train() {
        System.out.println("Coach is training the team");
    }

    // Getters and Setters
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
