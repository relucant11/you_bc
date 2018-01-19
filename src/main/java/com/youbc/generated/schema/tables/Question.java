/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables;


import com.youbc.generated.schema.Keys;
import com.youbc.generated.schema.PokeYouBc;
import com.youbc.generated.schema.tables.records.QuestionRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class Question extends TableImpl<QuestionRecord> {

    private static final long serialVersionUID = 870028744;

    /**
     * The reference instance of <code>poke_you_bc.question</code>
     */
    public static final Question QUESTION = new Question();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QuestionRecord> getRecordType() {
        return QuestionRecord.class;
    }

    /**
     * The column <code>poke_you_bc.question.question_id</code>.
     */
    public final TableField<QuestionRecord, Integer> QUESTION_ID = createField("question_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>poke_you_bc.question.question_content</code>.
     */
    public final TableField<QuestionRecord, String> QUESTION_CONTENT = createField("question_content", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "");

    /**
     * Create a <code>poke_you_bc.question</code> table reference
     */
    public Question() {
        this("question", null);
    }

    /**
     * Create an aliased <code>poke_you_bc.question</code> table reference
     */
    public Question(String alias) {
        this(alias, QUESTION);
    }

    private Question(String alias, Table<QuestionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Question(String alias, Table<QuestionRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<QuestionRecord> getPrimaryKey() {
        return Keys.KEY_QUESTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<QuestionRecord>> getKeys() {
        return Arrays.<UniqueKey<QuestionRecord>>asList(Keys.KEY_QUESTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Question as(String alias) {
        return new Question(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Question rename(String name) {
        return new Question(name, null);
    }
}