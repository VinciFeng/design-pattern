package com.vinci.behavioral.delegate;

/**
 * @author Vinci
 * @date 2022/07/19
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String task) {
        System.out.println("员工B正在做" + task);
    }
}
