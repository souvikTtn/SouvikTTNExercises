package jpaDemo.Repositories;

import jpaDemo.entity.PersonEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepo extends CrudRepository<PersonEntity,Integer> {

    public List<PersonEntity> findPersonEntitiesByFirstName(String name);
    public List<PersonEntity> findPersonEntitiesByLastName(String name);
    public PersonEntity findPersonEntitiesById(Integer id);

    @Query("select p from PersonEntity p where age=:age")
    List<PersonEntity> customFindByAge(@Param("age") Integer age);

    @Query("select firstName,lastName from PersonEntity p where age=:age")
    List<Object[]> customFindMultipleByAge(@Param("age") Integer age);

    @Query("select count(p) from PersonEntity p where firstName=:name")
    Integer customCount(@Param("name")String name);

    @Query("select p from PersonEntity p where age=:age")
    List<PersonEntity> customGetPersonInfo(@Param("age")Integer age);

     List<PersonEntity> findByAgeGreaterThanOrderByIdDesc(Integer age);

     Page<PersonEntity> findByAgeGreaterThanOrderByIdDesc(Integer age, Pageable pageable);

     List<PersonEntity> findByAgeGreaterThan(Integer age,Sort sort);

     List<PersonEntity> findDistinctByFirstName(String name);

     List<PersonEntity>findByFirstNameIsLike(String name);

    List<PersonEntity> findByFirstNameOrAge(String name, Integer age);
    List<PersonEntity> findByFirstNameAndAge(String name, Integer age);

    List<PersonEntity> findByAgeBetween(int min,int max);

    List<PersonEntity> findByAgeGreaterThan(Integer age);
    List<PersonEntity> findByAgeLessThan(Integer age);

    List<PersonEntity> findByFirstNameNot(String name);

    List<PersonEntity> findByFirstNameIn(List<String> nameList);

    List<PersonEntity> findByFirstNameIgnoreCase(String name);

}
