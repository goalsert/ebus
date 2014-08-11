package ebus.mapping;

import ebus.model.User;
import ebus.model.UserExample;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    @Insert("insert into user (id, name, email, \n" +
            "      pwd, createDate, photo_id, \n" +
            "      graphId)\n" +
            "    values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, \n" +
            "      #{pwd,jdbcType=VARCHAR}, #{createdate,jdbcType=TIMESTAMP}, #{photoId,jdbcType=INTEGER}, \n" +
            "      #{graphid,jdbcType=LONGVARCHAR})")
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}