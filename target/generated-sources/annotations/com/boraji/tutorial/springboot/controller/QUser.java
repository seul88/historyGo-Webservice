package com.boraji.tutorial.springboot.controller;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -183780936L;

    public static final QUser user = new QUser("user");

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final ListPath<Place, QPlace> places = this.<Place, QPlace>createList("places", Place.class, QPlace.class, PathInits.DIRECT2);

    public final NumberPath<Integer> points = createNumber("points", Integer.class);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

