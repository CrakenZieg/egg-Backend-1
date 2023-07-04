/*1.Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
select codigo_oficina, ciudad from oficina;*/
/*2.Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
select ciudad, telefono from oficina where pais='España';*/
/*3.Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
select nombre, 
	case when apellido2=null then apellido1
		 else concat(apellido1,' ',apellido2)
	end 
as apellido, email from empleado where codigo_jefe=7;*/
/*4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa. 
select puesto, nombre, 
	case when apellido2=null then apellido1
		 else concat(apellido1,' ',apellido2)
	end 
as apellido, email from empleado where codigo_empleado=1;*/
/*5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas. 
select nombre, 
	case when apellido2=null then apellido1
		 else concat(apellido1,' ',apellido2)
	end 
as apellido, puesto from empleado where puesto not like 'Representante Ventas';*/
/*6. Devuelve un listado con el nombre de los todos los clientes españoles.
select concat(nombre_contacto,' ',apellido_contacto) as nombre, pais from cliente where pais='Spain';*/
/*7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
select distinct estado from pedido;*/
/*8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008. 
Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan repetidos. 
Resuelva la consulta: 
o Utilizando la función YEAR de MySQL. 
o Utilizando la función DATE_FORMAT de MySQL. 
o Sin utilizar ninguna de las funciones anteriores.*/

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
/**/
select * from pedido;