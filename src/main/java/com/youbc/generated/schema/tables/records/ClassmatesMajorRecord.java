/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables.records;


import com.youbc.generated.schema.tables.ClassmatesMajor;

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
public class ClassmatesMajorRecord extends UpdatableRecordImpl<ClassmatesMajorRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 520265590;

    /**
     * Setter for <code>poke_you_bc.classmates_major.major_id</code>.
     */
    public ClassmatesMajorRecord setMajorId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.classmates_major.major_id</code>.
     */
    public Integer getMajorId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>poke_you_bc.classmates_major.major</code>.
     */
    public ClassmatesMajorRecord setMajor(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.classmates_major.major</code>.
     */
    public String getMajor() {
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
        return ClassmatesMajor.CLASSMATES_MAJOR.MAJOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ClassmatesMajor.CLASSMATES_MAJOR.MAJOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getMajorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getMajor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesMajorRecord value1(Integer value) {
        setMajorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesMajorRecord value2(String value) {
        setMajor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesMajorRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ClassmatesMajorRecord
     */
    public ClassmatesMajorRecord() {
        super(ClassmatesMajor.CLASSMATES_MAJOR);
    }

    /**
     * Create a detached, initialised ClassmatesMajorRecord
     */
    public ClassmatesMajorRecord(Integer majorId, String major) {
        super(ClassmatesMajor.CLASSMATES_MAJOR);

        set(0, majorId);
        set(1, major);
    }
}
