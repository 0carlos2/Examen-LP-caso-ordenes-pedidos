package pe.edu.upeu.caso_pedidos.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.caso_pedidos.entity.Tipo_orden;

public interface Tipo_ordenService {
	Tipo_orden create(Tipo_orden t);
	Tipo_orden update(Tipo_orden t);
	void delete(Long id);
	Optional<Tipo_orden> read(Long id);
	List<Tipo_orden> readAll();
}
