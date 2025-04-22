package patterns.strategy.ProductFilter;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TopRatedStrategy implements ProductFilterStrategy {
    private final int minRating;

    @Override
    public List<Product> filter(List<Product> products) {
        return products.stream()
                .filter(product -> product.rating() >= minRating)
                .toList();
    }
}
