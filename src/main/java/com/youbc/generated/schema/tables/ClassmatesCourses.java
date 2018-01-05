/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables;


import com.youbc.generated.schema.Keys;
import com.youbc.generated.schema.PokeYouBc;
import com.youbc.generated.schema.tables.records.ClassmatesCoursesRecord;

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
public class ClassmatesCourses extends TableImpl<ClassmatesCoursesRecord> {

    private static final long serialVersionUID = -435956837;

    /**
     * The reference instance of <code>poke_you_bc.classmates_courses</code>
     */
    public static final ClassmatesCourses CLASSMATES_COURSES = new ClassmatesCourses();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClassmatesCoursesRecord> getRecordType() {
        return ClassmatesCoursesRecord.class;
    }

    /**
     * The column <code>poke_you_bc.classmates_courses.course_id</code>.
     */
    public final TableField<ClassmatesCoursesRecord, Integer> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>poke_you_bc.classmates_courses.course_name</code>.
     */
    public final TableField<ClassmatesCoursesRecord, String> COURSE_NAME = createField("course_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * Create a <code>poke_you_bc.classmates_courses</code> table reference
     */
    public ClassmatesCourses() {
        this("classmates_courses", null);
    }

    /**
     * Create an aliased <code>poke_you_bc.classmates_courses</code> table reference
     */
    public ClassmatesCourses(String alias) {
        this(alias, CLASSMATES_COURSES);
    }

    private ClassmatesCourses(String alias, Table<ClassmatesCoursesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ClassmatesCourses(String alias, Table<ClassmatesCoursesRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ClassmatesCoursesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLASSMATES_COURSES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ClassmatesCoursesRecord> getPrimaryKey() {
        return Keys.KEY_CLASSMATES_COURSES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ClassmatesCoursesRecord>> getKeys() {
        return Arrays.<UniqueKey<ClassmatesCoursesRecord>>asList(Keys.KEY_CLASSMATES_COURSES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassmatesCourses as(String alias) {
        return new ClassmatesCourses(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ClassmatesCourses rename(String name) {
        return new ClassmatesCourses(name, null);
    }
}
