/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables;


import com.youbc.generated.schema.Keys;
import com.youbc.generated.schema.PokeYouBc;
import com.youbc.generated.schema.tables.records.RoommatesDislikesRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoommatesDislikes extends TableImpl<RoommatesDislikesRecord> {

    private static final long serialVersionUID = -1590017857;

    /**
     * The reference instance of <code>poke_you_bc.roommates_dislikes</code>
     */
    public static final RoommatesDislikes ROOMMATES_DISLIKES = new RoommatesDislikes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoommatesDislikesRecord> getRecordType() {
        return RoommatesDislikesRecord.class;
    }

    /**
     * The column <code>poke_you_bc.roommates_dislikes.disliker</code>.
     */
    public final TableField<RoommatesDislikesRecord, String> DISLIKER = createField("disliker", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>poke_you_bc.roommates_dislikes.dislikee</code>.
     */
    public final TableField<RoommatesDislikesRecord, String> DISLIKEE = createField("dislikee", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>poke_you_bc.roommates_dislikes.time_created</code>.
     */
    public final TableField<RoommatesDislikesRecord, Timestamp> TIME_CREATED = createField("time_created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>poke_you_bc.roommates_dislikes</code> table reference
     */
    public RoommatesDislikes() {
        this("roommates_dislikes", null);
    }

    /**
     * Create an aliased <code>poke_you_bc.roommates_dislikes</code> table reference
     */
    public RoommatesDislikes(String alias) {
        this(alias, ROOMMATES_DISLIKES);
    }

    private RoommatesDislikes(String alias, Table<RoommatesDislikesRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoommatesDislikes(String alias, Table<RoommatesDislikesRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<RoommatesDislikesRecord> getPrimaryKey() {
        return Keys.KEY_ROOMMATES_DISLIKES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RoommatesDislikesRecord>> getKeys() {
        return Arrays.<UniqueKey<RoommatesDislikesRecord>>asList(Keys.KEY_ROOMMATES_DISLIKES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RoommatesDislikesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RoommatesDislikesRecord, ?>>asList(Keys.ROOMMATES_DISLIKES_IBFK_1, Keys.ROOMMATES_DISLIKES_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoommatesDislikes as(String alias) {
        return new RoommatesDislikes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoommatesDislikes rename(String name) {
        return new RoommatesDislikes(name, null);
    }
}