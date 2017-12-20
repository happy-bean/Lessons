package lesson6_test.Master_Slave;

import java.util.concurrent.Future;

/*
* @param <T> 子任务类型
*@param <V> 子任务处理结果类型
*/
public interface SlaveSpec<T,V> {
    /*
    * 用于master向其提交一个子任务
    * task 子任务
    * */
    Future<V> submit(final T task) throws InterruptedException;

    /*
    * 初始化slave 实例提供的服务
    * */

    void init();

    /*
    * 停止　slave 实例对外提供的服务
    * */

    void shutdown();
}
