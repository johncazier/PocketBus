package com.vikingsen.bus;

public interface EventSubscription<T> {
    void handle(T t);
}
