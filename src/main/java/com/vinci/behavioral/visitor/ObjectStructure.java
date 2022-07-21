package com.vinci.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class ObjectStructure {

    private List<IElement> list = new ArrayList<>();

    {
        this.list.add(new ConcreteElementA());
        this.list.add(new ConcreteElementB());
    }

    public void accept(IVisitor visitor) {
        for (IElement element : this.list) {
            element.accept(visitor);
        }
    }
}
