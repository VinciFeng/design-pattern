package com.vinci.behavioral.visitor;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class ConcreteVisitorB implements IVisitor {
    @Override
    public void visit(ConcreteElementA element) {
        String result = element.operationA();
        System.out.println("result from " + element.getClass().getSimpleName() + ": " +result);
    }

    @Override
    public void visit(ConcreteElementB element) {
        int result = element.operationB();
        System.out.println("result from " + element.getClass().getSimpleName() + ": " + result);
    }
}
