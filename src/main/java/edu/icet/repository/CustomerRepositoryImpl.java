package edu.icet.repository;

import edu.icet.dto.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CustomerRepositoryImpl implements CustomerRepository{

    final JdbcTemplate jdbcTemplate;

    @Override
    public void addCustomer(CustomerDto customerDto) {

        String sql = "INSERT INTO customer VALUES ( ?,?,?,?,?,?,?,?,?)";

        jdbcTemplate.update(sql,
                customerDto.getId(),
                customerDto.getTitle(),
                customerDto.getName(),
                customerDto.getDob(),
                customerDto.getSalary(),
                customerDto.getAddress(),
                customerDto.getCity(),
                customerDto.getProvince(),
                customerDto.getPostalcode()
        );
    }

    @Override
    public void updateCustomer(CustomerDto customerDto) {

    }

    @Override
    public void deleteCustomer(String id) {

    }

    @Override
    public List<CustomerDto> getAllCustomers() {

        String sql = "SELECT * FROM customer";

        List<CustomerDto> customerDtos = jdbcTemplate.query(sql, (rs, rowNum) -> {
            CustomerDto customerDto = new CustomerDto();

            customerDto.setId(rs.getString(1));
            customerDto.setTitle(rs.getString(2));
            customerDto.setName(rs.getString(3));
            customerDto.setDob(rs.getDate(4));
            customerDto.setSalary(rs.getDouble(5));
            customerDto.setAddress(rs.getString(6));
            customerDto.setCity(rs.getString(7));
            customerDto.setProvince(rs.getString(8));
            customerDto.setPostalcode(rs.getString(9));

            return customerDto;
        });
        return customerDtos;
    }
}
