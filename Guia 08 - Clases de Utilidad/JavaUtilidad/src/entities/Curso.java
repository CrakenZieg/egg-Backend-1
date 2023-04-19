
package entities;

public class Curso {
    
    private String nombreCurso, turno;
    private int cantidadHorasPorDia, cantidadDiasPorSemana;
    private double percioPorHora;
    private String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, String turno, int cantidadHorasPorDia, int cantidadDiasPorSemana, double percioPorHora) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.percioPorHora = percioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }
    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }
    
    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }
    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public double getPercioPorHora() {
        return percioPorHora;
    }
    public void setPercioPorHora(double percioPorHora) {
        this.percioPorHora = percioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }
    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{ nombre: " + nombreCurso + ", turno: " + turno + ", cantidad horas por dia: " + cantidadHorasPorDia + "hs, cantidad de dias por semana: " + cantidadDiasPorSemana + " dias, precio por hora: $" + percioPorHora + ", alumnos: " + alumnos[0] +
               ", "+alumnos[1]+", "+alumnos[2]+", "+alumnos[3]+", "+alumnos[4] + '}';
    }
    
}
/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita 
un programa para organizar la información de cada curso. Para ello, crearemos 
una clase entidad llamada Curso, cuyos atributos serán: nombreCurso, 
cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  
precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 
5 (cinco), donde se alojarán los nombres de cada alumno. A continuación, se 
implementarán los siguientes métodos:
-Un constructor por defecto.
-Un constructor con todos los atributos como parámetro.
-Métodos getters y setters de cada atributo.
-Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información 
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese 
el nombre de cada alumno.
-Método crearCurso(): el método crear curso, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al 
atributo alumnos
-Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en 
una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, 
el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que 
se repite el encuentro.
*/