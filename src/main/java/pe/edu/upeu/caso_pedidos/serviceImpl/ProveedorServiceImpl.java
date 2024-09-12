package pe.edu.upeu.caso_pedidos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.caso_pedidos.dao.ProveedorDao;
import pe.edu.upeu.caso_pedidos.entity.Proveedor;
import pe.edu.upeu.caso_pedidos.service.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService{

	@Autowired
	private ProveedorDao proveedorDao;
	@Override
	public Proveedor create(Proveedor p) {
		// TODO Auto-generated method stub
		return proveedorDao.create(p);
	}

	@Override
	public Proveedor update(Proveedor p) {
		// TODO Auto-generated method stub
		return proveedorDao.update(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		proveedorDao.delete(id);
	}

	@Override
	public Optional<Proveedor> read(Long id) {
		// TODO Auto-generated method stub
		return proveedorDao.read(id);
	}

	@Override
	public List<Proveedor> readAll() {
		// TODO Auto-generated method stub
		return proveedorDao.readAll();
	}

}
