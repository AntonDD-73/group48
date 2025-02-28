package lesson16Home;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {
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

//        List<Integer> result = new ArrayList<>();
//
//        for (Integer i : a) {
//            if (b.contains(i)) {                          одно и тоже что и выше?
//                result.add(i);
//            }
//        }
//        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        if (a == null || b == null) {
            throw new NullPointerException("Коллекции не могут быть Null");
        }

        Set<Integer> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        if (a == null || b == null) {
            throw new NullPointerException("Коллекции не могут быть Null");
        }

        Set<Integer> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
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

//        List<Integer> result = new ArrayList<>();
//
//        for (Integer i : a) {
//            if (!b.contains(i)) {
//                result.add(i);
//            }
//        }                                             одно и тоже что и выше?
//        for (Integer i : b) {
//            if (!a.contains(i)) {
//                result.add(i);
//            }
//        }
//        return result;
    }
}
