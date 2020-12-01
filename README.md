# spring-boot-course-api

Repo to explore options about Spring Boot and JPA against MySQL docker image.

Steps to create Docker MySQL

    Install MYSQL docker
    > docker pull mysql
                    
    > docker run --name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 -d mysql/mysql-server
    
    > docker exec -it mysql mysql -u root -p 
    
    > use springbootCourseApi;
    
* Collection for POSTMAN
