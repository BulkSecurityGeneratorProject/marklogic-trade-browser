package org.sanjeevenutan.marklogic.tradebrowser.repository;

import java.util.List;
import java.util.Optional;

import org.joda.time.DateTime;
import org.sanjeevenutan.marklogic.tradebrowser.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the User entity.
 */
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findOneByActivationKey(String activationKey);

	List<User> findAllByActivatedIsFalseAndCreatedDateBefore(DateTime dateTime);

	Optional<User> findOneByResetKey(String resetKey);

	Optional<User> findOneByEmail(String email);

	Optional<User> findOneByLogin(String login);

	@Override
	void delete(User t);

}
