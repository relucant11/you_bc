/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class ClassmatesTags implements Serializable {

    private static final long serialVersionUID = 1441003722;

    private final Integer tagId;
    private final String  tag;

    public ClassmatesTags(ClassmatesTags value) {
        this.tagId = value.tagId;
        this.tag = value.tag;
    }

    public ClassmatesTags(
        Integer tagId,
        String  tag
    ) {
        this.tagId = tagId;
        this.tag = tag;
    }

    public Integer getTagId() {
        return this.tagId;
    }

    public String getTag() {
        return this.tag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClassmatesTags (");

        sb.append(tagId);
        sb.append(", ").append(tag);

        sb.append(")");
        return sb.toString();
    }
}