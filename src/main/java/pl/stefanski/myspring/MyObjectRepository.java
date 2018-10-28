package pl.stefanski.myspring;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyObjectRepository extends JpaRepository<MyObject, Long> {

}
