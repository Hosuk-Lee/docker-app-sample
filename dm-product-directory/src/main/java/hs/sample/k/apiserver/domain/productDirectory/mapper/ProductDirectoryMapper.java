package hs.sample.k.apiserver.domain.productDirectory.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

/*
 *
- Controller -> Service -> Repository -> mapper.xml
- Controller -> Service -> Repository -> Mapper -> mapper.xml
- Controller -> Service -> Mapper -> mapper.xml
 */
@Mapper
public interface ProductDirectoryMapper {

//    @Insert("insert into Member(user_id, name, password) values(#{userId},#{name},#{password})")
//    @Options(useGeneratedKeys = true, keyProperty = "memberId")
//    public int save(Member member);

//    @Select("select * from Member where member_id = #{memberId}")
    // @Results({
    // @Result(property = "memberId", column = "member_id"),
    // @Result(property = "userId", column = "user_id")
    // })
//    public Member findOneById(Long memberId);


    List<Map<String,Object>> findAll();
}
