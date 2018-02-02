/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables.records;


import com.youbc.generated.schema.tables.FriendsTags;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FriendsTagsRecord extends UpdatableRecordImpl<FriendsTagsRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -666456121;

    /**
     * Setter for <code>poke_you_bc.friends_tags.id</code>.
     */
    public FriendsTagsRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.friends_tags.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>poke_you_bc.friends_tags.tag</code>.
     */
    public FriendsTagsRecord setTag(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.friends_tags.tag</code>.
     */
    public String getTag() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return FriendsTags.FRIENDS_TAGS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FriendsTags.FRIENDS_TAGS.TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendsTagsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendsTagsRecord value2(String value) {
        setTag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendsTagsRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FriendsTagsRecord
     */
    public FriendsTagsRecord() {
        super(FriendsTags.FRIENDS_TAGS);
    }

    /**
     * Create a detached, initialised FriendsTagsRecord
     */
    public FriendsTagsRecord(Integer id, String tag) {
        super(FriendsTags.FRIENDS_TAGS);

        set(0, id);
        set(1, tag);
    }
}
