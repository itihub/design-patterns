package com.xxx.design.principles.singleresponsibility;

import java.nio.channels.SelectableChannel;

/**
 * @Description: 方法单一职责
 * @Author: Jimmy
 */
public class Method {


    private void updateUserInfo(String userName, String address){
        //todo something
    }

    /**单一职责方法 可变参数**/
    private void updateUserInfo(String userName, String... propertoes){
        //todo something
    }

    /**单一职责**/
    private void updateUserName(String userName){
        //todo something
    }

    /**单一职责**/
    private void updateUserAddress(String address){
        //todo something
    }

    /**非单一职责，建议拆开**/
    private void updateUserInfo(String userName, String address,boolean bool){
        if (bool){
            //todo something
        }else {
            //todo something
        }
    }
}
