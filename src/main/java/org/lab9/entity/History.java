package org.lab9.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public abstract class History<T> {
    @Getter @Setter private List<T> operationsList;

    public abstract void addOperation(T operation);
    public abstract T findOperationById(Integer id);
    public abstract void removeOperationById(Integer id);
    public abstract String toString();
}
