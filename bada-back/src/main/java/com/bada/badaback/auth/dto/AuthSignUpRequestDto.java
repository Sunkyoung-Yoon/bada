package com.bada.badaback.auth.dto;

public record AuthSignUpRequestDto(
        String name,
        String phone,
        String email,
        String social,
        int isParent,
        String profileUrl,
        String familyName
) {
}