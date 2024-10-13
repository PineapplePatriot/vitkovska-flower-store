package laboratories;
import java.util.ArrayList;

public class Store {
    private ArrayList<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void addBucket(FlowerBucket bucket) {
        flowerBuckets.add(bucket);
    }

    public ArrayList<FlowerBucket> search(Flower searchFlower) {
        ArrayList<FlowerBucket> matchingBuckets = new ArrayList<>();

        for (FlowerBucket bucket : flowerBuckets) {
            for (FlowerPack pack : bucket.getFlowerPacks()) {
                Flower flower = pack.getFlower();
                if (matches(searchFlower, flower)) {
                    matchingBuckets.add(bucket);
                    break;
                }
            }
        }
        return matchingBuckets;
    }

    private boolean matches(Flower searchFlower, Flower flower) {
        if (searchFlower.getColor() != null && !searchFlower.getColor().equals(flower.getColor())) {
            return false;
        }
        if (searchFlower.getSepalLength() != 0 && searchFlower.getSepalLength() != flower.getSepalLength()) {
            return false;
        }
        if (searchFlower.getPrice() != 0 && searchFlower.getPrice() != flower.getPrice()) {
            return false;
        }
        return true;
    }
}
