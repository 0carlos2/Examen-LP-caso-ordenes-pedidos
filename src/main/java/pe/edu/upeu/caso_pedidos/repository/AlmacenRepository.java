package pe.edu.upeu.caso_pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.caso_pedidos.entity.Almacen;

@Repository
public interface AlmacenRepository extends JpaRepository<Almacen, Long>{

}
