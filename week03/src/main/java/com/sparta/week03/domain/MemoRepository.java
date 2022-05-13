package com.sparta.week03.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface MemoRepository extends JpaRepository<Memo,Long> {
    List<Memo> findAllByOrderByModifiedAtDesc();
    //타임라인 서비스가 불러오는 메모 목록의 시간을, 조회 시간으로부터 24시간 이내로
    List<Memo> findAllByModifiedAtBetweenOrderByModifiedAtDesc(LocalDateTime start, LocalDateTime end);
}
