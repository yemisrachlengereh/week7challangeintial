package me.afua.thymeleafsecdemo.repositories;

import me.afua.thymeleafsecdemo.entities.UserData;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserData,Long> {
    UserData findByUsername(String username);

    UserData findByEmail(String email);

    Long countByEmail(String email);

    Long countByUsername(String username);
}

//usernamepublic class UserRepo implements UserRepository
//{
//  //datacontext nhiberate data context
//    @Override
//    public UserData findByUsername(String username) {
//
//        //select from users where username = username
//        return null;
//    }
//
//    @Override
//    public UserData findByEmail(String email) {
//        return null;
//    }
//
//    @Override
//    public Long countByEmail(String email) {
//        return null;
//    }
//
//    @Override
//    public Long countByUsername(String username) {
//        return null;
//    }
//
//    @Override
//    public <S extends T> S save(S s) {
//        return null;
//    }
//
//    @Override
//    public <S extends T> Iterable<S> save(Iterable<S> iterable) {
//        return null;
//    }
//
//    @Override
//    public UserData findOne(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public boolean exists(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public Iterable<UserData> findAll() {
//        return null;
//    }
//
//    @Override
//    public Iterable<UserData> findAll(Iterable<Long> iterable) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void delete(Long aLong) {
//
//    }
//
//    @Override
//    public void delete(UserData userData) {
//
//    }
//
//    @Override
//    public void delete(Iterable<? extends UserData> iterable) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//}
//
//
