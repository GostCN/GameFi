package com.bixin.gameFi.aww.provider;

/**
 * @author zhangcheng
 * create          2021-08-24 5:40 下午
 */
public interface IGameFiProvider<T> {

    void dispatcher(T t);

}
