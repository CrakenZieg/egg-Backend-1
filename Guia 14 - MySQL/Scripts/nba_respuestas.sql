/*1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente 
select Nombre from jugadores order by nombre asc;*/
/*2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.
select nombre, posicion, peso from jugadores where posicion='c' and peso>200 order by nombre asc; */
/*3. Mostrar el nombre de todos los equipos ordenados alfabéticamente 
select nombre from equipos order by nombre asc;*/
/*4. Mostrar el nombre de los equipos del este (East).
select nombre from equipos where conferencia='east';*/
/*5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
select nombre from equipos where nombre like 'c%' order by nombre asc;*/
/*6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
select * from jugadores join equipos on jugadores.Nombre_equipo=equipos.Nombre order by equipos.nombre;*/
/*7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
select * from jugadores where Nombre_equipo='Raptors' order by nombre;*/
/*8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
select Puntos_por_partido from estadisticas where jugador=(select codigo from jugadores where nombre='Pau Gasol');
select Puntos_por_partido, nombre from estadisticas join jugadores on jugadores.codigo=estadisticas.jugador where jugador=(select codigo from jugadores where nombre='Pau Gasol');*/
/*9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
select Puntos_por_partido from estadisticas where jugador=(select codigo from jugadores where nombre='Pau Gasol') and temporada='04/05';*/
/*10. Mostrar el número de puntos de cada jugador en toda su carrera.
select count(equipo_local) from partidos where equipo_local='raptors' and temporada='98/99';*/
select count(equipo_visitante)+count(equipo_local) as partidos_por_temporada,equipos.nombre from partidos join equipos on equipos.nombre = partidos.equipo_local where temporada='05/06' group by equipos.nombre;
select distinct temporada from estadisticas limit 100;
select * from estadisticas limit 30000;
select j.nombre, sum(e.puntos_por_partido*58) from jugadores as j join estadisticas as e on j.codigo=e.jugador group by j.Nombre;
/**/
/**/
/**/
/**/
/**/
/**/
/**/
/**/
/**/
/**/
select * from estadisticas limit 100000;
select j.nombre, sum(e.puntos_por_partido) as puntos 
from jugadores j, estadisticas e 
where j.CODIGO = e.jugador 
group by j.nombre 
order by j.nombre;
