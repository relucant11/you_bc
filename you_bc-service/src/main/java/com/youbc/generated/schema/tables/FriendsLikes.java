/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables;


import com.youbc.generated.schema.Keys;
import com.youbc.generated.schema.YouBc;
import com.youbc.generated.schema.tables.records.FriendsLikesRecord;

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
public class FriendsLikes extends TableImpl<FriendsLikesRecord> {

    private static final long serialVersionUID = 860733989;

    /**
     * The reference instance of <code>you_bc.friends_likes</code>
     */
    public static final FriendsLikes FRIENDS_LIKES = new FriendsLikes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FriendsLikesRecord> getRecordType() {
        return FriendsLikesRecord.class;
    }

    /**
     * The column <code>you_bc.friends_likes.liker</code>.
     */
    public final TableField<FriendsLikesRecord, Integer> LIKER = createField("liker", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>you_bc.friends_likes.likee</code>.
     */
    public final TableField<FriendsLikesRecord, Integer> LIKEE = createField("likee", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>you_bc.friends_likes.time_created</code>.
     */
    public final TableField<FriendsLikesRecord, Timestamp> TIME_CREATED = createField("time_created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>you_bc.friends_likes</code> table reference
     */
    public FriendsLikes() {
        this("friends_likes", null);
    }

    /**
     * Create an aliased <code>you_bc.friends_likes</code> table reference
     */
    public FriendsLikes(String alias) {
        this(alias, FRIENDS_LIKES);
    }

    private FriendsLikes(String alias, Table<FriendsLikesRecord> aliased) {
        this(alias, aliased, null);
    }

    private FriendsLikes(String alias, Table<FriendsLikesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return YouBc.YOU_BC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FriendsLikesRecord> getPrimaryKey() {
        return Keys.KEY_FRIENDS_LIKES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FriendsLikesRecord>> getKeys() {
        return Arrays.<UniqueKey<FriendsLikesRecord>>asList(Keys.KEY_FRIENDS_LIKES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FriendsLikesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FriendsLikesRecord, ?>>asList(Keys.FRIENDS_LIKES_IBFK_1, Keys.FRIENDS_LIKES_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendsLikes as(String alias) {
        return new FriendsLikes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FriendsLikes rename(String name) {
        return new FriendsLikes(name, null);
    }
}
