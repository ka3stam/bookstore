package converters;

import dao.CategoryGen;
import models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
/**
 *
 * @author matina
 */
@Component
public class IDconvertsToCategory  implements Converter<String, Category>{

    @Autowired
    CategoryGen cg;
    
    @Override
    public Category convert(String s) {
        return cg.getById(s);
    }
    
}