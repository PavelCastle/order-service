package com.manningbooks.orderservice.order.web;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record OrderRequest(

        @NotBlank(message = "The book isbn must be defined.")
        String isbn,

        @NotNull(message = "The book quantity most be defined.")
        @Min(message = "You must order at least 1 item.", value = 1)
        @Max(value = 5, message = "You cannot order more than 5 items.")
        Integer quantity
) {
}

