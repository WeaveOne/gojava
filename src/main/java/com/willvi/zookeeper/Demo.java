package com.willvi.zookeeper;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;

/**
 * @author wangwei
 * @date 2019/10/8 14:52
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        ZooKeeper zk = new ZooKeeper("122.51.7.240:2183", 3000, event -> {
            System.out.println(event.getPath());
        });

        zk.create("/testRootPath", "testRootData".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,
                CreateMode.PERSISTENT);
//         创建一个子目录节点
        zk.create("/testRootPath/testChildPathOne/test", "ww".getBytes(),
                ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println("目录节点状态：[" + zk.exists("/testRootPath/testChildPathOne/test", true) + "]");
        System.out.println(new String(zk.getData("/testRootPath/testChildPathOne/test", false, null)));
        zk.close();
    }
}
