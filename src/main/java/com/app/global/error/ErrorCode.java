package com.app.global.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    TEST(HttpStatus.INTERNAL_SERVER_ERROR, "001", "business exception test"),

    TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, "A-001", "토큰이 만료되었습니다."),
    NOT_VALID_TOKEN(HttpStatus.UNAUTHORIZED, "A-002", "유효하지 않은 토큰입니다."),
    NOT_EXISTS_AUTHORIZATION(HttpStatus.UNAUTHORIZED, "A-003", "Authorization Header is required"),
    NOT_VALID_BEARER_GRANT_TYPE(HttpStatus.UNAUTHORIZED, "A-004", "인증 타입이 Bearer 타입이 아닙니다."),
    REFRESH_TOKEN_NOT_FOUND(HttpStatus.UNAUTHORIZED, "A-005", "유효하지 않은 토큰입니다."),
    REFRESH_TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, "A-006", "해당 refresh token은 만료되었습니다."),
    INVALID_MEMBER_TYPE(HttpStatus.BAD_REQUEST, "M-001", "잘못된 회원 타입입니다."),
    ALREADY__REGISTERED_MEMBER(HttpStatus.BAD_REQUEST, "M-002", "이미 가입된 이메일입니다."),
    ;


    private final HttpStatus httpStatus;
    private final String errorCode;
    private final String message;

    ErrorCode(HttpStatus httpStatus, String errorCode, String message) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.message = message;
    }
}
