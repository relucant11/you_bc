/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables;


import com.youbc.generated.schema.Keys;
import com.youbc.generated.schema.PokeYouBc;
import com.youbc.generated.schema.tables.records.RoommatesTagsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class RoommatesTags extends TableImpl<RoommatesTagsRecord> {

    private static final long serialVersionUID = 1388918981;

    /**
     * The reference instance of <code>poke_you_bc.roommates_tags</code>
     */
    public static final RoommatesTags ROOMMATES_TAGS = new RoommatesTags();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoommatesTagsRecord> getRecordType() {
        return RoommatesTagsRecord.class;
    }

    /**
     * The column <code>poke_you_bc.roommates_tags.tag_id</code>.
     */
    public final TableField<RoommatesTagsRecord, Integer> TAG_ID = createField("tag_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>poke_you_bc.roommates_tags.tag</code>.
     */
    public final TableField<RoommatesTagsRecord, String> TAG = createField("tag", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * Create a <code>poke_you_bc.roommates_tags</code> table reference
     */
    public RoommatesTags() {
        this("roommates_tags", null);
    }

    /**
     * Create an aliased <code>poke_you_bc.roommates_tags</code> table reference
     */
    public RoommatesTags(String alias) {
        this(alias, ROOMMATES_TAGS);
    }

    private RoommatesTags(String alias, Table<RoommatesTagsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoommatesTags(String alias, Table<RoommatesTagsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PokeYouBc.POKE_YOU_BC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RoommatesTagsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ROOMMATES_TAGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RoommatesTagsRecord> getPrimaryKey() {
        return Keys.KEY_ROOMMATES_TAGS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RoommatesTagsRecord>> getKeys() {
        return Arrays.<UniqueKey<RoommatesTagsRecord>>asList(Keys.KEY_ROOMMATES_TAGS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoommatesTags as(String alias) {
        return new RoommatesTags(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoommatesTags rename(String name) {
        return new RoommatesTags(name, null);
    }
}
