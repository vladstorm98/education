package patterns.strategy.ProductFilter;

import java.util.List;

public interface ProductFilterStrategy {
    List<Product> filter(List<Product> products);
}
