package flashsale.flashsale.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import flashsale.flashsale.domain.User;

@Mapper
public interface UserDao {

	@Select("select * from user where id=#{id}")
	public User getById(@Param("id")int id);
	
	
	@Insert("insert into User(id,name)values(#{id},#{name})")
	public int insertUser(User user);
	
}
