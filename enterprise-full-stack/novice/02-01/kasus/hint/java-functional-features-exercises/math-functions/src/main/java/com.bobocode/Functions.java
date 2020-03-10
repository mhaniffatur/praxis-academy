package com.bobocode;

public class Functions {
    /**
     * A static factory method that creates an integer function map with basic functions:
     * - abs (absolute value)
     * - sgn (signum function)
     * - increment
     * - decrement
     * - square
     *
     * @return an instance of {@link FunctionMap} that contains all listed functions
     */
    public static FunctionMap<Integer, Integer> intFunctionMap() {
        FunctionMap<Integer, Integer> intFunctionMap = new FunctionMap<>();

        intFunctionMap.addFunction("square", n -> n * n);
        intFunctionMap.addFunction("abs", Math::abs);
        intFunctionMap.addFunction("increment", n -> n + 1);
        intFunctionMap.addFunction("decrement", n -> n - 1);
        intFunctionMap.addFunction("sgn", n -> (n != 0) ? n / abs(n) : 0);


        return intFunctionMap;
    }
}
