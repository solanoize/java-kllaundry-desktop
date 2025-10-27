package com.kartikalabs.kllaundry.dao;

import java.util.List;

/**
 *
 * @author Yanzen
 */
public interface EntityDao<T, I> {
    public List<T> all();
    public T get(I id);
    public T create(T object);
    public T update(T object);
    public boolean delete(I id);
}
