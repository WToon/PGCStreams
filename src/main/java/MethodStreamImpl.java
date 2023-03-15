import org.jetbrains.annotations.NotNull;
import proguard.classfile.Clazz;
import proguard.classfile.Method;
import proguard.classfile.ProgramMethod;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.*;
import java.util.stream.*;

public class MethodStreamImpl<T> implements MethodStream<T>
{
    private final Stream<Method> methodStream;


    public MethodStreamImpl(Stream<Method> methodStream)
    {
        this.methodStream = methodStream;
    }


    public MethodStream<T> filterOnName(String name, Clazz clazz)
    {
        return new MethodStreamImpl<>(methodStream.filter(method -> name.equals(method.getName(clazz))));
    }


    public MethodStream<ProgramMethod> filter(Predicate<? super Method> predicate)
    {
        return new MethodStreamImpl<>(this.methodStream.filter(predicate));
    }


    // For later.

    public <R> Stream<R> map(Function<? super Method, ? extends R> mapper)
    {
        return null;
    }


    public IntStream mapToInt(ToIntFunction<? super Method> mapper)
    {
        return null;
    }


    public LongStream mapToLong(ToLongFunction<? super Method> mapper)
    {
        return null;
    }


    public DoubleStream mapToDouble(ToDoubleFunction<? super Method> mapper)
    {
        return null;
    }


    public <R> Stream<R> flatMap(Function<? super Method, ? extends Stream<? extends R>> mapper)
    {
        return null;
    }


    public IntStream flatMapToInt(Function<? super Method, ? extends IntStream> mapper)
    {
        return null;
    }


    public LongStream flatMapToLong(Function<? super Method, ? extends LongStream> mapper)
    {
        return null;
    }


    public DoubleStream flatMapToDouble(Function<? super Method, ? extends DoubleStream> mapper)
    {
        return null;
    }


    public Stream<Method> distinct()
    {
        return null;
    }


    public Stream<Method> sorted()
    {
        return null;
    }


    public Stream<Method> sorted(Comparator<? super Method> comparator)
    {
        return null;
    }


    public Stream<Method> peek(Consumer<? super Method> action)
    {
        return null;
    }


    public Stream<Method> limit(long maxSize)
    {
        return null;
    }


    public Stream<Method> skip(long n)
    {
        return null;
    }


    public void forEach(Consumer<? super Method> action)
    {

    }


    public void forEachOrdered(Consumer<? super Method> action)
    {

    }


    @NotNull
    public Object[] toArray()
    {
        return new Object[0];
    }


    @NotNull
    public <A> A[] toArray(IntFunction<A[]> generator)
    {
        return null;
    }


    public Method reduce(Method identity, BinaryOperator<Method> accumulator)
    {
        return null;
    }


    @NotNull
    public Optional<Method> reduce(BinaryOperator<Method> accumulator)
    {
        return Optional.empty();
    }


    public <U> U reduce(U identity, BiFunction<U, ? super Method, U> accumulator, BinaryOperator<U> combiner)
    {
        return null;
    }


    public <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super Method> accumulator, BiConsumer<R, R> combiner)
    {
        return null;
    }


    public <R, A> R collect(Collector<? super Method, A, R> collector)
    {
        return null;
    }


    @NotNull
    public Optional<Method> min(Comparator<? super Method> comparator)
    {
        return Optional.empty();
    }


    @NotNull
    public Optional<Method> max(Comparator<? super Method> comparator)
    {
        return Optional.empty();
    }


    public long count()
    {
        return 0;
    }


    public boolean anyMatch(Predicate<? super Method> predicate)
    {
        return false;
    }


    public boolean allMatch(Predicate<? super Method> predicate)
    {
        return false;
    }


    public boolean noneMatch(Predicate<? super Method> predicate)
    {
        return false;
    }


    @NotNull
    public Optional<Method> findFirst()
    {
        return Optional.empty();
    }


    @NotNull
    public Optional<Method> findAny()
    {
        return Optional.empty();
    }


    @NotNull
    public Iterator<Method> iterator()
    {
        return null;
    }


    @NotNull
    public Spliterator<Method> spliterator()
    {
        return null;
    }


    public boolean isParallel()
    {
        return false;
    }


    @NotNull
    public Stream<Method> sequential()
    {
        return null;
    }


    @NotNull
    public Stream<Method> parallel()
    {
        return null;
    }


    @NotNull
    public Stream<Method> unordered()
    {
        return null;
    }


    @NotNull
    public Stream<Method> onClose(Runnable closeHandler)
    {
        return null;
    }


    public void close()
    {

    }
}
