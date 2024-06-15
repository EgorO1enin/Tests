import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IncorrectEqualsTest {

    @Test
    public void shouldReturnEquals() {
        Item item1 = new Item("яблоки", 50);
        Item item2 = new Item("uhe", 50);

        assertEquals(item2, item1);
    }
}

class Item {

    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return price == item.price && Objects.equals(name, item.name);
    }
}