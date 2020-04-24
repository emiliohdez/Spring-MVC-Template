package mvcbase.model.entities;

/**
 * @author emiliohdez
 * I think the setters are a good place to make validations about the properties of our entities
 */
public class Item {
    private String name;
    private Float price;

    public Item() {
    }

    public String getName() {
        return this.name;
    }

    public Item setName(String name) throws InvalidEntityPropertyException {
        // Let's suppose that the name of an item cannot be larger than 50 chars
        if (name.length() > 50) {
            throw new InvalidEntityPropertyException("INVALID_ITEM_NAME");
        }
        this.name = name;
        return this;
    }

    public Float getPrice() {
        return this.price;
    }

    public Item setPrice(Float price) throws InvalidEntityPropertyException {
        // And the item cannot have a price bigger than 5000
        if (price > 5000) {
            throw new InvalidEntityPropertyException("INVALID_ITEM_PRICE");
        }
        this.price = price;
        return this;
    }
}
