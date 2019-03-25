package jpaDemo.Service;

import jpaDemo.Repositories.PersonRepo;
import jpaDemo.entity.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepo personRepo;

    public void insertPerson(PersonEntity personEntity){
        personRepo.save(personEntity);
    }

    public Iterable<PersonEntity> getAllPerson(){
        return personRepo.findAll();
    }

    public void deletePerson(PersonEntity personEntity){
        personRepo.delete(personEntity.getId());
    }
}
