/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carrentapplication.repository;

import java.util.ArrayList;

/**
 *
 * @author Manidu
 * @param <T>
 * @param <ID>
 */
public interface CrudRepository<T,ID> extends SuperRepository {
        Integer add(T t) throws Exception;
        boolean update(T t) throws Exception;
        boolean delete(ID id) throws Exception;
        T get(ID id) throws Exception;
        ArrayList<T> getAll() throws Exception;
}