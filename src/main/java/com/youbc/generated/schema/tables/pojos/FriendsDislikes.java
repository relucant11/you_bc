/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class FriendsDislikes implements Serializable {

    private static final long serialVersionUID = 1653835636;

    private final String    disliker;
    private final String    dislikee;
    private final Timestamp timeCreated;

    public FriendsDislikes(FriendsDislikes value) {
        this.disliker = value.disliker;
        this.dislikee = value.dislikee;
        this.timeCreated = value.timeCreated;
    }

    public FriendsDislikes(
        String    disliker,
        String    dislikee,
        Timestamp timeCreated
    ) {
        this.disliker = disliker;
        this.dislikee = dislikee;
        this.timeCreated = timeCreated;
    }

    public String getDisliker() {
        return this.disliker;
    }

    public String getDislikee() {
        return this.dislikee;
    }

    public Timestamp getTimeCreated() {
        return this.timeCreated;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FriendsDislikes (");

        sb.append(disliker);
        sb.append(", ").append(dislikee);
        sb.append(", ").append(timeCreated);

        sb.append(")");
        return sb.toString();
    }
}
