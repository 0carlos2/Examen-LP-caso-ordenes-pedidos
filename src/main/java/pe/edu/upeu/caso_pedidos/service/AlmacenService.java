package pe.edu.upeu.caso_pedidos.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.caso_pedidos.entity.Almacen;

public interface AlmacenService {
	Almacen create(Almacen a);
	Almacen update(Almacen a);
	void delete(Long id);
	Optional<Almacen> read(Long id);
	List<Almacen> readAll();
}
