package electron.models;

public class Item {

    private String description;

    public Item(String description) {
        this.description = description != null ? description : "No Description Available";
    }

    public String getDescription() {
        return description;
    }
}
