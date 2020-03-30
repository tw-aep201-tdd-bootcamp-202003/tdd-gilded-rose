package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RegularGoodsTest {

    @Test
    void should_update_correctly_when_update_given_in_sell_and_quality_between_0_50() {
        // Given
        int oldSellIn = 5;
        int oldQuality = 5;
        Goods goods = new Goods("Bread", oldQuality, oldSellIn);

        // When
        goods.updateByDay();

        // Then
        int newSellIn = goods.getSellIn();
        int newQuality = goods.getQuality();
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
        assertThat(newQuality).isEqualTo(oldQuality - 1);
    }

    @Test
    void should_update_correctly_when_update_given_in_sell_and_quality_is_0() {
        // Given
        int oldSellIn = 5;
        int oldQuality = 0;
        Goods goods = new Goods("Bread", oldQuality, oldSellIn);

        // When
        goods.updateByDay();

        // Then
        int newSellIn = goods.getSellIn();
        int newQuality = goods.getQuality();
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
        assertThat(newQuality).isEqualTo(0);
    }

    @Test
    void should_update_correctly_when_update_given_out_sell_and_quality_between_0_50() {
        // Given
        int oldSellIn = 0;
        int oldQuality = 5;
        Goods goods = new Goods("Bread", oldQuality, oldSellIn);

        // When
        goods.updateByDay();

        // Then
        int newSellIn = goods.getSellIn();
        int newQuality = goods.getQuality();
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
        assertThat(newQuality).isEqualTo(oldQuality - 2);
    }

    @Test
    void should_update_correctly_when_update_given_out_sell_and_quality_is_1() {
        // Given
        int oldSellIn = 0;
        int oldQuality = 1;
        Goods goods = new Goods("Bread", oldQuality, oldSellIn);

        // When
        goods.updateByDay();

        // Then
        int newSellIn = goods.getSellIn();
        int newQuality = goods.getQuality();
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
        assertThat(newQuality).isEqualTo(0);
    }
}
