/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables;


import com.youbc.generated.schema.Keys;
import com.youbc.generated.schema.PokeYouBc;
import com.youbc.generated.schema.tables.records.ClassmatesTagsRecord;

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
public class ClassmatesTags extends TableImpl<ClassmatesTagsRecord> {

    private static final long serialVersionUID = 40004467;

    /**
     * The reference instance of <code>poke_you_bc.classmates_tags</code>
     */
    public static final ClassmatesTags CLASSMATES_TAGS = new ClassmatesTags();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClassmatesTagsRecord> getRecordType() {
        return ClassmatesTagsRecord.class;
    }

    /**
     * The column <code>poke_you_bc.classmates_tags.id</code>.
     */
    public final TableField<ClassmatesTagsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>poke_you_bc.classmates_tags.tag</code>.
     */
    public final TableField<ClassmatesTagsRecord, String> TAG = createField("tag", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * Create a <code>poke_you_bc.classmates_tags</code> table reference
     */
    public ClassmatesTags() {
        this("classmates_tags", null);
    }

    /**
     * Create an aliased <code>poke_you_bc.classmates_tags</code> table reference
     */
    public ClassmatesTags(String alias) {
        this(alias, CLASSMATES_TAGS);
    }

    private ClassmatesTags(String alias, Table<ClassmatesTagsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ClassmatesTags(String alias, Table<ClassmatesTagsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ClassmatesTagsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLASSMATES_TAGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ClassmatesTagsRecord> getPrimaryKey() {
        return Keys.KEY_CLASSMATES_TAGS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ClassmatesTagsRecord>> getKeys() {
        return Arrays.<UniqueKey<ClassmatesTagsRecord>>asList(Keys.KEY_CLASSMATES_TAGS_PRIMARY, Keys.KEY_CLASSMATES_TAGS_TAG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesTags as(String alias) {
        return new ClassmatesTags(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ClassmatesTags rename(String name) {
        return new ClassmatesTags(name, null);
    }
}
