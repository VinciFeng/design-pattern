package com.vinci.behavioral.responsibility;

/**
 * @author Vinci
 * @date 2022/07/20
 */
public class LoginHandler extends Handler {
    @Override
    public void doHandle(Member member) {
        System.out.println("登陆成功");
        member.setRoleName("管理员");
        chain.doHandle(member);
    }
}
