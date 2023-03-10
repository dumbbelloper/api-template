package com.app.api.member.dto;

import com.app.domain.member.constant.Role;
import com.app.domain.member.entity.Member;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberInfoResponseDto {

    @Schema(description = "회원 id", example = "1", required = true)
    private Long memberId;
    @Schema(description = "이메일", example = "dumbbelloper@gmail.com", required = true)
    private String email;
    @Schema(description = "회원 이름", example = "문용민", required = true)
    private String memberName;
    @Schema(description = "프로필 이미지 경로", example = "https://cloudflarecdn.com", required = true)
    private String profile;
    @Schema(description = "역할", example = "USER", required = true)
    private Role role;

    public static MemberInfoResponseDto of(Member member) {
        return MemberInfoResponseDto.builder()
                .memberId(member.getMemberId())
                .memberName(member.getMemberName())
                .email(member.getEmail())
                .profile(member.getProfile())
                .role(member.getRole())
                .build();
    }
}
