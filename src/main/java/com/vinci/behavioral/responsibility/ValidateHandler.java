package com.vinci.behavioral.responsibility;

/**
 * @author Vinci
 * @date 2022/07/20
 */
public class ValidateHandler extends Handler {
    @Override
    public void doHandle(Member member) {
        if (StringUtil.isEmpty(member.getLoginName()) || StringUtil.isEmpty(member.getLoginPass())) {
            System.out.println("用户名或密码为空");
            return;
        }
        System.out.println("用户名和密码校验成功，可以往下执行");
        chain.doHandle(member);
    }
}
