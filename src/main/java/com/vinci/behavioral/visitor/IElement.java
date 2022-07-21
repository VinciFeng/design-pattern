package com.vinci.behavioral.visitor;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public interface IElement {
    void accept(IVisitor visitor);
}
