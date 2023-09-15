package business;

import Logging.Logger;
import dataAccess.CategoryDao;
import entitites.Category;

public class CategoryManager {
   private CategoryDao categoryDao;
   private Logger[] loggers;
   private Category[] category;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers,Category[] category) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.category=category;
    }
    public void add(Category category) throws Exception {
        for (Category category_ : this.category) {
            if (category_.getName().equals(category.getName())) {
                throw new Exception("Kategori mevcut");
            }
        }



        categoryDao.add(category);

        for (Logger logger : loggers){
            logger.log(category.getName());
        }
    }
}
