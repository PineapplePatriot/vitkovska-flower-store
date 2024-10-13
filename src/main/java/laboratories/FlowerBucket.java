package laboratories;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public int getPrice() {
        return flowerPacks.stream()
                .mapToInt(FlowerPack::getPrice)
                .sum();
    }

    public List<FlowerPack> getFlowerPacks() {
        return flowerPacks;
    }
}
