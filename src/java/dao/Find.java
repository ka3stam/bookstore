package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import models.Book;
import models.Category;
import org.springframework.stereotype.Repository;

/**
 *
 * @author matina
 */
@Repository
public class Find {
    
     //injected db connection
    @PersistenceContext
    private EntityManager em;//idio pou exw balei sto bean
    
    @Transactional //(List<Book> )c.getBookCollection()
    public List<Book> getBooksByCategory(Category c){
       String sql = "SELECT c FROM Book c WHERE c.category=?";
       List<Book> booklist =  (List<Book>) c.getBookCollection();
               //em.createQuery(sql, Book.class).setParameter(0, c).getResultList();
               return booklist;
    }
    
    @Transactional 
    public List<Book> getallBooks(){
       List<Book> allbooks =  em.createNamedQuery("Book.findAll").getResultList();
       return allbooks;
    }
    
    @Transactional
    public void insertBook(Book book){
        em.persist(book);
    }
    
}
