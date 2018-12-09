package controllers;

import converters.IDconvertsToCategory;
import dao.CategoryGen;
import dao.Find;
import java.util.List;
import javax.servlet.ServletContext;
import models.Book;
import models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author matina
 */
@Controller
@RequestMapping(value="books")
public class Insert {
    
    @Autowired
    private Find cat;
    
    @Autowired
    CategoryGen cg;
    
    @Autowired
    IDconvertsToCategory conv;
    
    @Autowired
    ConversionService conversionService;
    
    @Autowired
    ServletContext servletContext;
    

    @RequestMapping(value="/menu",method=RequestMethod.GET)
    public ModelAndView categoryMenu(ModelMap model){
        List<Category> allcategories = cg.bookCategories();
       
        List<Book> allbooks =  cat.getallBooks();
        Book bestseller = allbooks.get(1);
        
        ModelAndView modelAndView = new ModelAndView("home");
        servletContext.setAttribute("allcategories", allcategories);
        modelAndView.addObject("bestseller", bestseller);
        return modelAndView;
    }
    
    @RequestMapping(value="/all",method=RequestMethod.GET)
    public ModelAndView books(ModelMap model){
        
        List<Book> allbooks =  cat.getallBooks();
        ModelAndView modelAndView = new ModelAndView("index");
        
        modelAndView.addObject("allbooks", allbooks);
        return modelAndView;
    }
    
    
    @RequestMapping(value="/book/{id}",method=RequestMethod.GET)
    public ModelAndView categoryBooks(ModelMap model,@PathVariable("id") String id){
        Category c = conv.convert(id);
        List<Book> allbooksbycategory = cat.getBooksByCategory(c);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("allbooks", allbooksbycategory);
        return modelAndView;
    }
    
    @RequestMapping(value="/insertionform",method=RequestMethod.GET)
    public String insertionform(ModelMap model){
        model.addAttribute("book", new Book());
        return "insertbook";
    }
    
    @RequestMapping(value="/toinsertbook",method=RequestMethod.GET)
    public String toinsertBook(ModelMap model){
        Book book = new Book();
//        List<Category> allcategories = cg.bookCategories();
//        model.addAttribute("categ", allcategories);
        model.addAttribute("book", book);
        return "insertbook";
            }
    
    @RequestMapping(value="/insertbook",method=RequestMethod.POST, consumes = {"multipart/form-data"})
    public String insertBook(ModelMap model, @ModelAttribute Book book, BindingResult result, @RequestParam(value = "cover") MultipartFile fileUpload)
    {
     
      //  Category c = conv.convert(id);
        cat.insertBook(book);
        System.out.println(fileUpload.getOriginalFilename());//
        return "index";
    }
    
    
    @RequestMapping(value="/searchbook/{id}",method=RequestMethod.GET)
    public String searchBook(ModelMap model, @PathVariable("id") String id){
        Category c = conversionService.convert(id,Category.class);
      //  List<Book> booklist = daobookservice.getBookByCategory(c);
        
        //model.addAttribute("booklist", booklist);
        return "searchresults";
            }
}
