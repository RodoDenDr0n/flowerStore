package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @AllArgsConstructor
public class Flower {
    @Getter
    private FlowerType flowerType;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private double sepalLength;
    public Flower() {

    }
    public String getColor() {
        return color.toString();
    }
}
