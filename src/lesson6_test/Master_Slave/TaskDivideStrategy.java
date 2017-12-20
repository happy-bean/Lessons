package lesson6_test.Master_Slave;
/*对原始任务分解算法策略的抽象*/
public interface TaskDivideStrategy<T> {
    /*返回下一个子任务，若返回值为null，则表示无后续子任务*/
    T nextChunk();
}
