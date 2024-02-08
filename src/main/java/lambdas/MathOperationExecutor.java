package lambdas;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class MathOperationExecutor {
    public int operate(MathOperation operation, int a, int b) {
        return operation.operate(a, b);
    }
}

