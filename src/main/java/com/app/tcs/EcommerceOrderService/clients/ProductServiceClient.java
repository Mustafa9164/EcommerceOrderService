package com.app.tcs.EcommerceOrderService.clients;

import com.app.tcs.EcommerceOrderService.dto.ProductDTO;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductServiceClient {
    private static RestTemplate restTemplate;

    public ProductServiceClient(RestTemplate restTemplate) {
        this.restTemplate=restTemplate;
    }

    public static ProductDTO getProductById(Long productId){
        String url="http://ECOMMERCESPRING/api/products/" +productId;
        ResponseEntity<ProductDTO> response = restTemplate.getForEntity(url, ProductDTO.class);
        return response.getBody();
    }
}
