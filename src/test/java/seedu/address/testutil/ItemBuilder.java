package seedu.address.testutil;

import java.util.HashSet;
import java.util.Set;

import seedu.address.model.item.ExpiryDate;
import seedu.address.model.item.Item;
import seedu.address.model.item.Name;
import seedu.address.model.item.Remark;
import seedu.address.model.tag.Tag;
import seedu.address.model.util.SampleDataUtil;

/**
 * A utility class to help with building Person objects.
 */
public class ItemBuilder {

    public static final String DEFAULT_NAME = "Kiwi";
    public static final String DEFAULT_EXPIRY_DATE = "1/2/2019";
    public static final String DEFAULT_REMARK = "$5";

    private Name name;
    private ExpiryDate expiryDate;
    private Set<Tag> tags;
    private Remark remark;

    public ItemBuilder() {
        name = new Name(DEFAULT_NAME);
        expiryDate = new ExpiryDate(DEFAULT_EXPIRY_DATE);
        tags = new HashSet<>();
        remark = new Remark(DEFAULT_REMARK);
    }

    /**
     * Initializes the PersonBuilder with the data of {@code personToCopy}.
     */
    public ItemBuilder(Item personToCopy) {
        name = personToCopy.getName();
        expiryDate = personToCopy.getExpiryDate();
        tags = new HashSet<>(personToCopy.getTags());
        remark = personToCopy.getRemark();
    }

    /**
     * Sets the {@code Name} of the {@code Person} that we are building.
     */
    public ItemBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Person} that we are building.
     */
    public ItemBuilder withTags(String ... tags) {
        this.tags = SampleDataUtil.getTagSet(tags);
        return this;
    }

    /**
     * Sets the {@code ExpiryDate} of the {@code Item} that we are building.
     */
    public ItemBuilder withExpiryDate(String expiryDate) {
        this.expiryDate = new ExpiryDate(expiryDate);
        return this;
    }

    /**
     * Sets the {@code Remark} of the {@code Item} that we are building.
     */
    public ItemBuilder withRemark(String remark) {
        this.remark = new Remark(remark);
        return this;
    }


    public Item build() {
        return new Item(name, expiryDate, tags, remark);
    }

}
