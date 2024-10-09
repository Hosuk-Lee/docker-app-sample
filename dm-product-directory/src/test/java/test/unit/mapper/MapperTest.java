package test.unit.mapper;

import hs.sample.k.apiserver.domain.productDirectory.mapper.ProductDirectoryMapper;
import hs.sample.k.apiserver.global.config.MyBatisConfig;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.ContextConfiguration;

//@RunWith(SpringRunner.class)
@MybatisTest
// 실 데이터베이스에 연결 시 필요한 어노테이션
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@Import(ProductDirectoryMapper.class)
@ContextConfiguration(classes = {MyBatisConfig.class})
class MapperTest {

    @Autowired
    private ProductDirectoryMapper mapper;

    @Test
    @DisplayName("Mapper Test")
    void mybatis_Mapper_XML_테스트() throws Exception {

        // given
        String seq = "1";

        // when
        List<Map<String, Object>> all = mapper.findAll();

        // then
//        assertThat(vo.getSeq).isEqualTo("1");

    }


}
