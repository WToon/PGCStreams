import org.jetbrains.annotations.NotNull;
import proguard.classfile.Clazz;
import proguard.classfile.ProgramClass;
import proguard.classfile.ProgramMethod;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class ProgramClassStreamImpl
        implements ClassStream<ProgramClass>
{
    private final Stream<ProgramClass> clazzStream;

    
    public ProgramClassStreamImpl(Stream<ProgramClass> clazzStream)
    {
        this.clazzStream = clazzStream;
    }


    public ClassStream<ProgramClass> filterOnName(String name)
    {
        return new ProgramClassStreamImpl(clazzStream.filter(c -> c.getName().equals(name)));
    }


    public ClassStream<ProgramClass> filter(Predicate<? super Clazz> predicate)
    {
        return new ProgramClassStreamImpl(this.clazzStream.filter(predicate));
    }


    public MethodStream<ProgramMethod> methods()
    {
        return new MethodStreamImpl<>(clazzStream.flatMap(clazz -> Arrays.stream(clazz.methods)));
    }


    // For later.

    public <R> Stream<R> map(Function<? super Clazz, ? extends R> mapper)
    {
        return null;
    }


    public IntStream mapToInt(ToIntFunction<? super Clazz> mapper)
    {
        return null;
    }


    public LongStream mapToLong(ToLongFunction<? super Clazz> mapper)
    {
        return null;
    }


    public DoubleStream mapToDouble(ToDoubleFunction<? super Clazz> mapper)
    {
        return null;
    }


    public <R> Stream<R> flatMap(Function<? super Clazz, ? extends Stream<? extends R>> mapper)
    {
        return null;
    }


    public IntStream flatMapToInt(Function<? super Clazz, ? extends IntStream> mapper)
    {
        return null;
    }


    public LongStream flatMapToLong(Function<? super Clazz, ? extends LongStream> mapper)
    {
        return null;
    }


    public DoubleStream flatMapToDouble(Function<? super Clazz, ? extends DoubleStream> mapper)
    {
        return null;
    }


    public Stream<Clazz> distinct()
    {
        return null;
    }


    public Stream<Clazz> sorted()
    {
        return null;
    }


    public Stream<Clazz> sorted(Comparator<? super Clazz> comparator)
    {
        return null;
    }


    public Stream<Clazz> peek(Consumer<? super Clazz> action)
    {
        return null;
    }


    public Stream<Clazz> limit(long maxSize)
    {
        return null;
    }


    public Stream<Clazz> skip(long n)
    {
        return null;
    }


    public void forEach(Consumer<? super Clazz> action)
    {

    }


    public void forEachOrdered(Consumer<? super Clazz> action)
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


    public Clazz reduce(Clazz identity, BinaryOperator<Clazz> accumulator)
    {
        return null;
    }


    @NotNull
    public Optional<Clazz> reduce(BinaryOperator<Clazz> accumulator)
    {
        return Optional.empty();
    }


    public <U> U reduce(U identity, BiFunction<U, ? super Clazz, U> accumulator, BinaryOperator<U> combiner)
    {
        return null;
    }


    public <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super Clazz> accumulator, BiConsumer<R, R> combiner)
    {
        return null;
    }


    public <R, A> R collect(Collector<? super Clazz, A, R> collector)
    {
        return null;
    }


    @NotNull
    public Optional<Clazz> min(Comparator<? super Clazz> comparator)
    {
        return Optional.empty();
    }


    @NotNull
    public Optional<Clazz> max(Comparator<? super Clazz> comparator)
    {
        return Optional.empty();
    }


    public long count()
    {
        return 0;
    }


    public boolean anyMatch(Predicate<? super Clazz> predicate)
    {
        return false;
    }


    public boolean allMatch(Predicate<? super Clazz> predicate)
    {
        return false;
    }


    public boolean noneMatch(Predicate<? super Clazz> predicate)
    {
        return false;
    }


    @NotNull
    public Optional<Clazz> findFirst()
    {
        return Optional.empty();
    }


    @NotNull
    public Optional<Clazz> findAny()
    {
        return Optional.empty();
    }


    @NotNull
    public Iterator<Clazz> iterator()
    {
        return null;
    }


    @NotNull
    public Spliterator<Clazz> spliterator()
    {
        return null;
    }


    public boolean isParallel()
    {
        return false;
    }


    @NotNull
    public Stream<Clazz> sequential()
    {
        return null;
    }


    @NotNull
    public Stream<Clazz> parallel()
    {
        return null;
    }


    @NotNull
    public Stream<Clazz> unordered()
    {
        return null;
    }


    @NotNull
    public Stream<Clazz> onClose(Runnable closeHandler)
    {
        return null;
    }


    public void close()
    {

    }
}