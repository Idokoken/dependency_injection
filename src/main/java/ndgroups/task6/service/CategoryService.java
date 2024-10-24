package ndgroups.task6.service;

import ndgroups.task6.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private CategoryRepository  categoryRepository;

    public void setCategoryRepository(CategoryRepository categoryRepository) {
            this.categoryRepository = categoryRepository;
    }



}
