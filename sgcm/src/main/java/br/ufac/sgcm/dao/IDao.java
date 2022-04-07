package br.ufac.sgcm.dao;

import java.util.List;

public interface IDao<T> {

    List<T> getAll();
    T getById(Long id);
    List<T> getByAll(String termodeBusca);
    void insert(T objeto);
    void update(T objeto);
    void delete(Long id);
}
