package com.Internet;

import java.io.Serializable;

/**
 * @Author=fionajoyo
 * @Date 2021/7/8 14:53
 * @Version 1.0
 */
public class Mail implements Serializable {
    private String fromSite;
    private String toSite;
    private String contents;

    public Mail(String fromSite, String toSite, String contents) {
        this.fromSite = fromSite;
        this.toSite = toSite;
        this.contents = contents;
    }


    public void mail()
    {
        System.out.println("from"+fromSite+"  to"+toSite+"  contents:"+contents);
    }
}
