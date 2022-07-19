package com.vinci.behavioral.delegate;

import java.util.HashMap;

/**
 * @author Vinci
 * @date 2022/07/19
 */
public class Leader implements IEmployee {

    private HashMap<String, IEmployee> employee = new HashMap<>();

    public Leader() {
        employee.put("设计", new EmployeeA());
        employee.put("编码", new EmployeeB());
    }

    @Override
    public void doing(String task) {
        employee.get(task).doing(task);
    }
}
