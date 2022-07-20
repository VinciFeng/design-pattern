package com.vinci.behavioral.template;

/**
 * @author Vinci
 * @date 2022/07/19
 */
public abstract class AbstractTemplate {

    protected void step1() {
        System.out.println("step1 completed.");
    }

    protected void step2() {
        System.out.println("step2 completed");
    }

    protected void step3() {
        System.out.println("step3 completed");
    }

    /** 用final关键字修饰，防止子类覆写 */
    public final void template() {
        step1();
        step2();
        step3();
    }
}
