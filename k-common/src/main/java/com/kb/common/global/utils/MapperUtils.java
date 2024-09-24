package com.kb.common.global.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MapperUtils {

    private static ModelMapper mapper;

    static {
        mapper = new ModelMapper();
        mapper.getConfiguration().setSkipNullEnabled(true)
            .setMatchingStrategy(MatchingStrategies.STRICT);
    }

    public static <T> T copyProperties(Object src, Class<T> type) {
        return mapper.map(src, type);
    }

    public static void copyProperties(Object src, Object des) {
        mapper.map(src, des);
    }
}
