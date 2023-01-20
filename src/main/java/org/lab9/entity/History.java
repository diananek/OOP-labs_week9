package org.lab9.entity;

public interface History<T> {

    void addOperation(T operation);
     T findOperationById(Integer id);
    void removeOperationById(Integer id);
    String toString();
}
