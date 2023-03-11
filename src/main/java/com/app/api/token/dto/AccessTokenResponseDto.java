package com.app.api.token.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
@Builder
public class AccessTokenResponseDto {

    @Schema(description = "grantType", example = "Bearer", required = true)
    private String grantType;
    @Schema(description = "accessToken", example = "eyJ0eXBlIjoiSldUIiwiYWxnIjoiSFM1MTIifQ.eyJzdWIiOiJBQ0NFU1MiLCJpYXQiOjE2NzgyODI3NDAsImV4cCI6MTY3ODI4MzY0MCwibWVtYmVySWQiOjEsInJvbGUiOiJBRE1JTiJ9.ju3CVxZFBfrHnKA_0Vl2Kip_tL4Z1yVBiJw74_yAEYY1b0_s3OQoO79btjAA5Adz5xrS61jGlfkK1tWPIFPSrw", required = true)
    private String accessToken;
    @Schema(description = "access token 만료 시간", example = "2022-07-22 18:13:16", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private Date accessTokenExpireTime;

}
