package gameProject.Core;

public interface RepositoryBase<T> {
	void add(T entity);
	void delete(T entity);
	void update(T entity);
}
