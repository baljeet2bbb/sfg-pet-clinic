package guru.springframework.sfgpetclinic.services;

import java.util.Set;

interface CrudService<T, ID> {

    Set<T> findAll();
    T findById(ID Id);
    T save(T object);
    void delete(T object);
    void deleteById(ID Id);
}
