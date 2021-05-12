package at.technikumwien.backendSystem.repository;

import at.technikumwien.backendSystem.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByOrderNo(long orderNo);
    List<Order> findAll();
}
