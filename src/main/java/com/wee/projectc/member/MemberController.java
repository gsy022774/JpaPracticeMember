package com.wee.projectc.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class MemberController {


    @GetMapping("/member/list")
    public String viewListMembers(Model model) {

        return "member/list";
    }
}
