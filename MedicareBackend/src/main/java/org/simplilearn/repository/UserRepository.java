package org.simplilearn.repository;

import java.util.List;

import org.simplilearn.entity.OrderResponse;
import org.simplilearn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("SELECT new org.simplilearn.entity.OrderResponse(u.UserId,u.name,u.email, u.mobile, u.address, p.medicinename, p.seller"
			+ ", p.price, p.description, p.quantity, p.orderDateTime) FROM User u JOIN u.products p")
	public List<OrderResponse> joinUserProductTable();
}
