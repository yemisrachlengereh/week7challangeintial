package me.afua.thymeleafsecdemo.repositories;

import jdk.nashorn.internal.scripts.JO;
import me.afua.thymeleafsecdemo.entities.Jobseeker;
import me.afua.thymeleafsecdemo.entities.UserRole;
import org.springframework.data.repository.CrudRepository;

public interface JobseekerRepository extends CrudRepository<Jobseeker,Long> {


//    Jobseeker findByEmail(String email);
//    Long countByEmail(String email);
//
//    Long countByFull_name(String full_name);
//    Jobseeker findByField_of_skill(String  Field_of_skill);
//
//

//    public Jobseeker findByFull_name(String username) {
//
//       //select from users where username = username
//        return null;
//    }

//    Iterable<Jobseeker> findAllByFull_nameContainingIgnoreCase(String searchedname, String searchedname1);
//
}


