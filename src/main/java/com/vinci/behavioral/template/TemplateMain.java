package com.vinci.behavioral.template;

/**
 * 模板方法模式
 * @author Vinci
 * @date 2022/07/19
 */
public class TemplateMain {

    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteStep();
        template.template();
    }
}
