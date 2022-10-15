package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    List<FlowerPack> bucket = new ArrayList<>();
    public void add(FlowerPack pack) {
        bucket.add(pack);
    }
    public double getPrice() {
        double result = 0;
        for (FlowerPack pack : bucket) {
            result += pack.getPrice();
        }
        return result;
    }
}
