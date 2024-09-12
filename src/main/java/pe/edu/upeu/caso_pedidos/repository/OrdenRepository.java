package pe.edu.upeu.caso_pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.caso_pedidos.entity.Orden;

@Repository
public interface OrdenRepository extends JpaRepository<Orden, Long>{

}
