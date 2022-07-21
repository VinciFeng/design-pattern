package com.vinci.behavioral.visitor;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class ConcreteElementA implements IElement {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return this.getClass().getSimpleName();
    }
}
