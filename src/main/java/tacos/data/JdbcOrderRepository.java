package tacos.data;

import java.text.SimpleDateFormat;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import tacos.Order;
import tacos.Taco;

@Repository
public class JdbcOrderRepository implements OrderRepository{
	private JdbcTemplate jdbc;
	
	@Override
	public Order save(Order order) {
		jdbc.update("insert into taco_order (id, name, street, city, state, zip, cc_number, cc_expiration, cccvv,placed_at) values (?, ?, ?,?,?,?,?,?,?,?)", 
				order.getId(),
				order.getName(),
				order.getStreet(),
				order.getCity(),
				order.getState(),
				order.getZip(),
				order.getCcNumber(),
				order.getCcExpiration(),
				order.getCcCVV(),
				order.getPlacedAt());
		return order;
	}

	@Override
	public <S extends Order> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Order> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Order> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Order> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Order entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Order> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}
