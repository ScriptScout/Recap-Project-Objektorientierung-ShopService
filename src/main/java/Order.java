import java.util.List;

//Add an order status to the Order (PROCESSING, IN_DELIVERY, COMPLETED) to determine the status of the order.
//
//To do this, create a new branch, create and push the commits, create a pull request, review the PR, and merge it into the main branch.
//

public record Order(
        String id,
        List<Product> products
) {
}
