package com.willvi.rxjava;

import io.reactivex.rxjava3.core.*;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @author wangwei
 * @date 2019/9/26 9:26
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        buffer();
        Thread.sleep(100000);
    }
    public static void hello(String... args) {
        Flowable.fromArray(args).subscribe(s -> System.out.println("Hello " + s + "!"));
    }
    public static void createObservables(){
        Observable<String> observable = Observable.create(e -> {
            e.onNext("Hello Observer");
            e.onComplete();
        });
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable disposable) {
                System.out.println("onSubscribe");
            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext " + s);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };
        observable.subscribe(observer);
        observable.subscribe(observer);
    }

    public static void just() {
        // 发送事件不能超过10次
        Observable.just(1,2,3,4,5,6,7,8,9).subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable disposable) {
                System.out.println("onSubscribe");
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("onNext + " + integer);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        });
    }
    public static void future() throws Exception{
        FutureTask< String > futureTask = new FutureTask <> (new Callable< String >() {
            @Override
            public String call() throws Exception {
                return "返回结果";
            }
        });

        Observable.fromFuture(futureTask)
                .doOnSubscribe(disposable -> futureTask.run())
                .subscribe(s -> System.out.println(s));
        System.out.println(futureTask.get());
    }
    public static void timer() {
        Observable.timer(2, TimeUnit.SECONDS).subscribe(new Observer<Long>() {
            @Override
            public void onSubscribe(Disposable disposable) {

            }

            @Override
            public void onNext(Long aLong) {
                System.out.println("onNext " + aLong);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
    public static void interval() {
        Observable.interval(2, TimeUnit.SECONDS).subscribe(new Observer<Long>() {
            @Override
            public void onSubscribe(Disposable disposable) {
                System.out.println("onSubscribe");
            }

            @Override
            public void onNext(Long aLong) {
                System.out.println("onNext " + aLong);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        });
    }
    public static void buffer(){
        Observable.just(1, 2, 3, 4, 5)
                .buffer(2, 2)
                .subscribe(new Observer <List< Integer >> () {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List < Integer > integers) {
                        System.out.println("缓冲区大小     " +  integers.size());
                        for (Integer i: integers) {
                            System.out.println("元素     "  + i);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
