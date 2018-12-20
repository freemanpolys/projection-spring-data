# Database
Create mysql db named project.
Mysql default credential is root without pass. If different modify src/main/resources/config/application-dev.yml 

# Projection
Controller , Interface are in custom package.
Projection Interface describe the result of the JPA result by defining getters.
Repository native query must map column with underscore to camelcase one.

# Endpoint
Projection rest endpoint : http://localhost:8081/api/employee-history
