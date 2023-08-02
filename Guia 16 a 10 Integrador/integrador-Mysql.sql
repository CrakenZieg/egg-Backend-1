-- A: clave: 14043 pos: 2

select sum(Peso)
from jugadores j join equipos e on j.Nombre_equipo = e.Nombre
where e.Conferencia = 'East' and j.Posicion like '%C%';

select count(1) from estadisticas
where Asistencias_por_partido = (select max(Asistencias_por_partido)
from estadisticas);

-- B: clave: 3480 pos: 3

select count(1) from partidos where temporada like '%99%';

select count(1) from estadisticas where Asistencias_por_partido >(
select count(1) from jugadores where Nombre_equipo = 'heat');

-- C: clave: 631 pos: 1

select floor(avg(puntos_por_partido) + count(asistencias_por_partido) +
sum(tapones_por_partido)) as suma
from estadisticas es join jugadores j on es.jugador = j.codigo join equipos eq on
j.Nombre_equipo = eq.Nombre
where eq.Division like 'central';

select ((select count(1) from jugadores j join equipos e on j.Nombre_equipo = e.Nombre
where ((j.Procedencia like 'Michigan') and (e.Conferencia like 'West')))/(select count(1) from
jugadores where peso>=195)) + 0.9945 as c;

-- D: clave: 191 pos: 4

select floor(sum(Puntos_por_partido)) from estadisticas e
join jugadores j on e.jugador = j.codigo where j.Procedencia like 'argentina';

select round(Tapones_por_partido) from estadisticas e
join jugadores j on e.jugador = j.codigo where j.nombre like 'Corey Maggette' and
temporada like '00/01';
