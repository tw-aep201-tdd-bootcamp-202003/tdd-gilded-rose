package cn.xpbootcamp.gilded_rose;

public class Goods {
    private final String name;
    private int quality;
    private int sellIn;

    public Goods(String name, int quality, int sellIn) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void updateByDay() {
        decreaseQuality();
        if (sellIn <= 0) {
            decreaseQuality();
        }
        sellIn = sellIn - 1;
    }

    private void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }
}
