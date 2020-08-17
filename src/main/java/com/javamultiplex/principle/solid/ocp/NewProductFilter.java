package com.javamultiplex.principle.solid.ocp;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Rohit Agarwal on 16/08/20 2:42 pm
 * @copyright www.javamultiplex.com
 */
public class NewProductFilter implements Filter<Product> {
    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> specification) {
        return items.stream().filter(specification::isSatisfied);
    }
}
