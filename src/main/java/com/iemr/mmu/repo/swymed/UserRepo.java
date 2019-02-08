package com.iemr.mmu.repo.swymed;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.iemr.mmu.data.swymed.M_UserTemp;

public interface UserRepo extends CrudRepository<M_UserTemp, Long> {

	@Query(value="select u from M_UserTemp u left join  u.userSwymed user where u.userID=:userID and user.userID=:userID")
	M_UserTemp findOneMap(@Param("userID")Long userid);

}
