package com.kartikalabs.kllaundry.dao;

import java.util.List;

/**
 *
 * @author Solanoize
 */
public interface BaseDao<T, I> {
    public List<T> all();
    public T get(I identifier);
    public T create(T object);
    public T update(I identifier, T object);
    public boolean delete(I id);
}
