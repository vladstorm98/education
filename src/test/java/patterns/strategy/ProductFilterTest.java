package patterns.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import patterns.strategy.ProductFilter.CategoryStrategy;
import patterns.strategy.ProductFilter.CheapProductsStrategy;
import patterns.strategy.ProductFilter.ProductCategory;
import patterns.strategy.ProductFilter.ProductFilter;
import patterns.strategy.ProductFilter.Product;
import patterns.strategy.ProductFilter.TopRatedStrategy;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ProductFilterTest {

    private ProductFilter filter;

    @BeforeEach
    void setUp() {
        filter = new ProductFilter();
    }

    @Test
    @DisplayName("""
            CategoryStrategy
                GIVEN The strategy which filter by category
                WHEN Filter the list of products
                THEN The list should returns with filtered products
            """)
    void testCategoryStrategy() {
        // GIVEN
        var products = prepareProducts();
        filter.setStrategy(new CategoryStrategy(ProductCategory.ELECTRONICS));

        // WHEN
        var filteredProducts = filter.filter(products);

        // THEN
        assertThat(filteredProducts)
                .hasSize(3)
                .extracting(Product::category)
                .containsOnly(ProductCategory.ELECTRONICS);
    }

    @Test
    @DisplayName("""
            CheapProductsStrategy
                GIVEN The strategy which filter by price
                WHEN Filter the list of products
                THEN The list should returns with filtered products
            """)
    void testCheapProductsStrategy() {
        // GIVEN
        var maxPrice = 500;
        var products = prepareProducts();
        filter.setStrategy(new CheapProductsStrategy(maxPrice));

        // WHEN
        var filteredProducts = filter.filter(products);

        // THEN
        assertThat(filteredProducts)
                .hasSize(3)
                .extracting(Product::price)
                .allMatch(price -> price < maxPrice);
    }

    @Test
    @DisplayName("""
            TopRatedStrategy
                GIVEN The strategy which filter by rating
                WHEN Filter the list of products
                THEN The list should returns with filtered products
            """)
    void testTopRatedStrategy() {
        // GIVEN
        var minRating = 4;
        var products = prepareProducts();
        filter.setStrategy(new TopRatedStrategy(minRating));

        // WHEN
        var filteredProducts = filter.filter(products);

        // THEN
        assertThat(filteredProducts)
                .hasSize(4)
                .extracting(Product::rating)
                .allMatch(rating -> rating >= minRating);
    }

    @Test
    @DisplayName("""
            IllegalStateException
                GIVEN The strategy didn't set
                WHEN-THEN IllegalStateException should be thrown
            """)
    void shouldThrowIllegalStateException_whenStrategyNotSet() {
        // GIVEN
        var products = prepareProducts();

        // WHEN-THEN
        assertThatThrownBy(() -> filter.filter(products))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Strategy not set");
    }

    private List<Product> prepareProducts() {
        return List.of(
                new Product("Laptop", ProductCategory.ELECTRONICS, 1200, 5),
                new Product("Mouse", ProductCategory.ELECTRONICS, 20, 4),
                new Product("Chair", ProductCategory.FURNITURE, 150, 3),
                new Product("Book", ProductCategory.BOOKS, 10, 5),
                new Product("Phone", ProductCategory.ELECTRONICS, 800, 4)
        );
    }
}
