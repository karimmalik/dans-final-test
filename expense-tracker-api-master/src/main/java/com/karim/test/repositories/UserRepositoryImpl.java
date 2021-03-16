package com.karim.test.repositories;

import com.karim.test.domain.User;
import com.karim.test.exceptions.EtAuthException;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static final String SQL_CREATE = "INSERT INTO ET_USERS(USER_ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD) VALUES(NEXTVAL('ET_USERS_SEQ'), ?, ?, ?, ?)";
    private static final String SQL_COUNT_BY_EMAIL = "SELECT COUNT(*) FROM ET_USERS WHERE EMAIL = ?";
    private static final String SQL_FIND_BY_ID = "SELECT USER_ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD " +
            "FROM ET_USERS WHERE USER_ID = ?";
    private static final String SQL_FIND_BY_EMAIL = "SELECT id, name, login_code, password, created_at, created_by, updated_at, updated_by " +
            "FROM USER WHERE login_code = ?";

    @Autowired
    JdbcTemplate jdbcTemplate;

//    @Override
//    public Integer create(Long id, String name, String login_code, String password, Date created_at, Long created_by,
//			Date updated_at, Long updated_by) throws EtAuthException {
//        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt(10));
//        try {
//            KeyHolder keyHolder = new GeneratedKeyHolder();
//            jdbcTemplate.update(connection -> {
//                PreparedStatement ps = connection.prepareStatement(SQL_CREATE, Statement.RETURN_GENERATED_KEYS);
////                ps.setString(1, firstName);
////                ps.setString(2, lastName);
////                ps.setString(3, email);
////                ps.setString(4, hashedPassword);
//                
//                ps.setString(1, name);
//                ps.setString(2, login_code);
//                ps.setString(3, password);
//                ps.setDate(4, created_at);
//                ps.setLong(5, created_by);
//	            ps.setDate(6, updated_at);
//				ps.setLong(7, updated_by);
//                return ps;
//            }, keyHolder);
//            return (Integer) keyHolder.getKeys().get("USER_ID");
//        }catch (Exception e) {
//            throw new EtAuthException("Invalid details. Failed to create account");
//        }
//    }

    @Override
    public User findByEmailAndPassword(String login_code, String password) throws EtAuthException {
        try {
            User user = jdbcTemplate.queryForObject(SQL_FIND_BY_EMAIL, new Object[]{login_code}, userRowMapper);
            if(!BCrypt.checkpw(password, user.getPassword()))
                throw new EtAuthException("Invalid email/password");
            return user;
        }catch (EmptyResultDataAccessException e) {
            throw new EtAuthException("Invalid email/password");
        }
    }

    @Override
    public Integer getCountByEmail(String email) {
        return jdbcTemplate.queryForObject(SQL_COUNT_BY_EMAIL, new Object[]{email}, Integer.class);
    }

    @Override
    public User findById(Integer userId) {
        return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new Object[]{userId}, userRowMapper);
    }

    private RowMapper<User> userRowMapper = ((rs, rowNum) -> {
        return new User(rs.getLong("id"),
                rs.getString("name"),
                rs.getString("login_code"),
                rs.getString("password"),
                rs.getDate("created_at"),
                rs.getLong("created_by"),
	            rs.getDate("updated_at"),
				rs.getLong("updated_by"));
    });
}
