package org.example.mappers;
import org.example.dto.EmployeeDto;
import org.example.models.employees;
import org.example.models.jobs;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

//@Mapper (uses = {jobsMapper.class}, imports = {java.util.UUID.class})
@Mapper (uses = {jobsMapper.class}, componentModel = "cdi")
public interface employeesMapper {
//    employeesMapper INSTANCE = Mappers.getMapper(employeesMapper.class);
//    DepartmentDto toDeptDto(Department d, Location l);
    @Mapping(source = "e.job_id",target = "job_id")
    EmployeeDto toEmpDto (employees e, jobs j );

    @Mapping(source = "e.job_id",target = "job_id")
    EmployeeDto toEmpDto (employees e );

    }
