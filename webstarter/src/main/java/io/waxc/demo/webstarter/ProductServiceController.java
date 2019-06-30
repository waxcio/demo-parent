package io.waxc.demo.webstarter;

import io.waxc.demo.webstarter.exception.ProductNotfoundException;
import io.waxc.demo.webstarter.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@ControllerAdvice // @ControllerAdvice: handle the exceptions globally.
@RestController // @RestController: define the RESTful web services, serving JSON or XML
public class ProductServiceController {
    private static Map<String, Product> productRepo = new HashMap<>();

    static {
        Product honey = new Product();
        honey.setId("1");
        honey.setName("Honey");
        productRepo.put(honey.getId(), honey);

        Product almond = new Product();
        almond.setId("2");
        almond.setName("Almond");
        productRepo.put(almond.getId(), almond);
    }

    // @RequestMapping: define the Request URI access and method (GET, POST, PUT, DELETE)
    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        productRepo.remove(id);
        return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
    }

    // @PathVariable: define the custom or dynamic request URI, variables in {}
    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
        if (!productRepo.containsKey(id)) throw new ProductNotfoundException();
        productRepo.remove(id);
        product.setId(id);
        productRepo.put(id, product);
        return new ResponseEntity<>("Product is updated successfully", HttpStatus.OK);
    }

    // @RequestBody: define the request body content type.
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
        productRepo.put(product.getId(), product);
        return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
    }

    // @RequestParam: read the request parameters from the Request URL
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ResponseEntity<Object> getProduct(
            @RequestParam(value = "name", required = false, defaultValue = "honey") String name) {
        return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
    }
}
