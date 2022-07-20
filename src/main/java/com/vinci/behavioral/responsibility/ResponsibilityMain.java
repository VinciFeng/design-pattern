package com.vinci.behavioral.responsibility;

/**
 * @author Vinci
 * @date 2022/07/20
 */
public class ResponsibilityMain {

    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("admin", "admin");
    }
}
