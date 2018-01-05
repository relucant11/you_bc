/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables;


import com.youbc.generated.schema.Keys;
import com.youbc.generated.schema.PokeYouBc;
import com.youbc.generated.schema.tables.records.ClassmatesProfileRecord;

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
public class ClassmatesProfile extends TableImpl<ClassmatesProfileRecord> {

    private static final long serialVersionUID = -933576423;

    /**
     * The reference instance of <code>poke_you_bc.classmates_profile</code>
     */
    public static final ClassmatesProfile CLASSMATES_PROFILE = new ClassmatesProfile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClassmatesProfileRecord> getRecordType() {
        return ClassmatesProfileRecord.class;
    }

    /**
     * The column <code>poke_you_bc.classmates_profile.user_id</code>.
     */
    public final TableField<ClassmatesProfileRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>poke_you_bc.classmates_profile.marjor_id</code>.
     */
    public final TableField<ClassmatesProfileRecord, Integer> MARJOR_ID = createField("marjor_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>poke_you_bc.classmates_profile.motto</code>.
     */
    public final TableField<ClassmatesProfileRecord, String> MOTTO = createField("motto", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>poke_you_bc.classmates_profile.time_created</code>.
     */
    public final TableField<ClassmatesProfileRecord, Timestamp> TIME_CREATED = createField("time_created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>poke_you_bc.classmates_profile</code> table reference
     */
    public ClassmatesProfile() {
        this("classmates_profile", null);
    }

    /**
     * Create an aliased <code>poke_you_bc.classmates_profile</code> table reference
     */
    public ClassmatesProfile(String alias) {
        this(alias, CLASSMATES_PROFILE);
    }

    private ClassmatesProfile(String alias, Table<ClassmatesProfileRecord> aliased) {
        this(alias, aliased, null);
    }

    private ClassmatesProfile(String alias, Table<ClassmatesProfileRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ClassmatesProfileRecord> getPrimaryKey() {
        return Keys.KEY_CLASSMATES_PROFILE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ClassmatesProfileRecord>> getKeys() {
        return Arrays.<UniqueKey<ClassmatesProfileRecord>>asList(Keys.KEY_CLASSMATES_PROFILE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ClassmatesProfileRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ClassmatesProfileRecord, ?>>asList(Keys.CLASSMATES_PROFILE_IBFK_1, Keys.CLASSMATES_PROFILE_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesProfile as(String alias) {
        return new ClassmatesProfile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ClassmatesProfile rename(String name) {
        return new ClassmatesProfile(name, null);
    }
}
