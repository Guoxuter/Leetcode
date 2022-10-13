package Simulation;

// 11.1
// 窥探迭代器
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {

    Iterator<Integer> iter;
    Integer next;

    public PeekingIterator(Iterator<Integer> iterator) {
        iter = iterator;
        if (iter.hasNext()) next = iter.next();
    }

    public Integer peek() {
        return next;
    }

    @Override
    public Integer next() {
        Integer ans = next;
        next = iter.hasNext() ? iter.next() : null;
        return ans;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

}
