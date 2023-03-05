package com.app.external.oauth.kakao.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KakaoUserInfoResponseDto {

    private String id;
    @JsonProperty("kakao_account")
    private KakaoAccount kakaoAccount;

    @Getter
    @Setter
    public static class KakaoAccount {
        private String email;
        private Profile profile;
        @Getter
        @Setter
        public static class Profile {
            private String nickname;
            @JsonProperty("thumbnail_image_url") // 스네이크 케이스를 카멜 케이스로 받을 수 있게.
            private String thumbnailImageUrl;
        }
    }

}
