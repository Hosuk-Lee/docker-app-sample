package com.kb.common.global.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FileUtils {

    public File getFile(String path){
        return new File(path);
    }

    void isDirectory(File f){
        f.isDirectory();
    }

    public static String read(String fileName){
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        // TODO CLASSPATH_URL_PREFIX not found 발생하면 prefix 붙이기 테스트 성공하면 지우기
        Resource resource = resourceLoader.getResource(fileName);
        try {
            return resource.getContentAsString(StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
