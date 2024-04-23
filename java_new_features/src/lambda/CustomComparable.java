package lambda;
@FunctionalInterface
public interface CustomComparable<T> {

	T compare(T t1,T t2);
}
