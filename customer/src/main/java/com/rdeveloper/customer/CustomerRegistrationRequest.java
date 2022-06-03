package com.rdeveloper.customer;

public record CustomerRegistrationRequest(String firsName,
                                          String lastName,
                                          String email) {
}
