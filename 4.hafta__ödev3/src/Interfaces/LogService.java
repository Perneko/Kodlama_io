package Interfaces;
import Entity.Gamer;

public interface LogService {
	void Add(Gamer gamer);
	void Delete(Gamer gamer);
	void Update(Gamer gamer);
}
