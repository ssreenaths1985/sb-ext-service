package org.sunbird.assessment.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserQuizMasterRepository extends
		CassandraRepository<UserQuizMasterModel, UserQuizMasterPrimaryKeyModel>, UserQuizMasterRepositoryCustom {
}
