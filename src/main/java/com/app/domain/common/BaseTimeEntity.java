package com.app.domain.common;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@EntityListeners(value = {AuditingEntityListener.class})
@MappedSuperclass // 부모클래스는 테이블과 매핑하지 않고, 상속받은 자식클래스만 테이블과 매핑시킨다.
// 객체로 생성 못하게 하기 위해 추상 클래스로 만든다
public abstract class BaseTimeEntity {
    @CreatedDate @Column(updatable = false)
    private LocalDateTime createTime;
    @LastModifiedDate
    private LocalDateTime updateTime;

}
