package com.manningbooks.orderservice.order.event;

public record OrderAcceptedMessage (
        Long orderId
){}
