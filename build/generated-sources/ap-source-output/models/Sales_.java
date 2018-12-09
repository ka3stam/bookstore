package models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Book;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-09T10:16:44")
@StaticMetamodel(Sales.class)
public class Sales_ { 

    public static volatile SingularAttribute<Sales, Date> date;
    public static volatile SingularAttribute<Sales, Integer> sold;
    public static volatile SingularAttribute<Sales, Integer> idsales;
    public static volatile SingularAttribute<Sales, Book> bookIsbn;

}