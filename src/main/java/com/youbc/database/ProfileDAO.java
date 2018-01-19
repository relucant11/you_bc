package com.youbc.database;

import static com.youbc.generated.schema.tables.RoommatesLocations.ROOMMATES_LOCATIONS;
import static com.youbc.generated.schema.tables.RoommatesHometown.ROOMMATES_HOMETOWN;
import static com.youbc.generated.schema.tables.RoommatesTags.ROOMMATES_TAGS;
import static com.youbc.generated.schema.tables.RoommatesProfile.ROOMMATES_PROFILE;
import static com.youbc.generated.schema.tables.RoommatesProfileTags.ROOMMATES_PROFILE_TAGS;

import static com.youbc.generated.schema.tables.ClassmatesMajor.CLASSMATES_MAJOR;
import static com.youbc.generated.schema.tables.ClassmatesProfile.CLASSMATES_PROFILE;
import static com.youbc.generated.schema.tables.ClassmatesCourses.CLASSMATES_COURSES;
import static com.youbc.generated.schema.tables.ClassmatesTags.CLASSMATES_TAGS;
import static com.youbc.generated.schema.tables.ClassmatesProfileCourses.CLASSMATES_PROFILE_COURSES;
import static com.youbc.generated.schema.tables.ClassmatesProfileTags.CLASSMATES_PROFILE_TAGS;

import static com.youbc.generated.schema.tables.FriendsProfile.FRIENDS_PROFILE;
import static com.youbc.generated.schema.tables.Faculties.FACULTIES;
import static com.youbc.generated.schema.tables.RelationshipStatus.RELATIONSHIP_STATUS;
import static com.youbc.generated.schema.tables.FriendsProfileTags.FRIENDS_PROFILE_TAGS;
import static com.youbc.generated.schema.tables.FriendsTags.FRIENDS_TAGS;

import com.youbc.models.profile.ClassmatesProfile;
import com.youbc.models.profile.FriendsProfile;
import com.youbc.models.profile.RoommatesProfile;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Set;

@Component
public class ProfileDAO {

    private DSLContext dslContext;
    private UserDAO userDAO;

    @Autowired
    public ProfileDAO(DSLContext dslContext, UserDAO userDAO) {
        this.dslContext = dslContext;
        this.userDAO = userDAO;
    }

    public Optional<RoommatesProfile> fetchRoommatesProfile(String userId) {
        Record3<String, String, String> profile = dslContext
                .select(
                        ROOMMATES_LOCATIONS.LOCATION,
                        ROOMMATES_HOMETOWN.HOMETOWN,
                        ROOMMATES_PROFILE.MOTTO
                )
                .from(ROOMMATES_PROFILE, ROOMMATES_LOCATIONS, ROOMMATES_HOMETOWN)
                .where(
                        ROOMMATES_PROFILE.USER_ID.eq(userId)
                                .and(ROOMMATES_LOCATIONS.LOCATION.eq(ROOMMATES_PROFILE.LOCATION))
                                .and(ROOMMATES_HOMETOWN.HOMETOWN.eq(ROOMMATES_PROFILE.HOMETOWN))
                )
                .fetchOne();

        Result<Record1<String>> profileTags = dslContext
                .select(ROOMMATES_TAGS.TAG)
                .from(ROOMMATES_TAGS, ROOMMATES_PROFILE, ROOMMATES_PROFILE_TAGS)
                .where(
                        ROOMMATES_TAGS.TAG.eq(ROOMMATES_PROFILE_TAGS.TAG)
                        .and(ROOMMATES_PROFILE_TAGS.USER_ID.eq(ROOMMATES_PROFILE.USER_ID))
                        .and(ROOMMATES_PROFILE.USER_ID.eq(userId))
                )
                .fetch();
        if (profile == null) {
            return Optional.empty();
        } else {
            return Optional.of(
                    new RoommatesProfile(
                            profile.value1(),
                            profile.value2(),
                            profile.value3(),
                            profileTags.intoSet(ROOMMATES_TAGS.TAG)
                    )
            );
        }
    }

    public Optional<ClassmatesProfile> fetchClassmatesProfile(String userID) {
        Record2<String, String> profile = dslContext
                .select(CLASSMATES_MAJOR.MAJOR, CLASSMATES_PROFILE.MOTTO)
                .from(CLASSMATES_PROFILE, CLASSMATES_TAGS)
                .where(
                        CLASSMATES_PROFILE.USER_ID.eq(userID)
                                .and(CLASSMATES_PROFILE.MARJOR.eq(CLASSMATES_MAJOR.MAJOR))
                )
                .fetchOne();
        Result<Record1<String>> courses = dslContext
                .select(CLASSMATES_COURSES.COURSE)
                .from(CLASSMATES_PROFILE, CLASSMATES_COURSES, CLASSMATES_PROFILE_COURSES)
                .where(
                        CLASSMATES_PROFILE.USER_ID.eq(userID)
                        .and(CLASSMATES_COURSES.COURSE.eq(CLASSMATES_PROFILE_COURSES.COURSE))
                        .and(CLASSMATES_PROFILE.USER_ID.eq(CLASSMATES_PROFILE_COURSES.USER_ID))
                ).fetch();
        Result<Record1<String>> tags = dslContext
                .select(CLASSMATES_TAGS.TAG)
                .from(CLASSMATES_PROFILE, CLASSMATES_TAGS, CLASSMATES_PROFILE_TAGS)
                .where(
                        CLASSMATES_PROFILE.USER_ID.eq(userID)
                        .and(CLASSMATES_TAGS.TAG.eq(CLASSMATES_PROFILE_TAGS.TAG))
                        .and(CLASSMATES_PROFILE.USER_ID.eq(CLASSMATES_PROFILE_TAGS.USER_ID))
                )
                .fetch();
        if (profile == null) {
            return Optional.empty();
        } else {
            return Optional.of(
                    new ClassmatesProfile(
                            profile.value1(),
                            courses.intoSet(CLASSMATES_COURSES.COURSE),
                            profile.value2(),
                            tags.intoSet(CLASSMATES_TAGS.TAG)
                    )
            );
        }
    }

    public Optional<FriendsProfile> fetchFriendsProfile(String userId) {
        Record3<String, String, String> profile = dslContext
                .select(FACULTIES.FACULTY, RELATIONSHIP_STATUS.RELATIONSHIP, FRIENDS_PROFILE.MOTTO)
                .from(FRIENDS_PROFILE, FACULTIES, RELATIONSHIP_STATUS)
                .where(
                        FRIENDS_PROFILE.USER_ID.eq(userId)
                        .and(FRIENDS_PROFILE.FACULTY.eq(FACULTIES.FACULTY))
                        .and(FRIENDS_PROFILE.RELATIONSHIP.eq(RELATIONSHIP_STATUS.RELATIONSHIP))
                )
                .fetchOne();
        Result<Record1<String>> tags = dslContext
                .select(FRIENDS_TAGS.TAG)
                .from(FRIENDS_PROFILE, FRIENDS_PROFILE_TAGS, FRIENDS_TAGS)
                .where(
                        FRIENDS_PROFILE.USER_ID.eq(userId)
                        .and(FRIENDS_TAGS.TAG.eq(FRIENDS_PROFILE_TAGS.TAG))
                        .and(FRIENDS_PROFILE.USER_ID.eq(FRIENDS_PROFILE_TAGS.USER_ID))
                )
                .fetch();
        if (profile == null) {
            return Optional.empty();
        } else {
            return Optional.of(
                    new FriendsProfile(
                            profile.value1(),
                            profile.value2(),
                            profile.value3(),
                            tags.intoSet(FRIENDS_TAGS.TAG)
                    )
            );
        }
    }

    public Set<String> getMajors() {
        return dslContext
                .select(CLASSMATES_MAJOR.MAJOR)
                .from(CLASSMATES_MAJOR)
                .fetch()
                .intoSet(CLASSMATES_MAJOR.MAJOR);
    }

    public Set<String> getCourses() {
        return dslContext
                .select(CLASSMATES_COURSES.COURSE)
                .from(CLASSMATES_COURSES)
                .fetch()
                .intoSet(CLASSMATES_COURSES.COURSE);
    }

    public Set<String> getClassmatesTags() {
        return dslContext
                .select(CLASSMATES_TAGS.TAG)
                .from(CLASSMATES_TAGS)
                .fetch()
                .intoSet(CLASSMATES_TAGS.TAG);
    }

    public Set<String> getLocations() {
        return dslContext
                .select(ROOMMATES_LOCATIONS.LOCATION)
                .from(ROOMMATES_LOCATIONS)
                .fetch()
                .intoSet(ROOMMATES_LOCATIONS.LOCATION);
    }

    public Set<String> getHometowns() {
        return dslContext
                .select(ROOMMATES_HOMETOWN.HOMETOWN)
                .from(ROOMMATES_HOMETOWN)
                .fetch()
                .intoSet(ROOMMATES_HOMETOWN.HOMETOWN);
    }

    public Set<String> getRoommatesTags() {
        return dslContext
                .select(ROOMMATES_TAGS.TAG)
                .from(ROOMMATES_TAGS)
                .fetch()
                .intoSet(ROOMMATES_TAGS.TAG);
    }

    public Set<String> getFaculties() {
        return dslContext
                .select(FACULTIES.FACULTY)
                .from(FACULTIES)
                .fetch()
                .intoSet(FACULTIES.FACULTY);
    }

    public Set<String> getRelationshipStatuses() {
        return dslContext
                .select(RELATIONSHIP_STATUS.RELATIONSHIP)
                .from(RELATIONSHIP_STATUS)
                .fetch()
                .intoSet(RELATIONSHIP_STATUS.RELATIONSHIP);
    }

    public Set<String> getFriendsTags() {
        return dslContext
                .select(FRIENDS_TAGS.TAG)
                .from(FRIENDS_TAGS)
                .fetch()
                .intoSet(FRIENDS_TAGS.TAG);
    }

    public void fillClassmatesProfile(String userID, String major, Set<String> courses, String motto, Set<String> tags) {
        if (!userDAO.classmatesProfileExists(userID)) {
            userDAO.initClassmatesProfile(userID);
        }
        dslContext.update(CLASSMATES_PROFILE)
                .set(CLASSMATES_PROFILE.MARJOR, major)
                .set(CLASSMATES_PROFILE.MOTTO, motto)
                .execute();

        dslContext.delete(CLASSMATES_PROFILE_COURSES)
                .where(CLASSMATES_PROFILE_COURSES.USER_ID.eq(userID))
                .execute();
        courses.forEach(course ->
                dslContext.insertInto(CLASSMATES_PROFILE_COURSES)
                        .set(CLASSMATES_PROFILE_COURSES.USER_ID, userID)
                        .set(CLASSMATES_PROFILE_COURSES.COURSE, course)
                        .execute()
        );

        dslContext.delete(CLASSMATES_PROFILE_TAGS)
                .where(CLASSMATES_PROFILE_TAGS.USER_ID.eq(userID))
                .execute();
        tags.forEach(tag ->
                dslContext.insertInto(CLASSMATES_PROFILE_TAGS)
                        .set(CLASSMATES_PROFILE_TAGS.USER_ID, userID)
                        .set(CLASSMATES_PROFILE_TAGS.TAG, tag)
                        .execute()
        );
    }

    public void fillRoommatesProfile(String userID, String location, String hometown, String motto, Set<String> tags) {
        if (!userDAO.roommatesProfileExists(userID)) {
            userDAO.initRoommateProfile(userID);
        }
        dslContext.update(ROOMMATES_PROFILE)
                .set(ROOMMATES_PROFILE.LOCATION, location)
                .set(ROOMMATES_PROFILE.HOMETOWN, hometown)
                .set(ROOMMATES_PROFILE.MOTTO, motto)
                .execute();
        dslContext.delete(ROOMMATES_PROFILE_TAGS)
                .where(ROOMMATES_PROFILE_TAGS.USER_ID.eq(userID))
                .execute();
        tags.forEach(tag ->
            dslContext.insertInto(ROOMMATES_PROFILE_TAGS)
                    .set(ROOMMATES_PROFILE_TAGS.USER_ID, userID)
                    .set(ROOMMATES_PROFILE_TAGS.TAG, tag)
                    .execute()
        );
    }

    public void fillFriendsProfile(String userID, String faculty, String relationship, String motto, Set<String> tags) {
        if (!userDAO.friendsProfileExists(userID)) {
            userDAO.initFriendsProfile(userID);
        }
        dslContext.update(FRIENDS_PROFILE)
                .set(FRIENDS_PROFILE.FACULTY, faculty)
                .set(FRIENDS_PROFILE.RELATIONSHIP, relationship)
                .set(FRIENDS_PROFILE.MOTTO, motto)
                .execute();
        dslContext.delete(FRIENDS_PROFILE_TAGS)
                .where(FRIENDS_PROFILE_TAGS.USER_ID.eq(userID))
                .execute();
        tags.forEach(tag ->
                dslContext.insertInto(FRIENDS_PROFILE_TAGS)
                        .set(FRIENDS_PROFILE_TAGS.USER_ID, userID)
                        .set(FRIENDS_PROFILE_TAGS.TAG, tag)
                        .execute()
        );
    }

}
