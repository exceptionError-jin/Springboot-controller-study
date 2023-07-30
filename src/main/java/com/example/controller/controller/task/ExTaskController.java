package com.example.controller.controller.task;

import com.example.controller.domain.vo.ExProductVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/exPro/*")
public class ExTaskController {
    //페이지 이동
    @GetMapping("exProduct")
    public void GoToProductForm(ExProductVO exProductVO){;}
    //데이터 화면에 뿌리기
    @PostMapping("exProduct")
    public void write(ExProductVO exProductVO){;}

}
