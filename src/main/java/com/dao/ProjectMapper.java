package com.dao;
import com.entity.Project;
import com.entity.ProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectMapper {
    int countByExample(ProjectExample example);

    int deleteByExample(ProjectExample example);

    int insert(Project record);

    int insertSelective(Project record);

    List<Project> selectByExample(ProjectExample example);

    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    int add(Project project);

    Project selectByPrimaryKey(Integer projectid);

    int deleteByPrimaryKey(Integer projectid);

    int updateByPrimaryKey(Project record);

    List<Project> listByProperty(String property);

    List<Project> listByType(String type);
    //根据项目类型查找已上报的项目
    List<Project> listBysendType(String type);

    List<Project> findByTypeandProperty(String type, String property);
    //根据项目名称查找待上报的项目
    List<Project> findByName(String name);
    //根据项目名称查找已上报的项目
    List<Project> findBysendName(String name);
    //根据建设地点查找已上报的项目
    List<Project> listBySite(String site);
    //根据项目名称和建设性质查找待上报的项目
    List<Project> findByNameandProperty(String name, String property);
    //根据项目类型和项目名称查找已上报的项目
    List<Project> findBysendTypeandName(String name, String type);

    List<Project> findByTypeandName(String name, String type);
    //根据建设地点和项目名称查找已上报的项目
    List<Project> findBySiteandName(String name, String site);
    //根据项目类型和建设地点查找已上报的项目
    List<Project> findByTypeandSite(String type, String site);

    List<Project> findByNameTypeandProperty(String name, String type, String property);
    //根据项目类型和项目名称和建设地点查找已上报的项目
    List<Project> findByNameTypeandSite(String name, String type, String site);

    Project selectByName(String name);
    //根据项目名称查找项目
    List<Project> findProjectByName(String name);

    List<Project> findBysendstatus(String sendstatus);

    List<Project> findByNameandSendstatus(String name, String sendstatus);
}