/*1. select nombre from producto;*/
/*2. select nombre, precio from producto;*/
/*3. select * from producto;*/
/*4. select nombre,round(precio) from producto;*/
/*5. select fabricante.codigo, fabricante.nombre, producto.nombre from fabricante right join producto on fabricante.codigo = producto.codigo_fabricante;*/
/*6. select distinct fabricante.codigo, fabricante.nombre from fabricante right join producto on fabricante.codigo = producto.codigo_fabricante;*/
/*7. select nombre from fabricante*/
/*9. select * from fabricante limit 5 */
/*10. select nombre, precio from producto order by precio limit 1*/
/*11. select nombre, precio from producto order by precio desc limit 1*/
/*12. select nombre, precio from producto where precio<=120*/
/*13. select nombre, precio from producto order by precio between 60 and 200*/
/*14. select nombre from fabricante where codigo in (1,3,5)*/
/*15. select nombre from producto where nombre like '%portatil%'*/
/*Consultas Multitabla*/
/*1. select producto.codigo, producto.nombre, fabricante.codigo, fabricante.nombre from producto join fabricante on producto.codigo_fabricante=fabricante.codigo*/
/*2. select p.nombre, p.precio, f.nombre from producto as p join fabricante as f on p.codigo_fabricante = f.codigo order by f.nombre*/
/*3. select p.nombre, p.precio, f.nombre from producto as p join fabricante as f on p.codigo_fabricante = f.codigo order by p.precio limit 1*/
/*4. select p.nombre, p.precio, f.nombre from producto as p join fabricante as f on p.codigo_fabricante = f.codigo where f.nombre='lenovo'*/
/*5. select p.nombre, p.precio, f.nombre from producto as p join fabricante as f on p.codigo_fabricante = f.codigo where f.nombre='crucial' and p.precio>200*/
/*6. select p.nombre, p.precio, f.nombre from producto as p join fabricante as f on p.codigo_fabricante = f.codigo where f.nombre in ('Asus', 'Hewlett-Packard')*/
/*7. select p.nombre, p.precio, f.nombre from producto as p join fabricante as f on p.codigo_fabricante = f.codigo where p.precio>=180 order by p.precio desc, p.nombre asc*/
/*Consultas Multitabla LEFT JOIN y RIGHT JOIN*/
/*1. select f.nombre, f.codigo, p.codigo_fabricante, p.nombre, p.precio from fabricante as f left join producto as p on f.codigo = p.codigo_fabricante;*/
/*2. select f.nombre from fabricante as f where f.codigo not in (select p.codigo_fabricante from fabricante as f right join producto as p on f.codigo = p.codigo_fabricante);*/
/*Con operadores básicos de comparación*/
/*1. select * from producto where codigo_fabricante=(select codigo from fabricante where nombre='lenovo');*/
/*2. select * from producto where precio=(select max(precio) from producto where codigo_fabricante=(select codigo from fabricante where nombre='lenovo'));*/
/*3. select * from producto where precio=(select max(precio) from producto where codigo_fabricante=(select codigo from fabricante where nombre='lenovo')) and (select distinct codigo_fabricante from producto where codigo_fabricante=(select codigo from fabricante where nombre='lenovo'));*/
/*4. select * from producto where (codigo_fabricante=(select codigo from fabricante where nombre='Asus') and precio<(select avg(precio) from producto));*/ 
/*Subconsultas con IN y NOT IN*/
/*1. select f.nombre from fabricante as f where f.codigo in (select p.codigo_fabricante from fabricante as f right join producto as p on f.codigo = p.codigo_fabricante);*/
/*2. select f.nombre from fabricante as f where f.codigo not in (select p.codigo_fabricante from fabricante as f right join producto as p on f.codigo = p.codigo_fabricante);*/
/*Subconsultas (En la cláusula HAVING)*/
/*1. select f.nombre from producto as p join fabricante as f on p.codigo_fabricante = f.codigo group by f.nombre having count(f.nombre)=
	(select count(f.nombre) from producto as p join fabricante as f on p.codigo_fabricante = f.codigo where f.nombre='lenovo');*/


