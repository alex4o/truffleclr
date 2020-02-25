package util

fun <T> iterate(start: T, next: (T) -> T?): Iterable<T> {
        return object : Iterable<T> {
            override fun iterator(): Iterator<T> {
                return object : Iterator<T> {
                    var current: T = start

                    override fun hasNext(): Boolean {
                        return next(current) != null
                    }

                    override fun next(): T {
                        current = next(current)!!
                        return current
                    }

                }
            }
        }
    }