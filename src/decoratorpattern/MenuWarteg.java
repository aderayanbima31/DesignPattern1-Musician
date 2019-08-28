package decoratorpattern;

public abstract class MenuWarteg {

    public String description = "MenuWarteg";

    public String getDescription(){
        return description;
    }

    public abstract int cost();

}
