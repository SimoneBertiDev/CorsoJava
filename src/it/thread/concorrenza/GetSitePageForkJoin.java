package it.thread.concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.RecursiveTask;

public class GetSitePageForkJoin extends RecursiveTask<String> {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public GetSitePageForkJoin(String url) {
    super();
        this.url = url;
    }

    @Override
    protected String compute() {
        try {
            URL u = new URL(url);
            URLConnection con = u.openConnection();
            InputStream inputStream = con.getInputStream();
            return Utils.getString(inputStream);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
