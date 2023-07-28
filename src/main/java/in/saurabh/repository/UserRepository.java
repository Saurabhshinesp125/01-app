package in.saurabh.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.saurabh.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity,Serializable>{

	@Query("FROM UserEntity WHERE email=:email")
	public UserEntity findUserByEmail(String email);
	@Query("select userId,uname from UserEntity where age=:age")
	public Object[] findUserByAge(Integer age);
	
	@Query(value ="select * from UserEntity where userId=:userId",nativeQuery=true)
	public UserEntity findUserById(Integer userId);
}
