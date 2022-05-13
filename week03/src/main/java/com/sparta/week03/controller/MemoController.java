package com.sparta.week03.controller;

import com.sparta.week03.domain.Memo;
import com.sparta.week03.domain.MemoRepository;
import com.sparta.week03.domain.MemoRequestDto;
import com.sparta.week03.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemoController {
    private final MemoRepository memoRepository;
    private final MemoService memoService;

    @PostMapping("/api/memos")
    public Memo createMemo(@RequestBody MemoRequestDto requestDto){
        Memo memo = new Memo(requestDto);
        return memoRepository.save(memo);
    }

    @GetMapping("/api/memos")
    public List<Memo> readMemo(){
        //return memoRepository.findAllByOrderByModifiedAtDesc();
        //타임라인 서비스가 불러오는 메모 목록의 시간을, 조회 시간으로부터 24시간 이내로
        LocalDateTime start = LocalDateTime.now().minusDays(1); //하루전
        LocalDateTime end = LocalDateTime.now(); //오늘
        return memoRepository.findAllByModifiedAtBetweenOrderByModifiedAtDesc(start,end);
    }

    @DeleteMapping("/api/memos/{id}")
    public Long deleteMemo(@PathVariable Long id){
        memoRepository.deleteById(id);
        return id;
    }

    @PutMapping("/api/memos/{id}")
    public Long updateMemo(@PathVariable Long id, @RequestBody MemoRequestDto requestDto){
        memoService.update(id,requestDto);
        return id;
    }
}
