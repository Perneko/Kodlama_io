package Check;

import Entity.Gamer;
import Interfaces.CheckService;

public abstract class BaseCheck implements CheckService {

	@Override
	public abstract Boolean Checkking(Gamer gamer);

}
