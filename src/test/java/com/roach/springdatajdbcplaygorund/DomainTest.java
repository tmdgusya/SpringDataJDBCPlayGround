package com.roach.springdatajdbcplaygorund;

import com.roach.springdatajdbcplaygorund.domain.Address;
import com.roach.springdatajdbcplaygorund.domain.User;
import com.roach.springdatajdbcplaygorund.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Sql(scripts = "/schema.sql")
public class DomainTest {


    @Autowired
    UserRepository userRepository;

    @Test
    void userAndAddressMappingTest() {
        User user = User.of("Roach", new Address("경기도 성남시", "분당구", "정자동"));
        userRepository.save(user);
    }

}
