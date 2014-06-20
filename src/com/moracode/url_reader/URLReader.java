package com.moracode.url_reader;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by Luke on 6/12/2014.
 */
public class URLReader {
    public static void main(String[] args) throws IOException {
        URLReaderForm mainForm = new URLReaderForm();
        mainForm.displaySourceTextPane.setText(getUrlSourceCode("http://www.woodlanddirect.com"));
    }
    public static String getUrlSourceCode(String url) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(url);
        CloseableHttpResponse response = httpclient.execute(httpget);

        String sourceCode = "";
        try {
            sourceCode = EntityUtils.toString(response.getEntity());
        } finally {
            response.close();
        }

        return sourceCode;
    }
}
