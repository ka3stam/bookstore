package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Book;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-09T10:16:44")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, Integer> id;
    public static volatile SingularAttribute<Category, String> title;
    public static volatile CollectionAttribute<Category, Book> bookCollection;

}