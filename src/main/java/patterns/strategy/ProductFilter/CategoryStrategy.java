package patterns.strategy.ProductFilter;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CategoryStrategy implements ProductFilterStrategy {
    private final ProductCategory category;

    @Override
    public List<Product> filter(List<Product> products) {
        return products.stream()
                .filter(product -> product.category() == category)
                .toList();
    }
}
