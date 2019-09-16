package com.syed.productcrud;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.syed.productcrud.entity.Product;

@Path("/productService")
@Produces("application/json")
@Consumes("application/json")
public interface ProductService {
	
	@Path("/products")
	@GET
	List<Product> getProducts();
	
	@Path("/products/{id}")
	@GET
	Product getProduct(@PathParam("id") int id);
	
	@Path("/products")
	@POST
	Response createProduct(Product product);
	
	@Path("/products")
	@PUT
	Response updateProduct(Product product);
	
}
