package org.simplilearn.repository;

import org.simplilearn.entity.AdminDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDetailsRepository extends JpaRepository<AdminDetails, Integer>{

}
