package pe.edu.upeu.caso_pedidos.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.caso_pedidos.entity.Orden;

public interface OrdenService {
	Orden create(Orden o);
	Orden update(Orden o);
	void delete(Long id);
	Optional<Orden> read(Long id);
	List<Orden> readAll();
}
