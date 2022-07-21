package com.vinci.behavioral.visitor;

import java.util.Random;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class ConcreteElementB implements IElement {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int operationB() {
        return new Random().nextInt(100);
    }
}
