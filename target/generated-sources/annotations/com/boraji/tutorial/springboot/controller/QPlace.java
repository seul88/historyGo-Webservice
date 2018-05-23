package com.boraji.tutorial.springboot.controller;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlace is a Querydsl query type for Place
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QPlace extends BeanPath<Place> {

    private static final long serialVersionUID = -1407072070L;

    public static final QPlace place = new QPlace("place");

    public final StringPath description = createString("description");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> points = createNumber("points", Integer.class);

    public QPlace(String variable) {
        super(Place.class, forVariable(variable));
    }

    public QPlace(Path<? extends Place> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlace(PathMetadata metadata) {
        super(Place.class, metadata);
    }

}

