class Pizza {
    private String size;
    private int cheeseToopings;
    private int pepperononiTopping;
    private int hamTopping;
    public void setSize(String size) {
        if (size.equals("small") || size.equals("medium") || size.equals("large")) {
            this.size = size;
        } else {
            System.out.println("Invalid size!");
        }
    }

    public Pizza(String size,int cheeseToopings, int pepperononiTopping, int hamTopping) {
        setSize(size);
        this.cheeseToopings = cheeseToopings;
        this.pepperononiTopping = pepperononiTopping;
        this.hamTopping = hamTopping;
    }
    public Pizza() {
        this("Small", 0, 0, 0);
    }
    public String getSize() {
        return size;
    }
    public int getcheeseToopings() {
        return cheeseToopings;
    }
    public int pepperononiTopping() {
        return pepperononiTopping;
    }
    public int hamTopping() {
        return hamTopping;
    }
    public double calCost() {
        double cost = 0;
        switch(size) {
            case"small":
            cost = 10;
            break;
            case"medium":
            cost = 12;
            break;
            case"large":
            cost = 14;
            break;
        }
        cost += (cheeseToopings+pepperononiTopping+hamTopping) * 2;
        return cost;
    }
    public String getDiscription() {
        
    }
}

public class Seven {
    public static void main(String[] args) {
        
    }
}
