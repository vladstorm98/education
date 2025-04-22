package patterns.strategy.ProductFilter;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CheapProductsStrategy implements ProductFilterStrategy {
    private final double maxPrice;

    @Override
    public List<Product> filter(List<Product> products) {
        return products.stream()
                .filter(product -> product.price() < maxPrice)
                .toList();
    }
}
