package com.microservice.message.dto;

/**
 * @param accountNumber
 * @param name
 * @param email
 * @param phoneNumber
 */
public record AccountsMsgDto(Long accountNumber, String name, String email, String phoneNumber) {
}
