package lesson15;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils{
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        //Вариант 1 - передаем в конструктор 1 коллекцию, и отдельно добавляем другую
        Collection<Integer> result = new ArrayList<>(a);
        result.addAll(b);

        //Вариант 2 - создаем пустую коллекцию, и отдельно добавляем остальные две
        //result.addAll(a);
        //result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        if (a == null || b == null) {
            throw new NullPointerException("Коллекции не могут быть Null");
        }

        Collection<Integer> result = new ArrayList<>(a);
        result.retainAll(b);
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return Set.of();
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return Set.of();
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        if (a == null || b == null) {
            throw new NullPointerException("Коллекции не могут быть Null");
        }

        Collection<Integer> resultArray = new ArrayList<>(a);
        resultArray.removeAll(b);

        Collection<Integer> resultLinked = new ArrayList<>(b);
        resultLinked.removeAll(a);
        resultLinked.addAll(resultArray);

        return resultLinked;
    }
}
