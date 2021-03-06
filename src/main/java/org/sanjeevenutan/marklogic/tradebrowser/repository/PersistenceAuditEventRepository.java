package org.sanjeevenutan.marklogic.tradebrowser.repository;

import java.util.List;

import org.joda.time.LocalDateTime;
import org.sanjeevenutan.marklogic.tradebrowser.domain.PersistentAuditEvent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the PersistentAuditEvent entity.
 */
public interface PersistenceAuditEventRepository extends
		JpaRepository<PersistentAuditEvent, String> {

	List<PersistentAuditEvent> findByPrincipal(String principal);

	List<PersistentAuditEvent> findByPrincipalAndAuditEventDateAfter(
			String principal, LocalDateTime after);

	List<PersistentAuditEvent> findAllByAuditEventDateBetween(
			LocalDateTime fromDate, LocalDateTime toDate);
}
