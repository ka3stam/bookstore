package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Category;
import models.Sales;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-09T10:16:44")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, String> cover;
    public static volatile CollectionAttribute<Book, Sales> salesCollection;
    public static volatile SingularAttribute<Book, Integer> numberOfPages;
    public static volatile SingularAttribute<Book, Long> isbn;
    public static volatile SingularAttribute<Book, Integer> numberOfPages1;
    public static volatile SingularAttribute<Book, String> title;
    public static volatile SingularAttribute<Book, Category> categoryId;

}