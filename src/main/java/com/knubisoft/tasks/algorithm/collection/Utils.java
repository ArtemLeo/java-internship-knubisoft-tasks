package com.knubisoft.tasks.algorithm.collection;

import org.apache.commons.collections4.comparators.ComparatorChain;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * TODO implement class and tests
 */
public interface Utils {

    /**
     * Inverts the supplied map returning a new HashMap such that the keys of
     * the input are swapped with the values.
     * <p>
     * This operation assumes that the inverse mapping is well defined.
     * If the input map had multiple entries with the same value mapped to
     * different keys, the returned map will map one of those keys to the
     * value, but the exact key which will be mapped is undefined.
     *
     * @param <K>  the key type
     * @param <V>  the value type
     * @param map  the map to invert, may not be null
     * @return a new HashMap containing the inverted data
     * @throws NullPointerException if the map is null
     */
    <K, V> Map<V, K> invertMap(final Map<K, V> map);

    /**
     * Returns a new list containing the second list appended to the
     * first list.  The {@link List#addAll(Collection)} operation is
     * used to append the two given lists into a new list.
     *
     * @param <E> the element type
     * @param list1  the first list
     * @param list2  the second list
     * @return a new list containing the union of those lists
     * @throws NullPointerException if either list is null
     */
    <E> List<E> union(final List<? extends E> list1, final List<? extends E> list2);

    /**
     * Tests two lists for value-equality as per the equality contract in
     * {@link java.util.List#equals(java.lang.Object)}.
     * <p>
     * This method is useful for implementing <code>List</code> when you cannot
     * extend AbstractList. The method takes Collection instances to enable other
     * collection types to use the List implementation algorithm.
     * <p>
     * The relevant text (slightly paraphrased as this is a static method) is:
     * <blockquote>
     * Compares the two list objects for equality.  Returns
     * {@code true} if and only if both
     * lists have the same size, and all corresponding pairs of elements in
     * the two lists are <i>equal</i>.  (Two elements {@code e1} and
     * {@code e2} are <i>equal</i> if <code>(e1==null ? e2==null :
     * e1.equals(e2))</code>.)  In other words, two lists are defined to be
     * equal if they contain the same elements in the same order.  This
     * definition ensures that the equals method works properly across
     * different implementations of the {@code List} interface.
     * </blockquote>
     *
     * <b>Note:</b> The behaviour of this method is undefined if the lists are
     * modified during the equals comparison.
     *
     * @see java.util.List
     * @param list1  the first list, may be null
     * @param list2  the second list, may be null
     * @return whether the lists are equal by value comparison
     */
    boolean isEqualList(final Collection<?> list1, final Collection<?> list2);


    /**
     * Returns a synchronized map backed by the given map.
     * <p>
     * You must manually synchronize on the returned buffer's iterator to
     * avoid non-deterministic behavior:
     *
     * <pre>
     * Map m = MapUtils.synchronizedMap(myMap);
     * Set s = m.keySet();  // outside synchronized block
     * synchronized (m) {  // synchronized on MAP!
     *     Iterator i = s.iterator();
     *     while (i.hasNext()) {
     *         process (i.next());
     *     }
     * }
     * </pre>
     *
     * @param <K>  the key type
     * @param <V>  the value type
     * @param map  the map to synchronize, must not be null
     * @return a synchronized map backed by the given map
     */
    <K, V> Map<K, V> synchronizedMap(final Map<K, V> map);

    /**
     * Returns a {@link Collection} containing the exclusive disjunction
     * (symmetric difference) of the given {@link Iterable}s.
     * <p>
     * The cardinality of each element <i>e</i> in the returned
     * {@link Collection} will be equal to
     * <code>max(cardinality(<i>e</i>,<i>a</i>),cardinality(<i>e</i>,<i>b</i>)) - min(cardinality(<i>e</i>,<i>a</i>),
     * cardinality(<i>e</i>,<i>b</i>))</code>.
     * </p>
     * <p>
     * This is equivalent to
     * {@code {@link #subtract subtract}({@link #union union(a,b)},{@link #intersection intersection(a,b)})}
     * or
     * {@code {@link #union union}({@link #subtract subtract(a,b)},{@link #subtract subtract(b,a)})}.
     * </p>
     *
     * @param a the first collection, must not be null
     * @param b the second collection, must not be null
     * @param <O> the generic type that is able to represent the types contained
     *        in both input collections.
     * @return the symmetric difference of the two collections
     */
    <O> Collection<O> disjunction(final Iterable<? extends O> a, final Iterable<? extends O> b);

    /**
     * Returns a new {@link Collection} containing {@code <i>a</i> - <i>b</i>}.
     * The cardinality of each element <i>e</i> in the returned {@link Collection}
     * will be the cardinality of <i>e</i> in <i>a</i> minus the cardinality
     * of <i>e</i> in <i>b</i>, or zero, whichever is greater.
     *
     * @param a  the collection to subtract from, must not be null
     * @param b  the collection to subtract, must not be null
     * @param <O> the generic type that is able to represent the types contained
     *        in both input collections.
     * @return a new collection with the results
     * @see Collection#removeAll
     */
    <O> Collection<O> subtract(final Iterable<? extends O> a, final Iterable<? extends O> b);

    /**
     * Gets a comparator that compares using an array of {@link Comparator}s, applied
     * in sequence until one returns not equal or the array is exhausted.
     *
     * @param <E>  the object type to compare
     * @param comparators  the comparators to use, not null or empty or containing nulls
     * @return a {@link ComparatorChain} formed from the input comparators
     * @throws NullPointerException if comparators array is null or contains a null
     * @see ComparatorChain
     */
    public <E> Comparator<E> chainedComparator(final Comparator<E>... comparators);

    /**
     * Returns {@code true} iff <i>a</i> is a sub-collection of <i>b</i>,
     * that is, iff the cardinality of <i>e</i> in <i>a</i> is less than or
     * equal to the cardinality of <i>e</i> in <i>b</i>, for each element <i>e</i>
     * in <i>a</i>.
     *
     * @param a the first (sub?) collection, must not be null
     * @param b the second (super?) collection, must not be null
     * @return <code>true</code> iff <i>a</i> is a sub-collection of <i>b</i>
     */
    boolean isSubCollection(final Collection<?> a, final Collection<?> b);
}
