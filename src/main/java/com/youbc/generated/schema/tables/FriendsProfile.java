/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables;


import com.youbc.generated.schema.Keys;
import com.youbc.generated.schema.PokeYouBc;
import com.youbc.generated.schema.tables.records.FriendsProfileRecord;

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
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FriendsProfile extends TableImpl<FriendsProfileRecord> {

    private static final long serialVersionUID = 1974124398;

    /**
     * The reference instance of <code>poke_you_bc.friends_profile</code>
     */
    public static final FriendsProfile FRIENDS_PROFILE = new FriendsProfile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FriendsProfileRecord> getRecordType() {
        return FriendsProfileRecord.class;
    }

    /**
     * The column <code>poke_you_bc.friends_profile.user_id</code>.
     */
    public final TableField<FriendsProfileRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>poke_you_bc.friends_profile.faculty_id</code>.
     */
    public final TableField<FriendsProfileRecord, Integer> FACULTY_ID = createField("faculty_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>poke_you_bc.friends_profile.relationship_id</code>.
     */
    public final TableField<FriendsProfileRecord, Integer> RELATIONSHIP_ID = createField("relationship_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>poke_you_bc.friends_profile.motto</code>.
     */
    public final TableField<FriendsProfileRecord, String> MOTTO = createField("motto", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>poke_you_bc.friends_profile.time_created</code>.
     */
    public final TableField<FriendsProfileRecord, Timestamp> TIME_CREATED = createField("time_created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>poke_you_bc.friends_profile</code> table reference
     */
    public FriendsProfile() {
        this("friends_profile", null);
    }

    /**
     * Create an aliased <code>poke_you_bc.friends_profile</code> table reference
     */
    public FriendsProfile(String alias) {
        this(alias, FRIENDS_PROFILE);
    }

    private FriendsProfile(String alias, Table<FriendsProfileRecord> aliased) {
        this(alias, aliased, null);
    }

    private FriendsProfile(String alias, Table<FriendsProfileRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<FriendsProfileRecord> getPrimaryKey() {
        return Keys.KEY_FRIENDS_PROFILE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FriendsProfileRecord>> getKeys() {
        return Arrays.<UniqueKey<FriendsProfileRecord>>asList(Keys.KEY_FRIENDS_PROFILE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FriendsProfileRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FriendsProfileRecord, ?>>asList(Keys.FRIENDS_PROFILE_IBFK_1, Keys.FRIENDS_PROFILE_IBFK_2, Keys.FRIENDS_PROFILE_IBFK_3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendsProfile as(String alias) {
        return new FriendsProfile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FriendsProfile rename(String name) {
        return new FriendsProfile(name, null);
    }
}
