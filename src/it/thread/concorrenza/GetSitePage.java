package it.thread.concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetSitePage extends Thread{
    private String url;
    private String content;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public GetSitePage(String url) {
        super();
        this.url = url;
    }

    @Override
    public void run() {
        try {
            URL u = new URL(url);
            URLConnection con = u.openConnection();
            InputStream inputStream = con.getInputStream();
            setContent(Utils.getString(inputStream));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
