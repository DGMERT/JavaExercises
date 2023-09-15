package business;

import Logging.Logger;
import dataAccess.CategoryDao;
import entitites.Category;

public class CategoryManager {
   private CategoryDao categoryDao;
   private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }
    public void add(Category category){
        System.out.println("Kategori ismi tekrar edemez");

        categoryDao.add(category);

        for (Logger logger : loggers){
            logger.log(category.getName());
        }
    }
}
