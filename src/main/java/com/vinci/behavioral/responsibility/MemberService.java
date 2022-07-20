package com.vinci.behavioral.responsibility;

import javax.xml.validation.ValidatorHandler;

/**
 * @author Vinci
 * @date 2022/07/20
 */
public class MemberService {

    public void login(String loginName, String loginPass) {
        Handler.Builder builder = new Handler.Builder();
        Handler handler = builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler())
                .build();
        handler.doHandle(new Member(loginName, loginPass));
    }
}
