package hs.sample.k.apiserver.global.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

@Configuration
@Slf4j
public class LogInterceptor implements HandlerInterceptor {

    private static final String ACRONYM = "experiencetest";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws IOException {
        log.info("@@ Received HTTP request URL ==> {}",  request.getRequestURL());
        log.info("@@ Received HTTP request HeaderNames ==> {}", request.getHeaderNames());

//        ServletInputStream in = request.getInputStream();
//        byte[] buf = new byte[1000];
//        StringBuilder sb = new StringBuilder();
//        for (int nChunk = in.read(buf); nChunk!=-1; nChunk = in.read(buf))
//        {
//          sb.append(new String (buf,  0, nChunk));
//        }

//        log.info("@@ Request JSON Content" + sb.toString());


        // @TODO Request 객체에서 guid parse
//        MDC.put("_guid", String.valueOf(UUID.randomUUID()));
//        MDC.put("_app", ACRONYM);


        return true;
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
            Exception ex) {
        log.info("@@ afterCompletion {}",  handler);

        MDC.clear();
    }

}
