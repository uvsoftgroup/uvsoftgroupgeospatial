 -- create new database
 CREATE DATABASE uvsoftgroupgeospatial;
-- ######################################
-- Enabling PostGIS
 -- Enable PostGIS (includes raster)
CREATE EXTENSION postgis;
-- Enable Topology
CREATE EXTENSION postgis_topology;
-- Enable PostGIS Advanced 3D
-- and other geoprocessing algorithms
-- sfcgal not available with all distributions
CREATE EXTENSION postgis_sfcgal;
-- fuzzy matching needed for Tiger
CREATE EXTENSION fuzzystrmatch;
-- rule based standardizer
CREATE EXTENSION address_standardizer;
-- example rule data set
CREATE EXTENSION address_standardizer_data_us;
-- Enable US Tiger Geocoder
CREATE EXTENSION postgis_tiger_geocoder;

-- ######################################
--Upgrading PostGIS
-- Upgrade PostGIS (includes raster) to latest version
ALTER EXTENSION postgis UPDATE;
ALTER EXTENSION postgis_topology UPDATE;
-- to do a specific version
-- Upgrade PostGIS (includes raster)
ALTER EXTENSION postgis
 UPDATE TO "2.5.2";
-- Upgrade Topology
ALTER EXTENSION postgis_topology
 UPDATE TO "2.5.2";
-- Upgrade US Tiger Geocoder
ALTER EXTENSION postgis_tiger_geocoder
 UPDATE TO "2.5.2";

 -- ######################################
-- Spatial SQL
 -- Create table with spatial column
CREATE TABLE mytable (
  id SERIAL PRIMARY KEY,
  geom GEOMETRY(Point, 26910),
  name VARCHAR(128)
);
-- Add a spatial index
CREATE INDEX mytable_gix
  ON mytable
  USING GIST (geom);
-- Add a point
INSERT INTO mytable (geom) VALUES (
  ST_GeomFromText('POINT(0 0)', 26910)
);
 
-- Query for nearby points
SELECT id, name
FROM mytable
WHERE ST_DWithin(
  geom,
  ST_GeomFromText('POINT(0 0)', 26910),
  1000
);
 
-- ######################################
﻿-- Sequence: public.seq_geom
-- DROP SEQUENCE public.seq_geom;

CREATE SEQUENCE public.seq_geom
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 220
  CACHE 1;
ALTER TABLE public.seq_geom
  OWNER TO postgres;

-- Sequence: public.seq_plot

-- DROP SEQUENCE public.seq_plot;

CREATE SEQUENCE public.seq_plot
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 115
  CACHE 1;
ALTER TABLE public.seq_plot
  OWNER TO postgres;

CREATE SEQUENCE public.seq_building
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 200
  CACHE 1;
ALTER TABLE public.seq_building
  OWNER TO postgres;

  CREATE SEQUENCE public.seq_userrole
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 300
  CACHE 1;
ALTER TABLE public.seq_userrole
  OWNER TO postgres;

  CREATE SEQUENCE public.seq_useregistration
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 400
  CACHE 1;
ALTER TABLE public.seq_useregistration
  OWNER TO postgres;


 CREATE SEQUENCE public.seq_address
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 500
  CACHE 1;
ALTER TABLE public.seq_address
  OWNER TO postgres;


  INSERT INTO public.userregistration(
            user_registration_id, user_address_id, user_registration_cr_date, 
            user_registrationfname, user_registrationldate, user_registrationlname, 
            user_registrationmname, user_registration_name, user_registration_password, 
            user_registrationfull_name)
    VALUES ( 100,100, '2019-06-23', 'test','2019-06-23','Test', 'Test', 'Test', 'Test', 'Test');

select * from userregistration;

 DELETE FROM public.geometry_gis_info
 WHERE geo_type='GEOMETRYCOLLECTION'

 DELETE FROM public.geometry_gis_info
 WHERE geo_id in(218,221,222)
 
Select * from public.geometry_gis_info;

-- Dataset import from .shp file to the database with the opensource tool like "PostGIS Shapfile Import/Export Manager"
-- to see all roads with types
select * from roads where type='primary';
select * from roads where type='primary';
-- to create a new table with only prmary road type 
CREATE TABLE primary_roads AS select * from roads where type='primary';

SELECT nextval ('seq_useregistration') as 

CREATE TABLE roads_with_name AS select * from roads where name is not null;
select * from roads_with_name;
select * from roads; 
-- to create a new table with only prmary road type 
CREATE TABLE primary_roads AS select * from roads where type='primary';