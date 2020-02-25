import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author chaiguanguan
 * @className SettingOutTime
 * @description
 * @date 2020/2/25 15:53
 **/
public class SettingOutTime {
    public static void main(String[] args) throws URISyntaxException {
        Logger logger = LogManager.getLogger(SettingOutTime.class);
        RequestConfig config = RequestConfig.custom().setSocketTimeout(3000).setConnectTimeout(10000).build();

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uriBuilder = new URIBuilder("http://localhost:8080/web_demo_war_exploded/hello/say.do");
        URI uri = uriBuilder.build();
        HttpGet httpGet = new HttpGet(uri);
        httpGet.setConfig(config);
        HttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
            if(response.getStatusLine().getStatusCode()== HttpStatus.SC_OK){
                System.out.println(EntityUtils.toString(response.getEntity()));
            }
        } catch (HttpHostConnectException e) {
            e.printStackTrace();
        }catch (SocketTimeoutException e2){
            logger.error(e2.getMessage());
            e2.printStackTrace();
        }catch (Exception e3){
            logger.error(e3.getMessage());
            e3.printStackTrace();
        }
            finally {
            httpGet.releaseConnection();
        }

    }
}
