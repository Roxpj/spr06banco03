package negocio;

import persistencia.BancoDaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistencia.BancoDao;

@Service("neg")
public class BancoNegocioImpl implements BancoNegocio {
	
	//Injección por atributo
	@Autowired
	private BancoDao bancoDao;

//	public BancoNegocioImpl() {
//		bancoDao = new BancoDaoImpl();
//	}

	public void transferencia(long dni1, long dni2, double cantidad) {
		bancoDao.actualizaSaldo(dni1, cantidad);
		bancoDao.actualizaSaldo(dni2, -cantidad);
	}

	public BancoDao getBancoDao() {
		return bancoDao;
	}

	public void setBancoDao(BancoDao bancoDao) {
		this.bancoDao = bancoDao;
	}

}
