package patterns.strategy.ProductFilter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductFilter {
    private ProductFilterStrategy strategy;

    public List<Product> filter(List<Product> products) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        return strategy.filter(products);
    }
}
