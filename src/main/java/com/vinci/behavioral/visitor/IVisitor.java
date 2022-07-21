package com.vinci.behavioral.visitor;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public interface IVisitor {

    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}
