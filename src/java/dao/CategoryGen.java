package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import models.Category;
import org.springframework.stereotype.Repository;

/**
 *
 * @author matina
 */
@Repository
public class CategoryGen {
    
    @PersistenceContext
    private EntityManager em;
    
    @Transactional
    public List<Category> bookCategories(){
        List<Category> categorylist = em.createNamedQuery("Category.findAll").getResultList();
        return categorylist;
    }
    
    @Transactional
    public Category getById(String s){
        int id = Integer.parseInt(s);
        Category category = (Category) em.createNamedQuery("Category.findById").setParameter("id", id).getSingleResult();
        return category;
    }
    
    
}
