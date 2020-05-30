
-- dump from one database to another database
C:\Program Files\PostgreSQL\9.3\bin>pg_dump -U postgres -h localhost -t osm_buildings uv_dataset | 
psql -U postgres -h localhost uvsoftgroupgeospatial
-- transform from 32632 to 4326
ALTER TABLE osm_buildings
 ALTER COLUMN geom TYPE geometry(MultiPolygon,32632) 
  USING ST_SetSRID(geom,4326);
  
--SELECT ST_AsText(ST_Transform(geom,4326)) FROM osm_buildings limit 10;
--SELECT ST_AsText(ST_Transform(ST_SetSRID(geom,32632),4326)) FROM osm_buildings;
--Select * from osm_buildings
--DELETE FROM osm_buildings WHERE name is not null and type is not null;
--ALTER TABLE osm_buildings RENAME TO osm_buildings;
--CREATE TABLE osm_buildings_filter AS SELECT * FROM osm_buildings where name IS NOT NULL limit 1000;
--DELETE FROM public.osm_buildings_filter;
--select * from public.osm_buildings_filter;
--SELECT ST_AsText(ST_Transform(ST_GeomFromText(geom,4326,4326)) As wgs_geom from osm_buildings_filter;
--select * from osm_buildings;
--SELECT ST_AsText(geom) FROM osm_buildings;
--SELECT ST_AsText (ST_Transform (geom, 4326)) AS LongLat from osm_buildings;
--SELECT ST_AsLatLonText(geom) AS LongLat from osm_buildings;


-- dump urbanmanagement database
C:\Program Files\PostgreSQL\9.3\bin>pg_dump -U postgres -h localhost -d uvsoftgroupgeospatial \
--file=L:\db\migrations\V1__uvsoftgroupgeospatial.sql
C:\Program Files\PostgreSQL\9.3\bin>pg_dump -U postgres -h localhost -d uvsoftgroupgeospatial \ 
--file=C:\springworkspace\springpostgresqlrestfulws\springpostgresqlrestfulws\src\main\resources\db\migration\V1__uvsoftgroupgeospatial.sql


-- restore urbanmanagement database into uv_dataset database
C:\Program Files\PostgreSQL\9.3\bin>psql -U postgres -h localhost -d uvsoftgroupgeospatial --file=L:\db\migrations\V1__uvsoftgroupgeospatial.sql
-- restore urbanmanagement database into uv_dataset database
C:\Program Files\PostgreSQL\9.3\bin>pg_restore -1 -U postgres -h localhost -d uvsoftgroupgeospatial --file=C:\db\migration\V1__uvsoftgroupgeospatial.sql
 -- Run the pg_restore program with the name of a database to which a connection is to be established (-d option), a role name that has the superuser privilege (-U option), the -C option to specify that the restore operation is to create a new database using the same name as the database from which the backup file was created(urbanmanagement), and the directory path to the backup file (last parameter of the command line). 
 C:\Program Files\PostgreSQL\9.3\bin>pg_restore -d postgres -U postgres -C L:\database_dump\dump_file\urban.sql
 C:\Program Files\PostgreSQL\9.3\bin>pg_restore -d uvsoftgroupgeospatial -U postgres --table=user_registration -C L:\database_dump\dump_file\user_registration.sql
 C:\Program Files\PostgreSQL\9.3\bin>psql -h localhost -d urbanmanagement -f L:\database_dump\dump_file\user_registration.sql

 C:\Program Files\PostgreSQL\9.3\bin>pg_dump -U postgres -h localhost -d uvsoftgroupgeospatial --file=L:\database_dump\dump_file\urban.sql
 --To dump list of tables(7 tables) from database(urbanmanagement). Generated SQL script(partial_database.sql).
  C:\Program Files\PostgreSQL\9.3\bin>pg_dump -U postgres \
  -h localhost \
  -d uvsoftgroupgeospatial \
  -a \
  -t user_registration \
  -t user_role \
  --file=L:\database_dump\dump_file\partial_database.sql;
  
C:\Program Files\PostgreSQL\9.3\bin>pg_dump -U postgres -h localhost -d urbanmanagement -a -t addressinfo --file=L:\database_dump\dump_file\addressinfo.sql
C:\Program Files\PostgreSQL\9.3\bin>pg_dump -U postgres -h localhost -d urbanmanagement -a -t address_location_info --file=L:\database_dump\dump_file\partial_database.sql
C:\Program Files\PostgreSQL\9.3\bin>pg_dump -U postgres -h localhost -d urbanmanagement -a -t application_role --file=L:\database_dump\dump_file\application_role.sql
C:\Program Files\PostgreSQL\9.3\bin>pg_dump -U postgres -h localhost -d urbanmanagement -a -t application_user--file=L:\database_dump\dump_file\application_user.sql
C:\Program Files\PostgreSQL\9.3\bin>pg_dump -U postgres -h localhost -d urbanmanagement -a -t application_user_application_role--file=L:\database_dump\dump_file\application_user_application_role.sql
C:\Program Files\PostgreSQL\9.3\bin>pg_dump -U postgres -h localhost -d urbanmanagement -a -t user_registration--file=L:\database_dump\dump_file\user_registration.sql
C:\Program Files\PostgreSQL\9.3\bin>pg_dump -U postgres -h localhost -d urbanmanagement -a -t lookupinfo --file=L:\database_dump\dump_file\lookupinfo.sql
C:\Program Files\PostgreSQL\9.3\bin>pg_dump -U postgres -h localhost -d urbanmanagement -a -t user_role --file=L:\database_dump\dump_file\user_role.sql
-- drop a specific database
C:\Program Files\PostgreSQL\9.3\bin>psql -U postgres -h localhost -c "drop database urbanmanagement;"
C:\Program Files\PostgreSQL\9.3\bin>psql -U postgres -h localhost -c "drop database springpostgresqlrestfulws;"
-- create a specific database
C:\Program Files\PostgreSQL\9.3\bin>psql -U postgres -h localhost -c "create database springpostgresqlrestfulws;"
-- to show all table list from uv_dataset
C:\Program Files\PostgreSQL\9.3\bin>psql -U postgres -h localhost -d uv_dataset -c "SELECT * FROM pg_catalog.pg_tables;"
-- to show only pubic table list from uv_dataset
C:\Program Files\PostgreSQL\9.3\bin>psql -U postgres -h localhost -d uv_dataset -c "SELECT * FROM pg_catalog.pg_tables where schemaname like('public') ORDER BY tablename;"
-- to show only pubic table list from uv_dataset
C:\Program Files\PostgreSQL\9.3\bin>psql -U postgres -h localhost -d uv_dataset -c "SELECT count(*) FROM pg_catalog.pg_tables WHERE schemaname like('public')"
-- to show specific table description
C:\Program Files\PostgreSQL\9.3\bin>psql -U postgres -h localhost -d uv_dataset -c "select * from INFORMATION_SCHEMA.COLUMNS where table_name = 'plot';"
-- to show database from postgres user
C:\Program Files\PostgreSQL\9.3\bin>psql -U postgres -h localhost -d uv_dataset -c "SELECT * FROM pg_database WHERE datistemplate = false ORDER BY datname;"




