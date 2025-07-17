package com.app.tcs.EcommerceOrderService.clients;

import com.app.tcs.EcommerceOrderService.dto.ProductDTO;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductServiceClient {
    private static RestTemplateBuilder restTemplateBuilder = null;

    public ProductServiceClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    public static ProductDTO getProductById(Long productId){
        RestTemplate restTemplate = restTemplateBuilder.build();
        String url="http://localhost:8081/api/products/" +productId;
        ResponseEntity<ProductDTO> response = restTemplate.getForEntity(url, ProductDTO.class);
        return response.getBody();
    }
}
