package com.pairlearning.expensetracker.repositories;

import java.util.Date;

import com.pairlearning.expensetracker.domain.User;
import com.pairlearning.expensetracker.exceptions.EtAuthException;

public interface UserRepository {

//    Integer create(Long id, String name, String login_code, String password, Date created_at, Long created_by,
//			Date updated_at, Long updated_by) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);

}
